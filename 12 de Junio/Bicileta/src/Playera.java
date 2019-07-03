public class Playera extends  Bicicleta {

    private int potenciaFrenoPedal;


    public int getPotenciaFrenoPedal() {
        return potenciaFrenoPedal;
    }

    public void setPotenciaFrenoPedal(int potenciaFrenoPedal) {
        this.potenciaFrenoPedal = potenciaFrenoPedal;
    }

    public String imprimirAtributos2() {


        return super.imprimirAtributos() + this.getPotenciaFrenoPedal();
    }
}
