import java.util.ArrayList;
public class Rutina{
    //atributos
    private String nombre;
    private ArrayList<Instruccion> instrucciones = new ArrayList<Instruccion>();

    //constructor
    public Rutina(String nombreIngresado){
        nombre = nombreIngresado;
    }

    //getters y setters
    public String getNombre() {
        return this.nombre;
    }
    public ArrayList<Instruccion> getInstrucciones() {
        return this.instrucciones;
    }

    public void setNombre(String nombreIngresado) {
        this.nombre = nombreIngresado;
    }
    public void setInstrucciones(ArrayList<Instruccion> instruccionesIngresadas) {
        this.instrucciones = instruccionesIngresadas;
    }

    //metodos
    public void agregarInstruccion(Instruccion instruccionIngresada){
        instrucciones.add(instruccionIngresada);
    }
}