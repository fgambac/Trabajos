import java.util.*;
public class Alumno {

    public HashMap<String, Integer> alumnos = new HashMap<String, Integer>();

    public HashMap<String, Integer> getAlumno(){
        return alumnos;
    }

    public int cantMayoresDeEdad(){
        int contador=0;
        for (Map.Entry alumnos : this.getAlumno().entrySet()){

            if( (alumnos.values())>18 ){
                contador++;
            }
        }
        return contador;
    }

    
}
