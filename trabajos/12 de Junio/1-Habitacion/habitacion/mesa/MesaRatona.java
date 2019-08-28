package habitacion.mesa;

public class MesaRatona extends Mesa {
    public MesaRatona(float pesoX , String colorX, String materialX){
        super.peso = pesoX;
        super.color = colorX;
        super.material = materialX;
    }
    public MesaRatona(){
        this(52.0f,"rojo", "madera");
    }//sin param

    public MesaRatona(float pesoX){
        super.peso=pesoX;
    }//con param

    public MesaRatona(String colorx, String materialx, ){

        this.color = colorx;
    }
}
