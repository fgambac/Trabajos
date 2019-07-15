import java.util.ArrayList;
public class Programa{
    //atributos
    private String nombre;
    private ArrayList<Rutina> rutinas = new ArrayList<Rutina>();

    //constructor
    public Programa(String nombreIngresado){
        nombre = nombreIngresado;
    }

    //getters y setters
    public String getNombre() {
        return this.nombre;
    }
    public ArrayList<Rutina> getRutinas() {
        return this.rutinas;
    }
    public void setNombre(String nombreIngresado) {
        this.nombre = nombreIngresado;
    }
    public void setRutinas(ArrayList<Rutina> rutinasIngresadas) {
        this.rutinas = rutinasIngresadas;
    }

    //metodos
    public void agregarRutina(Rutina rutinaIngresada) {
        rutinas.add(rutinaIngresada);
    }
}