import java.util.*;
public class Main{

    public static void main (String [ ] args) {
        HashMap<String,Integer> jugadores = new HashMap<String,Integer>();
        jugadores.put("Conde", 2);
        jugadores.put("Mbappe", 8);
        jugadores.put("Gamba", 5);
        jugadores.put("Le Mingot", 9);
        jugadores.put("Nahue trapgod", 1);
        jugadores.put("El Bebote Rouco", 10);

        Equipo team = new Equipo(jugadores);

        System.out.println(team.jugadoresCamisetasImpares);

    }

}