package habitacion.television;

public class SmartTV extends Television{
    public SmartTV(float pesoX, String colorX, String materialX) {
        super.peso = pesoX;
        super.color = colorX;
        super.material = materialX;
    }
    public SmartTV(){
        this(52.0f,"rojo", "madera");
    }//sin param

    public SmartTV(float pesoX){
        super.peso=pesoX;
    }//con param

    public SmartTV(String colorx, String materialx, ){

        this.color = colorx;
    }
}
//no es necesario usar super() porque no haria referencia a ningun constructor, porque este no existe