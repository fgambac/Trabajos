import  java.util.*;

public class Mochila {

   private ArrayList<Elemento> elem = new ArrayList<Elemento>();
   
   


   public Mochila(float precioX , String marcaX){

       this.precio=precioX;
       this.marca=marcaX;
       
   }

   public float getPrecio(){
       return this.precio;
   }

   public String getMarca(){
       return this.marca;
   }


   public void setPrecio(float precioX){
       this.precio = precioX;
       }

   public void setMarca(String marcaX ){
        this.marca = marcaX;
   }

}