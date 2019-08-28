import org.junit.jupiter.api.Test;
import sun.security.x509.EDIPartyName;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class misTests {

    @Test
    void hijoEsMayorCorrecto() {
        Hijo h1 = new Hijo("Carlos", "Rodriguez", 15, 41000000,"Masculino", "Desocupado","Poli","Minecraft");

        h1.imprimirDatos();
        assertTrue(h1.esMayorDeEdad()==false);

    }



    @Test
    void esPrimeraLetraACorrecto(){
        Hijo h2 = new Hijo("Ariel", "Rodriguez", 15, 41000000,"Masculino", "Desocupado","Poli","Minecraft");

        h2.imprimirDatos();
        assertTrue(h2.esPrimeraLetraA()==true);

    }

    @Test
    void esDniMenorA38millonesCorrecto(){

        Hijo h3 = new Hijo("Ariel", "Rodriguez", 15, 37000000,"Masculino", "Desocupado","Poli","Minecraft");

        h3.imprimirDatos();
        assertTrue(h3.esDniMenorA38Millones()==true);

    }
    @Test
    void hijosMenoresCorrecto(){
        Hijo h1 = new Hijo("Carlos", "Rodriguez", 15, 41000000,"Masculino", "Desocupado","Poli","Minecraft");
        Hijo h2 = new Hijo("Santiago", "Gambacorta", 18, 41000000,"Masculino", "Desocupado","Poli","Minecraft");
        Hijo h3 = new Hijo("Ariel", "Rodriguez", 15, 37000000,"Masculino", "Desocupado","Poli","Minecraft");
        HashSet<Hijo> hijos= new HashSet<Hijo>();
        hijos.add(h1);
        hijos.add(h2);
        hijos.add(h3);

        Madre m1 = new Madre("Carla", "Rodriguez", 15, 41000000,"Femenino", "Ingeniera","Intel",hijos);

        m1.imprimirDatos();
        HashSet<Hijo> hijosM= new HashSet<Hijo>();
        hijosM.add(h1);
        hijosM.add(h3);
        m1.hijosMenores();
        assertTrue(m1.hijosMenores().contains(h1));
        assertTrue(m1.hijosMenores().contains(h3));
        assertTrue(m1.hijosMenores().size()==2);
    }
}