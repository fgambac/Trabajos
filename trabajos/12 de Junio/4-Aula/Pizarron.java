import java.util.*;
public class Pizarron {

   private String marca;
   private boolean hayTiza;


   public Pizarron(String marcaX, boolean hayTizaX){

       this.marca=marcaX;
       this.hayTiza=hayTizaX;
   }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getHayTiza() {
        return this.hayTiza;
    }

    public void setHayTiza(boolean hayTiza) {
        this.hayTiza = hayTiza;
    }
}