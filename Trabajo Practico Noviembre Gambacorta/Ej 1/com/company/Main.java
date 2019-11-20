package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        while (true) {
            System.out.println("Bienvenido al sistema ABM de Veterinaria Gambacorta");
            System.out.println("Elija una opcion: A/B/M");
            Scanner opX = new Scanner(System.in);
            String op = opX.nextLine();

            switch (op) {
                case "A":
                    System.out.println("¿Que clase de animal desea ingresar?");
                    System.out.println("Perro/Gato/Pajaro/Pez");
                    Scanner claseAnimal = new Scanner(System.in);
                    String clase = claseAnimal.nextLine();
                    switch (clase) {
                        case "Perro":
                            System.out.println("¿Cual es el nombre de su perro?");
                            Scanner nombrePerro = new Scanner(System.in);
                            String nombreP = nombrePerro.nextLine();
                            System.out.println("¿Cual es su nombre?");
                            Scanner nombreDueñoPerroX = new Scanner(System.in);
                            String nombreDueñoPerro = nombreDueñoPerroX.nextLine();

                            mascotas.add(new Perro(nombreP, nombreDueñoPerro, "guau"));
                            break;
                        case "Gato":
                            System.out.println("¿Cual es el nombre de su gato?");
                            Scanner nombreGato = new Scanner(System.in);
                            String nombreG = nombreGato.nextLine();
                            System.out.println("¿Cual es su nombre?");
                            Scanner nombreDueñoGatoX = new Scanner(System.in);
                            String nombreDueñoGato = nombreDueñoGatoX.nextLine();

                            mascotas.add(new Gato(nombreG, nombreDueñoGato, "miau"));
                            break;

                        case "Pajaro":
                            boolean cantor = false;
                            String canto = "pio";
                            System.out.println("¿Cual es el nombre de su pajaro?");
                            Scanner nombrePajaroX = new Scanner(System.in);
                            String nombrePajaro = nombrePajaroX.nextLine();
                            System.out.println("¿Cual es su nombre?");
                            Scanner nombreDueñoPajaroX = new Scanner(System.in);
                            String nombreDueñoPajaro = nombreDueñoPajaroX.nextLine();
                            System.out.println("¿Su pajaro es cantor? S/N");
                            Scanner esCantor = new Scanner(System.in);
                            String respuesta = esCantor.nextLine();
                            switch (respuesta){
                                case "S":
                                    cantor = true;
                                    System.out.println("Ingrese el canto del pajaro");
                                    Scanner canto1 = new Scanner(System.in);
                                    canto = canto1.nextLine();
                                    break;
                                case "N":
                                    cantor = false;
                                    canto = "pio";
                            }
                            mascotas.add(new Pajaro(nombrePajaro, nombreDueñoPajaro, cantor, canto));
                            break;
                        case "Pez":
                            System.out.println("¿Cual es el nombre de su pez?");
                            Scanner nombrePezX = new Scanner(System.in);
                            String nombrePez = nombrePezX.nextLine();
                            System.out.println("¿Cual es su nombre?");
                            Scanner nombreDueñoPezX = new Scanner(System.in);
                            String nombreDueñoPeZ = nombreDueñoPezX.nextLine();

                            mascotas.add(new Pez(nombrePez, nombreDueñoPeZ));

                    }
                    break;
                case "B":
                    System.out.println("¿Cual es el nombre de su mascota?");
                    Scanner nombrePerroX = new Scanner(System.in);
                    String nombrePerro = nombrePerroX.nextLine();
                    System.out.println("¿Cual es su nombre?");
                    Scanner nombreDueñoX = new Scanner(System.in);
                    String nombreDueño = nombreDueñoX.nextLine();

                    for (int i = 0; i < mascotas.size(); i++) {
                        if ((mascotas.get(i).getDueño()==nombreDueño) && (mascotas.get(i).getNombre())==nombrePerro) {
                            mascotas.remove(i);
                        }
                    }
                    break;

                case "M":
                    boolean encontrado = false;
                    System.out.println("¿Cual es el nombre de su mascota?");
                    Scanner nombreMascotaX = new Scanner(System.in);
                    String nombreMascota = nombreMascotaX.nextLine();
                    System.out.println("¿Cual es su nombre?");
                    Scanner nombreDueño2X = new Scanner(System.in);
                    String nombreDueño2 = nombreDueño2X.nextLine();
                    System.out.println("Que quiere hacer:");
                    System.out.println("1. Cambiar Nombre");
                    System.out.println("2. Cambiar Dueño");
                    System.out.println("3. Saludar");
                    System.out.println("4. Alimentar");
                    Scanner opcion2 = new Scanner(System.in);
                    int modificacion = opcion2.nextInt();
                    switch (modificacion){
                        case 1:
                            System.out.println("Ingrese el nuevo nombre de su mascota");
                            Scanner nuevoNombreX = new Scanner(System.in);
                            String nuevoNombre = nuevoNombreX.nextLine();

                            for (int i = 0; i < mascotas.size(); i++) {
                                if (mascotas.get(i).getNombre()==nombreMascota) {
                                    encontrado = true;
                                    if(mascotas.get(i).getDueño()==nombreDueño2){
                                        mascotas.get(i).setNombre(nuevoNombre);
                                    }
                                    else{
                                        System.out.println("No puede cambiar el nombre");
                                    }
                                }
                            }
                            break;

                        case 2:
                            System.out.println("Ingrese el nombre del nuevo dueño");
                            Scanner nuevoDueñoX = new Scanner(System.in);
                            String nuevoDueño = nuevoDueñoX.nextLine();

                            for (int i = 0; i < mascotas.size(); i++) {
                                if (mascotas.get(i).getNombre()==nombreMascota) {
                                    encontrado = true;
                                    if(mascotas.get(i).getDueño()==nombreDueño2){
                                        mascotas.get(i).setDueño(nuevoDueño);
                                    }
                                    else{
                                        System.out.println("No ha podido cambiar el nombre");
                                    }
                                }
                            }

                            break;

                        case 3:
                            for (int i = 0; i < mascotas.size(); i++) {
                                if (mascotas.get(i).getNombre()==nombreMascota) {
                                    encontrado = true;
                                    String claseDeMascota = mascotas.get(i).tipoDeMascota();
                                    switch (claseDeMascota){
                                        case "Perro":
                                            Perro perro = (Perro) mascotas.get(i);
                                            String saludoPerro = perro.saludar(nombreDueño2);
                                            System.out.println(saludoPerro);
                                            break;
                                        case "Gato":
                                            Gato gato = (Gato) mascotas.get(i);
                                            String saludoGato = gato.saludar(nombreDueño2);
                                            System.out.println(saludoGato);
                                        case "Pajaro":
                                            Pajaro pajaro = (Pajaro) mascotas.get(i);
                                            String saludoPajaro = pajaro.saludar(nombreDueño2);
                                            System.out.println(saludoPajaro);
                                            break;
                                        case "Pez":
                                            Pez pez = (Pez) mascotas.get(i);
                                            pez.saludar(nombreDueño2);
                                            break;
                                    }

                                }
                            }
                            break;

                        case 4:
                            for (int i = 0; i < mascotas.size(); i++) {
                                if (mascotas.get(i).getNombre()==nombreMascota) {
                                    encontrado = true;
                                    String claseDeMascota = mascotas.get(i).tipoDeMascota();
                                    switch (claseDeMascota){
                                        case "Perro":
                                            Perro perro = (Perro) mascotas.get(i);
                                            perro.alimentar();
                                            break;
                                        case "Gato":
                                            Gato gato = (Gato) mascotas.get(i);
                                            gato.alimentar();
                                        case "Pajaro":
                                            Pajaro pajaro = (Pajaro) mascotas.get(i);
                                            pajaro.alimentar();
                                            break;
                                        case "Pez":
                                            Pez pez = (Pez) mascotas.get(i);
                                            pez.alimentar();
                                            break;
                                    }

                                }
                            }
                            break;

                    }
                    if(encontrado == false){
                        System.out.println("No se encontro el animal");
                    }
            }
        }
    }
}
