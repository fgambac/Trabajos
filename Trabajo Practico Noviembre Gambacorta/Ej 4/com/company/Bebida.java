package com.company;

public abstract class Bebida {

    private String nombre;
    private int cPositividad;
    private int cNegatividad;

    public Bebida() { }

    public Bebida(String nombre, int cPositividadX, int cNegatividadX) {
        this.nombre = nombre;
        this.cPositividad = cPositividadX;
        this.cNegatividad = cNegatividadX;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreX) {
        this.nombre = nombreX;
    }

    public int getCPositividad() {
        return cPositividad;
    }

    public void setCPositividad(int cPositividadX) {
        this.cPositividad = cPositividadX;
    }

    public int getCNegatividad() {
        return cNegatividad;
    }

    public void setCoeficienteDeNegeatividad(int cNegatividadX) {
        this.cNegatividad = cNegatividadX;
    }
}
