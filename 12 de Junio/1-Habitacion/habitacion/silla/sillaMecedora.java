package habitacion.silla;

public class sillaMecedora extends Silla {

    public sillaMecedora(float pesoX, String colorX, String materialX) {
        super.peso = pesoX;
        super.color = colorX;
        super.material = materialX;
    }

    public sillaMecedora(){
        this(52.0f,"rojo", "madera");
    }//sin param

    public sillaMecedora(float pesoX){
        super.peso=pesoX;
    }//con param

    public sillaMecedora(String colorx, String materialx, ){

        this.color = colorx;
    }
}
