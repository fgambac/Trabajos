
import java.util.ArrayList;
public class test{

    public static void main(String[] args){
            int valorEsperado=0;
            int valorObtenido=0;
            boolean valorEsperado1;
            boolean valorObtenido1;

            Mesa mesa1 = new Mesa();
            Mesa mesa2 = new Mesa();
            Mesa mesa3 = new Mesa();
            Mesa mesa4 = new Mesa();
            Mesa mesa5 = new Mesa();
                      

            Restaurante sucursal1 = new Restaurante();

            sucursal1.agregarMesa(mesa1);
            sucursal1.agregarMesa(mesa2);
            sucursal1.agregarMesa(mesa3);
            sucursal1.agregarMesa(mesa4);
            sucursal1.agregarMesa(mesa5);


            Plato p1 = new Plato();
            p1.setNombre("Milanesa con puré de papá real");
            p1.setNumDeMesa(3);
            p1.setNumeroPedido(1);
            p1.setCantidad(1);
            mesa3.agregarPedidoDeClienteActual(p1);
            sucursal1.agregarPlatoAPreparar(p1);

            Plato p2 = new Plato();
            p2.setNombre("Rosca de Pascua");
            p2.setNumDeMesa(2);
            p2.setNumerPedido(2);
            p2.setCantidad(3);
            mesa2.agregarPedidoDeClienteActual(p2);
            sucursal1.agregarPlatoAPreparar(p2);

            Plato p3 = new Plato();
            p3.setNombre("Muzarelitas");
            p3.setNumDeMesa(2);
            p3.numeroPedido(3);
            p3.cantidad(1);
            mesa2.agregarPedidoDeClienteActual(p3);
            sucursal1.agregarPlatoAPreparar(p3);



    System.out.println Registros(" TEST registros.");
            p1.setNombre("Milanesa con puré de papá real");
            p1.setNumDeMesa(3);
            p1.setNumeroPedido(1);
            p1.setCantidad(1); 
            p1.setFecha(1);
            valorEsperado1 = (3,1,1,1);
            valorObtenido1 = mostrarRegistros();
        System.out.println((valorEsperado==valorObtenido)?"Pasó el test.\n":"No pasó el test.\n");

    System.out.println(" TEST igualA125. Caso con entrada!=125");
           cine1.setEntrada(200);
           cine1.setCantSalas(5);
           cine1.setCantPelis(10);
           cine1.setZona(1);
           
            valorEsperado1 = true;
            valorObtenido1 = cine1.igualA125();
        System.out.println((valorEsperado==valorObtenido)?"Pasó el test.\n":"No pasó el test.\n");
    
    System.out.println(" TEST salasIgualAPelis. Caso con salas iguales a pelis");
           cine1.setEntrada(125);
           cine1.setCantSalas(10);
           cine1.setCantPelis(10);
           cine1.setZona(1);
           
            valorEsperado1 = true;
            valorObtenido1 = cine1.salasIgualAPelis();
        System.out.println((valorEsperado==valorObtenido)?"Pasó el test.\n":"No pasó el test.\n");

    System.out.println(" TEST salasIgualAPelis. Caso con salas distintas a pelis");
           cine1.setEntrada(125);
           cine1.setCantSalas(10);
           cine1.setCantPelis(50);
           cine1.setZona(1);
          
            valorEsperado1 = true;
            valorObtenido1 = cine1.salasIgualAPelis();
        System.out.println((valorEsperado==valorObtenido)?"Pasó el test.\n":"No pasó el test.\n");


    System.out.println(" TEST mismaZona. Caso con misma zona");
           cine1.setEntrada(125);
           cine1.setCantSalas(10);
           cine1.setCantPelis(10);
           cine1.setZona(1);
           cine2.setEntrada(125);
           cine2.setCantSalas(5);
           cine2.setCantPelis(10);
           cine2.setZona(1);
            valorEsperado1 = true;
            valorObtenido1 = cine1.mismaZona(cine2);
        System.out.println((valorEsperado==valorObtenido)?"Pasó el test.\n":"No pasó el test.\n");

    System.out.println(" TEST mismaZona. Caso con distinta zona");
           cine1.setEntrada(125);
           cine1.setCantSalas(10);
           cine1.setCantPelis(10);
           cine1.setZona(2);
           cine2.setEntrada(125);
           cine2.setCantSalas(5);
           cine2.setCantPelis(10);
           cine2.setZona(1);
            valorEsperado1 = false;
            valorObtenido1 = cine1.mismaZona(cine2);
        System.out.println((valorEsperado==valorObtenido)?"Pasó el test.\n":"No pasó el test.\n");



    }

}