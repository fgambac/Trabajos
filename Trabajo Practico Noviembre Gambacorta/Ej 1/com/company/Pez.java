package com.company;

public class Pez extends Mascota{

    private int vidas = 10;

    public Pez() { }

    public Pez(String nombre, String dueño) {
        super(nombre, dueño);
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void restarVida(){
        this.setVidas(this.getVidas() - 1);
    }

    public void agregarVida() {
        if (this.verificarVida()) {
            this.setVidas(this.getVidas() + 1);
        }
    }

    public void saludar(String persona){
        if(verificarDueño(persona)){
            this.restarVida();
        }
        else{
            this.setVidas(0);
        }
    }

    public void alimentar(){
        agregarVida();
    }

    public boolean verificarVida(){
        if(this.getVidas() == 0){
            return false;
        }
        return true;
    }

    public boolean verificarDueño(String persona){
        if(this.getDueño()==persona){
            return true;
        }
        return false;
    }

    public String tipoDeMascota(){
        return "Pez";
    }
}
