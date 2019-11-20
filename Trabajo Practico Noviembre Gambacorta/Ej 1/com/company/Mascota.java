package com.company;

public abstract class Mascota {

    private String nombre;
    private String dueño;

    public Mascota(){ }

    public Mascota(String nombre, String dueño) {
        this.nombre = nombre;
        this.dueño = dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public abstract String tipoDeMascota();
}
