import java.util.*;
public class Hijo extends Persona {
    private String escuela;
    private String juegoFavotito;

    public Hijo() {
    }

    public Hijo(String nombre, String apellido, int edad, int dni, String sexo, String ocupacion) {
        super(nombre, apellido, edad, dni, sexo, ocupacion);
    }

    public Hijo(String escuela, String juegoFavotito) {
        this.escuela = escuela;
        this.juegoFavotito = juegoFavotito;
    }

    public Hijo(String nombre, String apellido, int edad, int dni, String sexo, String ocupacion, String escuela, String juegoFavotito) {
        super(nombre, apellido, edad, dni, sexo, ocupacion);
        this.escuela = escuela;
        this.juegoFavotito = juegoFavotito;
    }

    public String getEscuela() {
        return this.escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getJuegoFavotito() {
        return this.juegoFavotito;
    }

    public void setJuegoFavotito(String juegoFavotito) {
        this.juegoFavotito = juegoFavotito;
    }


}

