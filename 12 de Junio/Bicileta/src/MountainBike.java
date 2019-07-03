public class MountainBike extends Bicicleta{

    protected int cant_cambios;


    public int getCant_cambios() {
        return cant_cambios;
    }

    public void setCant_cambios(int cant_cambios) {
        this.cant_cambios = cant_cambios;
    }

    public String imprimirAtributos3() {


        return super.imprimirAtributos() + this.getCant_cambios();
    }
}
