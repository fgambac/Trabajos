package com.company;

public class Alcoholica extends Bebida{

    private int cantidadAlcohol;

    public Alcoholica() { }

    public Alcoholica(String nombre, int cantidadAlcoholX) {
        super(nombre, 0, cantidadAlcoholX*20);
        this.cantidadAlcohol = cantidadAlcoholX;
    }

    public int getCantidadAlcohol() {
        return cantidadAlcohol;
    }

    public void setCantidadAlcohol(int cantidadAlcoholX) {
        this.cantidadAlcohol = cantidadAlcoholX;
    }
}
