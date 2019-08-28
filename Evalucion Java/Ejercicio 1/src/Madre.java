import java.util.*;
public class Madre extends Persona {
    private String empresa;
    private HashSet<Hijo> hijos;

    public Madre() {
    }

    public Madre(String nombre, String apellido, int edad, int dni, String sexo, String ocupacion) {
        super(nombre, apellido, edad, dni, sexo, ocupacion);
        this.hijos = new HashSet<Hijo>();
    }

    public Madre(String empresa) {
        this.empresa = empresa;
        this.hijos = new HashSet<Hijo>();
    }

    public Madre(String nombre, String apellido, int edad, int dni, String sexo, String ocupacion, String empresa, HashSet<Hijo> hijos) {
        super(nombre, apellido, edad, dni, sexo, ocupacion);
        this.empresa = empresa;
        this.hijos = hijos;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public HashSet<Hijo> getHijos() {
        return this.hijos;
    }

    public void setHijos(HashSet<Hijo> hijos) {
        this.hijos = hijos;
    }

    public HashSet<Hijo> hijosMenores(){
        HashSet<Hijo> hijosMenoresSet = new HashSet<Hijo>();
        for(Hijo hijoX : this.hijos){
            if(hijoX.esMayorDeEdad() == false) {
                hijosMenoresSet.add(hijoX);
            }
        }
            return hijosMenoresSet;
    }

    public void imprimirHijo(Hijo hijoX){
        System.out.println("Escuela: "+hijoX.getEscuela());
        System.out.println("Juego Favorito: "+hijoX.getJuegoFavotito());
    }

    public void imprimirHijos(){
        int i=1;
        for(Hijo hijoX : hijos){
            System.out.print("Hijo"+ i +" : ");
            imprimirHijo(hijoX);
            i++;
        }
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Nombre empresa: "+this.getEmpresa());
        System.out.println("Apellido: "+this.getApellido());
    }

}
