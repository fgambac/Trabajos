package com.company;

public class Azucarada extends Bebida{

    private int cantidadAzucar;

    public Azucarada() { }

    public Azucarada(String nombre, int cantidadAzucarX) {
        super(nombre, 1, cantidadAzucarX*10);
        this.cantidadAzucar = cantidadAzucarX;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucarX) {
        this.cantidadAzucar = cantidadAzucarX;
    }
}
