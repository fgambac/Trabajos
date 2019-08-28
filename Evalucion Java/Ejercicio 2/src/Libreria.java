import java.util.*;
public class Libreria {
    private HashMap<Editorial, Integer> LibrosVendidosXEditorial;

    public Libreria(HashMap<Editorial, Integer> librosVendidosXEditorial) {
        LibrosVendidosXEditorial = librosVendidosXEditorial;
    }

    public HashMap<Editorial, Integer> getLibrosVendidosXEditorial() {
        return this.LibrosVendidosXEditorial;
    }

    public void setLibrosVendidosXEditorial(HashMap<Editorial, Integer> librosVendidosXEditorial) {
        LibrosVendidosXEditorial = librosVendidosXEditorial;
    }

    public void ingresarLibrosVendidosXEditorial(Editorial editorial, int cantidad){ //se ingresa como Editorial.SUDAMERICANA
        boolean existe= false;
        for(Map.Entry<Editorial,Integer> i : this.LibrosVendidosXEditorial.entrySet()){
            if(i.getKey()==editorial){
                this.LibrosVendidosXEditorial.put(editorial,i.getValue()+cantidad);
                existe=true;
            }
        }
        if(existe==false){
            this.LibrosVendidosXEditorial.put(editorial,cantidad);
        }

    }

    public Editorial editorialMasLibrosVendidos(){
        int cantMayor=0;
        Editorial editorialMayor = null;
        for(Map.Entry<Editorial,Integer> i : this.LibrosVendidosXEditorial.entrySet()){
            if(i.getValue()>cantMayor){
                cantMayor = i.getValue();
                editorialMayor = i.getKey();
            }
        }
        return editorialMayor;

    }

    public int librosVendidosXEditorial(Editorial editorial){
        int librosVendidos=0;
        for(Map.Entry<Editorial,Integer> i : this.LibrosVendidosXEditorial.entrySet()){
            if(i.getKey()== editorial){
                librosVendidos=i.getValue();
            }
        }

        return librosVendidos;
    }

    public void mostrarLibrosVendidosEditoriales(){
        System.out.println("Editorial / Libros vendidos");
        System.out.println("Kapelusz: "+librosVendidosXEditorial(Editorial.KAPELUSZ));
        System.out.println("Sudamericana: "+librosVendidosXEditorial(Editorial.SUDAMERICANA));
        System.out.println("Atlantida: "+librosVendidosXEditorial(Editorial.ATLANTIDA));
        System.out.println("El Ateneo: "+librosVendidosXEditorial(Editorial.ELATENEO));
        System.out.println("Interzona: "+librosVendidosXEditorial(Editorial.INTERZONA));
        System.out.println("Sur: "+librosVendidosXEditorial(Editorial.SUR));
        System.out.println("Alianza: "+librosVendidosXEditorial(Editorial.ALIANZA));
    }




}
