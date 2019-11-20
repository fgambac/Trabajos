package com.company;

public abstract class MascotaSaluda extends Mascota {

    private String saludo;
    private int alegria = 1;

    public MascotaSaluda() { }

    public MascotaSaluda(String nombre, String dueño, String saludo) {
        super(nombre, dueño);
        this.saludo = saludo;
        this.alegria = 1;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public abstract String saludar(String persona);

    public boolean sePuedeRestarAlegria(){
        if(this.getAlegria() > 1){
            return true;
        }
        return false;
    }
    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

}
