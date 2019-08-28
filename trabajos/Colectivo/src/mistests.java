import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class mistests {
    @Test

    void probarviaje1(){
        Tarjeta t1 = new Tarjeta(0, 0, 40);
        Pasajero p1 = new Pasajero(t1);
        Colectivo c = new Colectivo();
        c.agregapas(p1);
        t1.viaje();
        t1.metrosjustos();
        assertTrue(t1.getpago()==20);
    }
}

