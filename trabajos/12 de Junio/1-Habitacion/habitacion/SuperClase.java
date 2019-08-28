package habitacion;

public class SuperClase {
    private float peso;
    private String color;
    private String material;

    public SuperClase(float peso, String color, String material) {
        this.peso=peso;
        this.color=color;
        this.material=material
    }

    public float getPeso(){
        return this.peso;
    }

    public String getColor(){
        return this.color;
    }

    public String getMaterial(){
        return this.material;
    }

    public void setPeso(float pesoX){
        this.peso = pesoX;
    }

    public void setColor(String colorX ){
        this.color = colorX;
    }

    public void setMaterial(String materialX ){
        this.material = materialX;
    }
    //b.1)Los atributos de las clases elegidas serán borrados porque ya no resultaran utiles. Es necesario usar super en los constructores, para hacer referencia a los atributos de la superclase
}
