import java.util.*;
public class Escritorio {

   private int edad;
   private float medidaEnX;
   private float medidaEnY;

    public Escritorio(int edadX, float medidaEnXX, float medidaEnYX) {
        this.edad = edadX;
        this.medidaEnX = medidaEnXX;
        this.medidaEnY = medidaEnYX;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getMedidaEnX() {
        return this.medidaEnX;
    }

    public void setMedidaEnX(float medidaEnX) {
        this.medidaEnX = medidaEnX;
    }

    public float getMedidaEnY() {
        return this.medidaEnY;
    }

    public void setMedidaEnY(float medidaEnY) {
        this.medidaEnY = medidaEnY;
    }

}