import java.util.Stack;
import java.util.ArrayList;

public class Calculadora{
    //atributos
    private Stack<Integer> pila = new Stack<Integer>();
    private ArrayList<Variable> memoria = new ArrayList<Variable>();
    private Programa programa;

    //constructor
    public Calculadora(){
    }

    //getters y setters
    public Stack<Integer> getPila() {
        return this.pila;
    }
    public ArrayList<Variable> getMemoria() {
        return this.memoria;
    }

    public Programa getPrograma() {
        return this.programa;
    }

    public void setPila(Stack pilaIngresada) {
        this.pila = pilaIngresada;
    }
    public void setMemoria(ArrayList<Variable> memoriaIngresada){
        this.memoria = memoriaIngresada;
    }
    public void setPrograma(Programa programaIngresado) {
        this.programa = programaIngresado;
    }

    //metodos
    public void agregarAPila(int numeroIngresado){
        this.pila.push(numeroIngresado);
    }
    public void agregarAMemoria(Variable variableIngresada){
        memoria.add(variableIngresada);
    }
    public void ejectuar(){
        for(int i = 0 ; i < this.getPrograma().getRutinas().size() ; i++){
            for(int j = 0 ; j < this.getPrograma().getRutinas().get(i).getInstrucciones().size() ; j++){
                String auxiliar = this.getPrograma().getRutinas().get(i).getInstrucciones().get(j).getOperacion();
                switch(auxiliar){
                    case "push":
                            int numero = this.getPrograma().getRutinas().get(i).getInstrucciones().get(j).getNumero();
                            getPila().push(numero);
                        break;
                    case "add":
                            int numeroSuma1 = this.getPila().pop();
                            int numeroSuma2 = this.getPila().pop();
                            int Suma = numeroSuma1 + numeroSuma2;
                            getPila().push(numeroSuma1);
                            getPila().push(numeroSuma2);
                            getPila().push(Suma);
                            System.out.println(this.getPila().peek());
                        break;
                    case "sub":
                        int numeroResta1 = this.getPila().pop();
                        int numeroResta2 = this.getPila().pop();
                        int Resta = numeroResta1 + numeroResta2;
                        getPila().push(numeroResta1);
                        getPila().push(numeroResta2);
                        getPila().push(Resta);
                        System.out.println(this.getPila().peek());
                        break;
                    case "mul":
                        int numeroMul1 = this.getPila().pop();
                        int numeroMul2 = this.getPila().pop();
                        int Mul = numeroMul1 * numeroMul2;
                        getPila().push(numeroMul1);
                        getPila().push(numeroMul2);
                        getPila().push(Mul);
                        System.out.println(this.getPila().peek());
                        break;
                    case "write":
                            int auxiliarII = this.getPila().peek();
                            String auxiliarIdentificadorVariable = this.getPrograma().getRutinas().get(i).getInstrucciones().get(j).getVariable();
                            for(int k = 0 ; k < this.getMemoria().size() ; k++){
                                if(this.getMemoria().get(k).getIdentificador() == auxiliarIdentificadorVariable){
                                    this.getMemoria().get(k).setValor(auxiliarII);
                                }
                            }
                        break;
                    case "read":
                        int auxiliarIII;
                        String auxiliarIdentificadorVariableII = this.getPrograma().getRutinas().get(i).getInstrucciones().get(j).getVariable();
                        for(int k = 0 ; k < this.getMemoria().size() ; k++){
                            if(this.getMemoria().get(k).getIdentificador() == auxiliarIdentificadorVariableII){
                                auxiliarIII = this.getMemoria().get(k).getValor();
                                this.getPila().push(auxiliarIII);
                            }
                        }
                        break;
                }
            }
        }
    }
}