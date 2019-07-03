package habitacion.silla;

public class Silla {

   protected float peso;
   protected String color;
   protected String material;



   public float getPeso(){
       return this.peso;
   }

   public String getColor(){
       return this.color;
   }

   public String getMaterial(){
       return this.material;
   }

   public void setPeso(float pesoX){
       this.peso = pesoX;
       }

   public void setColor(String colorX ){
        this.color = colorX;
   }

   public void setMaterial(String materialX ){
        this.material = materialX;
   }

}