import java.util.ArrayList;

public class Sistema {

    private ArrayList<Laboratorio> laboratorios = new ArrayList<Laboratorio>;
    private int cantCurso;

    public Sistema(Laboratorio lab){

        this.laboratorios.add(lab);
    }

    public String BuscarLibre(Experimento experimento){

    String frase;



        for(int i=0;i<laboratorios.size();i++){

            if(laboratorios.size() > cantCurso && laboratorios.get(i).getlibre() == true){

            laboratorios.get(i).setexp(experimento);

            laboratorios.get(i).setlibre(false);
            cantCurso++;
            frase = "Se comenzo con el experimento y el laboratorio n "+get(i)+ " ahora esta ocupado";
            return frase;

                }

            }

        if(this.cantCurso == laboratorios.size()){
            s     for(int i=0; i<laboratorios.size();i++){
                if(laboratorios.get(i).getexp().getAvanz() == true){
                    this.laboratorios.get(i).setexp(experimento);
                    frase = "El experimento avanzado fue remplazado por el nuevo.";
                    return frase;


                }
            }
        }

        frase = "El experimento no comenzo porque no hay laboratorios disponibles";
        return frase;

            }

        }
