
import java.util.ArrayList;

public class Plato {

    private int numPedido;
    private int numMesa;
    private String nombre; 
    private int cantidad;
    private int fecha;


    //CONSTRUCTORES    

    public Plato(int numPedidoX , int numMesaX, String nombreX, int cantidadX, int fechaX){

        this.numPedido = numPedidoX; 
        this.numMesa = numMesaX;
        this.nombre = nombreX;
        this.cantidad = cantidadX;
        this.fecha = fechaX;

    }

    //SETTERS


    public void setNumPedido(int numPedidoX){
        this.numPedido = numPedidoX; 
    }

    public void setNombre(String nombreX){
        this.nombre = nombreX; 
    }

    public void setCantidad(int cantidadX){
        this.cantidad = cantidadX; 
    }

    public void setNumMesa(int numMesaX){
        this.numMesa = numMesaX; 
    }
    public void setFecha(int fechaX){
        this.fecha = fechaX; 
    }
    

    //GETTERS
    
    public int getNumPedido(){
        return this.numPedido; 

    }

    public String getNombre(){
        return this.nombre; 

    }

    public int getCantidad(){
        return this.cantidad; 
    }
    
    public int getNumMesa(){
        return this.numMesa; 
    }
    
    public int getFecha(){
        return this.fecha; 
    }

}