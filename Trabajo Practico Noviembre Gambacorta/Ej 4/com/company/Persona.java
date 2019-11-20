package com.company;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Persona {

    private String nombre;
    private String apellido;
    private int DNI;
    private HashMap<Bebida, Integer>bebidasYcantidad;
    private int cHidratacion;

    public Persona() { }

    public Persona(String nombre, String apellido, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.bebidasYcantidad = new HashMap<Bebida, Integer>();
    }

    public Persona(String nombre, String apellido, int DNI, int cHidratacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.bebidasYcantidad = new HashMap<Bebida, Integer>();
        this.cHidratacion = cHidratacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public HashMap<Bebida, Integer> getBebidasYcantidad() {
        return bebidasYcantidad;
    }

    public void setBebidas_cantidad(HashMap<Bebida, Integer> bebidasYcantidad) {
        this.bebidasYcantidad = bebidasYcantidad;
    }

    public int getCHidratacion() {
        return cHidratacion;
    }

    public void setCHidratacion(int cHidratacion) {
        this.cHidratacion = cHidratacion;
    }

    public void calcularCHidratacion(){
        for(Map.Entry<Bebida, Integer> bebida: getBebidasYcantidad().entrySet()){
            int cAuxiliar = bebida.getValue() * (bebida.getKey().getCPositividad() - bebida.getKey().getCNegatividad());
            setCHidratacion(getCHidratacion() + cAuxiliar );
        }
    }

    public void agregarVariasBebidas(Bebida bebida, int cantidad) {
        boolean encontrado = false;
        for (Map.Entry<Bebida, Integer> hashmapBebida : getBebidasYcantidad().entrySet()) {
            if (hashmapBebida.getKey() == bebida) {
                hashmapBebida.setValue(hashmapBebida.getValue() + cantidad);
                encontrado = true;
            }
        }
        if (!encontrado) {
            this.getBebidasYcantidad().put(bebida, cantidad);
        }
    }

    public void mostrarLista(){
        for (Map.Entry<Bebida, Integer> hashmapBebida : getBebidasYcantidad().entrySet()) {
            System.out.println(" ");
            System.out.println(hashmapBebida.getKey().getNombre() + " : " + hashmapBebida.getValue());
        }
    }
}
