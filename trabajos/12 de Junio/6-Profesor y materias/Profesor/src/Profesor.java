import java.sql.SQLOutput;
import java.util.*;


public class Seleccionar {

    private HashMap<String,String> MateriasyProfesor = new HashMap<String,String>();

    public Seleccionar(HashMap<String, String> MateriasyProfesorx) {
        this.MateriasyProfesor = MateriasyProfesorx;
    }

    private void setMateriasyProfesor(HashMap<String, String> materiasyProfesorx){
        this.MateriasyProfesor = materiasyProfesorx;
    }

    public HashMap<String, String> getProfesoryMaterias() {
        return MateriasyProfesor;
    }

    //metodos//

    private int cantMatxProf(){


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingresa apellido del profesor");
        String apellido = myObj.nextLine();

        for (Map.Entry profymat: this.MateriasyProfesor().entrySet()) {
            int contador=0;
            if(MateriasyProfesor.containsValue(apellido){
                contador++;

            }

            return contador;
        }

    /*    ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);


        for (Integer elemento : numeros ) {
            System.out.println(elemento);
        }*/
    }

}
