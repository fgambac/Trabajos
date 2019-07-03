import  java.util.*;

public class Colectivo{

    private ArrayList<Pasajero>pasajeros = new ArrayList<Pasajero>();

    public Colectivo(){
    }

    public void agregapas(Pasajero pas){

        pasajeros.add(pas);
    }

    public Pasajero getpasajeros(int x){
        return pasajeros.get(x);
    }

    public String orden(){

        String frase;
        int contador=0;

        for(int i=0; i<pasajeros.size(); i++){
            if(this.pasajeros.get(i).gettar().viajeDesc() == true &&
                    this.pasajeros.get(i).gettar().metrosjustos() == true){
                contador++;
            }
        }
        if(contador == pasajeros.size()){
            frase = ("El colectivo esta en orden");
            return frase;
        }

        else{
            frase= ("El colectivo no esta en orden");
            return frase;

        }

    }
}

