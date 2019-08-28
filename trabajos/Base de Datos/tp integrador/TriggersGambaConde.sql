1.borrarPreguntas: Antes de borrar una fila en la tabla de publicación borra todas las preguntas en
la tabla de preguntas.
2. Calificar: Despues de hacer un update en la tabla venta verifica que la calificación del vendedor y
del comprador sea distinta de null. Si es asi actualiza con esos datos la calificación del usuario en
base a la calificación de esa venta.
3. cambiarCategoria: Despues de insertar en la tabla de venta actualiza la categoría de usuario.


1)CREATE TRIGGER before_Publicacion_delete
		BEFORE DELETE ON Publicacion
		FOR EACH ROW
	BEGIN
		delete from comentarios where idPublicacion=OLD.idPublicacion;

	END$$



CREATE TRIGGER after_Transaccion_update
		AFTER Update ON Transaccion
		FOR EACH ROW
	BEGIN

	declare rep int;
	declare rep2 int;

	select calificacionComprador, calificacionVendedor from Transaccion into rep, rep2 where idTransaccion=OLD.idTransaccion;

	if(calificaciónVendedor is null ) then 

		update Usuario 

		set reputacion=reputacion+(rep/(select count(idUsuario) from Transaccion join Publicacion using(idPublicacion) where idUsuario=idVendedor )) 

	elseif(calificaciónVendedor is null ) then

		set reputacion=(reputacion+rep2/(select count(idUsuario) from Transaccion where idUsuario=idComprador)) 

	end if;

	END$$


CREATE TRIGGER before_Producto_update
		BEFORE UPDATE ON Producto
		FOR EACH ROW
	BEGIN
		insert into productoaudit
		set action="update"; 
		idProductoAudit=OLD.idProducto, 
		nombre=OLD.nombre, 
		descripcion=OLD.descripcion, 
		precio=OLD.precio, 	
		fechacambio= NOW();

	END$$



CREATE DEFINER=`root`@`localhost` FUNCTION `averageCat`(idCat INT) RETURNS int(11)
BEGIN
declare promedio double;

select Sum(producto.precio)/count(producto.idProducto) from producto join publicacion using(idProducto) where publicacion.idCategoria=idCat into promedio;
RETURN promedio;
END

CREATE DEFINER=`root`@`localhost` FUNCTION `eliminarPublicacion`(idPublicacionX int(11),idUsuarioX int(11)) RETURNS varchar(50) CHARSET utf8
BEGIN
	DECLARE idVendedorX int(11);
    DECLARE resp varchar(50) default=' ';
    select idVendedor into idVendedorX from publicacion where idVendedor=idUsuarioX; 
	if idVendedorX is not null then
		delete from publicacion where idPublicacion=idPublicacionX;
        set resp="Se ha borrado la publicacion exitosamente";
	elseif idVendedorX is null then 
		set resp="El usuario no corresponde con el vendedor";
	end if;
	return resp;
END