package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {

    @Test
    void PajaroSaludaDueño(){
        Pajaro p= new Pajaro("Juan Carlos", "Hernan", false, "pio");
        String saludo = p.saludar("Hernan");
        assertEquals(saludo, "pio");
    }

    @Test
    void alimentarPajaro(){
        Pajaro p = new Pajaro("Mariano", "Santiago", false, "pio");
        p.alimentar();
        p.alimentar();
        int alegria = p.getAlegria();
        assertEquals(alegria, 3);
    }

    @Test
    void PerroSaludaDueño(){
        Perro pe = new Perro("Crush", "Gamba", "guau");
        pe.alimentar();
        String saludo = pe.saludar("Gamba");
        assertEquals(saludo, "guauguau");
    }


    @Test
    void PerroSaludaNoDueño(){
        Perro pe = new Perro("Crush", "Gamba", "guau");
        pe.alimentar();
        pe.alimentar();
        String saludo = pe.saludar("Santiago");
        assertEquals(saludo, "GUAU!GUAU!GUAU!");
    }


    @Test
    void PerroAlimentar(){
        Perro pe = new Perro("Crush", "Gamba", "guau");
        pe.alimentar();
        int alegria = pe.getAlegria();
        assertEquals(alegria, 2);
    }

    @Test
    void GatoSaludaDueño(){
        Gato g = new Gato("Señor Peludo", "Mingote", "miau");
        String saludo = g.saludar("Mingote");
        assertEquals(saludo, "miau");
    }

    @Test
    void GatoSaludaNoDueño(){
        Gato g = new Gato("Señor Peludo", "Mingote", "miau");
        g.alimentar();
        g.alimentar();
        String saludo = g.saludar("Juan Carlos");
        assertEquals(saludo, "MIAU!MIAU!MIAU!");
    }

    @Test
    void GatoAlimentar(){
        Gato g = new Gato("Señor Peludo", "Mingote", "miau");
        g.alimentar();
        int alegria = g.getAlegria();
        assertEquals(alegria, 2);
    }

    @Test
    void PezAlimentar(){
        Pez pez = new Pez("Nemo", "Peke");
        pez.alimentar();
        pez.alimentar();
        pez.alimentar();

        int vidas = pez.getVidas();
        assertEquals(vidas, 13);
    }

    @Test
    void PezSaludarDueño(){
        Pez p1 = new Pez("Eduardo", "Jose");
        p1.saludar("Jose");
        int vidas = p1.getVidas();
        assertEquals(vidas, 9);

    }

    @Test
    void PezSaludarNoDueño(){
        ArrayList<Pez>peces = new ArrayList<Pez>();
        Pez pez = new Pez("Nemo", "Peke");
        Pez pez2 = new Pez("Carlitos", "Chino");
        Pez pez3 = new Pez("Barbi", "Cornejo");
        peces.add(pez);
        peces.add(pez2);
        peces.add(pez3);
        pez.saludar("Hernan");
        for(int i = 0 ; i < peces.size() ; i++){
            if(peces.get(i).verificarVida() == false){
                peces.remove(i);
            }
        }
        ArrayList<Pez> pecesAux = new ArrayList<Pez>();
        pecesAux.add(pez2);
        pecesAux.add(pez3);
        assertEquals(peces, pecesAux);

    }



}
