package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Persona p1 = new Persona("facundo", "gambacortta", 12345678);
        Persona p2 = new Persona("juan", "lopez", 98765432);
        Persona p3 = new Persona("jorge", "tenaris", 44446666);
        Neutra b2 = new Neutra("Agua", 10, 0);
        Neutra b1 = new Neutra("Soda", 10, 10);
        Azucarada a1 = new Azucarada("Coca", 15);
        Alcoholica a2 = new Alcoholica("Ron", 48);
        p1.agregarVariasBebidas(b1, 3);
        p1.agregarVariasBebidas(a2, 2);
        p1.agregarVariasBebidas(a1, 8);
        p1.agregarVariasBebidas(b1, 2);
        p2.agregarVariasBebidas(b1, 8);
        p2.agregarVariasBebidas(a1, 6);
        p2.agregarVariasBebidas(a2, 0);
        p3.agregarVariasBebidas(b1, 15);
        p3.agregarVariasBebidas(b2, 20);
        p3.agregarVariasBebidas(a1, 1);
        p3.agregarVariasBebidas(a2, 0);
        p1.calcularCHidratacion();
        p2.calcularCHidratacion();
        p3.calcularCHidratacion();
        int resultado = p1.getCHidratacion();
        System.out.println("Coeficiente de Hidratacion: " + resultado);

        p1.mostrarLista();

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        Persona mejorHidratacion = personaMejorHidratacion(personas);
        Persona peorHidratacion = personaPeorHidratacion(personas);
        System.out.println(mejorHidratacion.getNombre() + " " + mejorHidratacion.getApellido());
        System.out.println(peorHidratacion.getNombre() + " " + peorHidratacion.getApellido());
    }

    public static Persona personaMejorHidratacion(ArrayList<Persona> arrayList){
        Persona personaMejorHidratacion = new Persona();
        for(int i = 0 ; i < arrayList.size() ; i++){
            if(i == 0){
                personaMejorHidratacion = arrayList.get(i);
            }
            else{
                if(personaMejorHidratacion.getCHidratacion() < arrayList.get(i).getCHidratacion()){
                    personaMejorHidratacion = arrayList.get(i);
                }
            }
        }
        return personaMejorHidratacion;
    }

    public static Persona personaPeorHidratacion(ArrayList<Persona> arrayList){
        Persona personaPeorHidratacion = new Persona();
        for(int i = 0 ; i < arrayList.size() ; i++){
            if(i == 0){
                personaPeorHidratacion = arrayList.get(i);
            }
            else{
                if(personaPeorHidratacion.getCHidratacion() > arrayList.get(i).getCHidratacion()){
                    personaPeorHidratacion = arrayList.get(i);
                }
            }
        }
        return personaPeorHidratacion;
    }
}

