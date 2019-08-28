import java.util.*;
public class Alumno {

   private int edad;
   private String nombre;
   private ArrayList<Integer> notas = new ArrayList<Integer>();
   


   public Alumno(int edadX , String nombreX, ArrayList<Integer> notasX){

       this.edad=edadX;
       this.nombre=nombreX;
       this.notas=notasX;
   }

   public float getEdad(){
       return this.edad;
   }

   public String getNombre(){
       return this.nombre;
   }

   public String getNotas(){
       return this.notas;
   }

   public void setEdad(String edadX ){
        this.edad = edadX;
   }


   public void setNombre(String nombreX){
       this.nombre = nombreX;
       }

   
   public void setMaterial(ArrayList<Integer> notasX){
        this.notas = notasX;
   }

}