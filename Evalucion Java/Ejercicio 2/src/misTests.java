import org.junit.jupiter.api.Test;
import sun.security.x509.EDIPartyName;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class misTests {

    @Test
    void sumasBienHechas(){


        HashMap<Editorial, Integer> librosVendidosXEditorial = new HashMap<Editorial,Integer>();
        librosVendidosXEditorial.put(Editorial.KAPELUSZ,0);
        librosVendidosXEditorial.put(Editorial.SUDAMERICANA,0);
        librosVendidosXEditorial.put(Editorial.ATLANTIDA,0);
        librosVendidosXEditorial.put(Editorial.ELATENEO,5);
        librosVendidosXEditorial.put(Editorial.INTERZONA,2);
        librosVendidosXEditorial.put(Editorial.SUR,0);
        librosVendidosXEditorial.put(Editorial.ALIANZA,0);

        Libreria libreria = new Libreria(librosVendidosXEditorial);




        libreria.ingresarLibrosVendidosXEditorial(Editorial.KAPELUSZ,10);
        libreria.ingresarLibrosVendidosXEditorial(Editorial.ELATENEO,10);
        libreria.ingresarLibrosVendidosXEditorial(Editorial.INTERZONA,10);

        libreria.mostrarLibrosVendidosEditoriales();
        assertTrue(libreria.getLibrosVendidosXEditorial().get(Editorial.KAPELUSZ) == 10);
        assertTrue(libreria.getLibrosVendidosXEditorial().get(Editorial.ELATENEO) == 15);
        assertTrue(libreria.getLibrosVendidosXEditorial().get(Editorial.INTERZONA) == 12);
        assertTrue(libreria.getLibrosVendidosXEditorial().get(Editorial.ALIANZA) == 0);


    }

    @Test
    void editorialConMasLibrosVendidosCorrecta(){


        HashMap<Editorial, Integer> librosVendidosXEditorial = new HashMap<Editorial,Integer>();
        librosVendidosXEditorial.put(Editorial.KAPELUSZ,0);
        librosVendidosXEditorial.put(Editorial.SUDAMERICANA,0);
        librosVendidosXEditorial.put(Editorial.ATLANTIDA,0);
        librosVendidosXEditorial.put(Editorial.ELATENEO,5);
        librosVendidosXEditorial.put(Editorial.INTERZONA,2);
        librosVendidosXEditorial.put(Editorial.SUR,0);
        librosVendidosXEditorial.put(Editorial.ALIANZA,0);

        Libreria libreria = new Libreria(librosVendidosXEditorial);




        libreria.ingresarLibrosVendidosXEditorial(Editorial.KAPELUSZ,10);
        libreria.ingresarLibrosVendidosXEditorial(Editorial.ELATENEO,10);
        libreria.ingresarLibrosVendidosXEditorial(Editorial.INTERZONA,10);

        libreria.mostrarLibrosVendidosEditoriales();
        assertTrue(libreria.editorialMasLibrosVendidos() == Editorial.ELATENEO);



    }
}