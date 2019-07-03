import java.util.*;
public class Equipo {
    HashMap<String,Integer> jugadoresYCamisetas = new HashMap<String,Integer>();

//constr
    public Equipo(HashMap<String, Integer> jugadoresYCamisetas) {
        this.jugadoresYCamisetas = jugadoresYCamisetas;
    }

    //getters y setters
    public HashMap<String, Integer> getJugadoresYCamisetas() {
        return this.jugadoresYCamisetas;
    }

    public void setJugadoresYCamisetas(HashMap<String, Integer> jugadoresYCamisetas) {
        this.jugadoresYCamisetas = jugadoresYCamisetas;
    }
//metodos
    public ArrayList<String> jugadoresCamisetasImpares(){
        ArrayList<String> jugadoresConCamImpares;
        for (Map.Entry jugadoresTotales : this.getJugadoresYCamisetas().entrySet()) {
            if((jugadoresTotales.values())%2!=0){
                jugadoresConCamImpares.add(jugadoresTotales.keySet());
            }
        }//recorre todo el map(strings y integers)
        return jugadoresConCamImpares;
    }
}

