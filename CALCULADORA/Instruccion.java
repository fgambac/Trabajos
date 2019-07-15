public class Instruccion{
    //atributos
    private String operacion;
    private int numero;
    private String identificadorVariable;

    //constructor
    public Instruccion(String operacionIngresada){
        operacion = operacionIngresada;
        numero = 0;

    }
    public Instruccion(String operacionIngresada, int numeroIngresado){
        operacion = operacionIngresada;
        numero = numeroIngresado;
    }
    public Instruccion(String operacionIngresada, String variableIngresada){
        operacion = operacionIngresada;
        identificadorVariable = variableIngresada;
    }

    //getters y setters
    public String getOperacion() {
        return this.operacion;
    }
    public int getNumero() {
        return this.numero;
    }
    public String getVariable() {
        return this.identificadorVariable;
    }

    public void setOperacion(String operacionIngresada) {
        this.operacion = operacionIngresada;
    }
    public void setNumero(int numeroIngresado) {
        this.numero = numeroIngresado;
    }
    public void setVariable(String variableIngresada){
        this.identificadorVariable = variableIngresada;
    }

    //metodos
}