public class Bicicleta  {

    protected String marca;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String imprimirAtributos(){

        return this.getMarca();
    }
}
