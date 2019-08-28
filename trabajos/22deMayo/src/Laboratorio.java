public class Laboratorio {

   private Experimento experimento;
   private boolean libre;


   public Laboratorio(Experimento exp, boolean librex){

       experimento = exp;
       libre = librex;
   }

   public boolean getlibre(){
       return this.libre;
   }

   public Experimento getexp(){
       return this.experimento;
   }

   public void setexp(Experimento exp ){
       experimento = exp;
       }

    public void setlibre(boolean librex ){
        libre = librex;
    }

    public void cancelarexp(Experimento experimento){

        if(this.experimento.getcantconf()+ this.experimento.getcantcont() < this.experimento.getcantanom()){

        this.libre = true;
        this.experimento.setcancelado(true);
        }
    }


   }


