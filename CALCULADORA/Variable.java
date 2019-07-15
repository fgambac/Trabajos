public class Variable{
    //atributos
    private String identificador;
    private int valor;

    //constructor
    public Variable(String identificadorIngresado){
        identificador = identificadorIngresado;
        valor = 0;
    }
    public Variable(String identificadorIngresado, int valorIngresado){
        identificador = identificadorIngresado;
        valor = valorIngresado;
    }

    //getters y setters
    public String getIdentificador(){
        return this.identificador;
    }
    public int getValor(){
        return this.valor;
    }
    public void setIdentificador(String identificadorIngresado){
        this.identificador = identificadorIngresado;
    }
    public void setValor(int valorIngresado){
        this.valor = valorIngresado;
    }

    //metodos

}