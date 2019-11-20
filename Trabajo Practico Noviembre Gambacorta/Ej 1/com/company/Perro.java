package com.company;

public class Perro extends MascotaSaluda{



    public Perro() { }

    public Perro(String nombre, String dueño, String canto) {
        super(nombre, dueño, canto);
    }


    public void sumarAlegria(){
        super.setAlegria(super.getAlegria()+1);
    }

    public void restarAlegria() {
        if (super.sePuedeRestarAlegria()) {
            super.setAlegria(super.getAlegria() - 1);
        }
    }

    public String saludar(String persona){
        String saludo;
        if(this.getDueño()==persona){
            saludo = this.getSaludo();
            for(int i = 0 ; i < super.getAlegria() - 1 ; i++) {
                saludo = saludo + this.getSaludo();
            }
        }
        else{
            saludo = "GUAU!";
            for (int i = 0 ; i < super.getAlegria() - 1 ; i++){
                saludo = saludo + "GUAU!";
            }
        }
        this.restarAlegria();
        return saludo;
    }

    public void alimentar(){
        this.sumarAlegria();
    }

    public String tipoDeMascota(){
        return "Perro";
    }
}
