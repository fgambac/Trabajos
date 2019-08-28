import java.util.*;
public class Experimento {

    private ArrayList<Observacion> observaciones = new ArrayList<Observacion>;
    private int cant_anom;
    private int cant_conf;
    private int cant_cont;
    private boolean avanzado;
    private boolean cancelado = true;

    public void agregobs(Observacion obs){
        this.observaciones.add(obs);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingresar 1 si la observacion es anomala, 2 si es legitima y confirma la hipotesis y 3 si es legitima y contradice la hipotesis");
        String num = myObj.nextLine();

            if(num == "1"){

                obs.setanom(true);
                cant_anom++;
            }

            if(num == "2"){
                obs.setconf(true);
                cant_conf++;
            }

            if(num == "3"){

                obs.setcont(true);
                cant_cont++;
            }

            if(this.cant_conf + this.cant_cont >= 30){

                this.avanzado= true;
            }


            if(this.cant_conf + this.cant_cont < this.cant_anom){

                this.cancelado=true;
            }



    }



    public void setcancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public int getcantanom(){
        return this.cant_anom;
    }

    public int getcantconf(){
        return this.cant_conf;
    }

    public int getcantcont(){
        return this.cant_conf;
    }
    public boolean getAvanz(){
        return this.avanzado;
    }

    }

    public String cantavanz(){

    String frase;
    int cant_avanzados;
    int cant_avanzados_hip;

    for(int i=0;i<this.laboratorios.size();i++){

        if(this.laboratorios(i).getExp().getAvanz() == true){
            cant_avanzados++;
            if(this.laboratorios(i).getExp().getcantconf > laboratorios(i).getExp().getcantcont){
                cant_avanzados_hip++;
            }

        }
    }

frase = "La cantidad de experimentos avanzados con mayor cantidad de hipotesis comfirmadas es de "+ cant_avanzados_hip + " sobre "+ cant_avanzados;
return frase;
    }


