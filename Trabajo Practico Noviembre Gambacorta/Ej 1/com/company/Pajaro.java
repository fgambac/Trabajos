package com.company;
import java.util.Scanner;

public class Pajaro extends MascotaSaluda{

    private boolean cantor;


    public Pajaro() { }

    public Pajaro(String nombre, String dueño, boolean cantor, String canto) {
        super(nombre, dueño, canto);
        this.cantor = cantor;
    }

    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    public String saludar(String persona){
        String saludo = this.getSaludo();
        if(this.getDueño()==persona){
            for(int i = 0 ; i < super.getAlegria() - 1; i++) {
                saludo = saludo + this.getSaludo();
            }
        }
        else {
            this.restarAlegria();
        }
        return saludo;
    }

    public void sumarAlegria(){
        super.setAlegria(super.getAlegria()+1);
    }

    public void restarAlegria() {
        if (super.sePuedeRestarAlegria()) {
            super.setAlegria(super.getAlegria() - 1);
        }
    }

    public void alimentar(){
        sumarAlegria();
    }

    public String tipoDeMascota(){
        return "Pajaro";
    }
}
