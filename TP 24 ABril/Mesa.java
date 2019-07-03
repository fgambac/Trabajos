import java.util.ArrayList;

public class Mesa {

    private int numMesa;
    private ArrayList<Plato> platos = new ArrayList<Plato>();
    private boolean ocupada;
    

    public Mesa(int numMesaX, ArrayList<Plato> platosX, boolean ocupadaX){
        this.numMesa = numMesaX; 
        this.platos = platosX;
        this.ocupada = ocupadaX;
    }


    public void setNumMesa(int numMesaX){
        this.numMesa = numMesaX;
    }
    public void setPlatos(ArrayList<Plato> platosX){
        this.platos = platosX;
    }
    public void setOcupada(boolean ocupadaX){
        this.ocupada = ocupadaX;
    } 



    public int getNumMesa(){
        return this.numMesa; 

    }

    public ArrayList<Plato> getPlatos(){
        return this.platos; 

    }

    public boolean getOcupada(){
        return this.ocupada; 

    }
    
    public void agregarPedidoDeClienteActual(Plato platosX){
        this.platos.add(platosX);
    }

}