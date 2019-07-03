package habitacion.lampara;

public class LamparaPixar extends Lampara {
    public LamparaPixar(float pesoX, String colorX, String materialX) {
        super.peso = pesoX;
        super.color = colorX;
        super.material = materialX;
    }
    public LamparaPixar(){
        this(52.0f,"rojo", "madera");
    }//sin param

    public LamparaPixar(float pesoX){
        super.peso=pesoX;
    }//con param

    public LamparaPixar(String colorx, String materialx, ){

        this.color = colorx;
    }
}
