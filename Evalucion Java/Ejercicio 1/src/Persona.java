import java.util.*;
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String sexo;
    private String ocupacion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int dni, String sexo, String ocupacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.ocupacion = ocupacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOcupacion() {
        return this.ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public boolean esMayorDeEdad(){
        if(this.getEdad()>=18){
            return true;
        }
        else{ return false;}
    }
    public char getPrimeraLetraNombre(){
        return this.getNombre().charAt(0);
    }

    public boolean esPrimeraLetraA(){
        if(this.getPrimeraLetraNombre()=='A' || this.getPrimeraLetraNombre()=='a'){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean esDniMenorA38Millones(){
        if(this.getDni()<38000000){
            return true;
        }
        else{return false;}
    }

    public void imprimirDatos(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellido: "+this.getApellido());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("DNI: "+this.getDni());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Ocupacion: "+this.getOcupacion());
    }
}
