public class Mesa {

   private float peso;
   private String color;
   private String material;


   public Mesa(float pesoX , String colorX, String materialX){

       this.peso=pesoX;
       this.color=colorX;
       this.material=materialX;
   }

   public float getPeso(){
       return this.peso;
   }

   public String getColor(){
       return this.color;
   }

   public String getMaterial(){
       return this.material;
   }

   public void setPeso(Experimento exp ){
       this.peso = pesoX;
       }

   public void setColor(String colorX ){
        this.color = colorX;
   }

   public void setMaterial(String colorX ){
        this.material = materialX;
   }

}