import java.util.ArrayList;

public class Restaurante {


    private ArrayList<Mesa> mesas = new ArrayList<Mesa>();
    private ArrayList<Plato> platos = new ArrayList<Plato>();
    private String cocinero;
    

    public Restaurante(ArrayList<Mesa> mesasX ,ArrayList<Plato> platosX, String cocineroX){

        this.mesas = mesasX; 
        this.platos = platosX;
        this.cocinero = cocineroX;
    }


    public String getCocinero(){
        return this.cocinero; 

    }
    public void mostrarRegistro(){
        for(int i=0;i<this.platos.size();i++){
            System.out.print(this.platos.get(i).getNumPedido()+" ");
            System.out.print(this.platos.get(i).getNumMesa()+" ");
            System.out.print(this.platos.get(i).getNombre()+" ");
            System.out.print(this.platos.get(i).getCantidad()+" ");
            System.out.print(this.platos.get(i).getFecha()+" ");
            System.out.println();
        }
    }

    public void agregarMesa(Mesa mesasX){
        this.mesas.add(mesasX);
    }


    public void agregarPlatoAPreparar(Plato platosX){
        this.platos.add(platosX);
    }
}

public String masPedido(){

     
    int[]cantidad = new int [this.platos.size[], ]


        for(int i=0;i<platos.size();i++){ 
            for(int j=0;j<platos.size();j++){
                if( platos.get(i).getNombre()==platos.get(j).getNombre() ){
                    cantidad[i]++;
                     }
                else if()
                    cantidadMayor
                    platos[i]=cantidad[i]                    
                }
             }
        int mayor=cantidad[0];

        for(int i=0;i<cantidad.size();i++){
            if(cantidad[i]>=mayor){
                mayor=cantidad[i];

            }          
        }
        Plato platoMayor = new Plato();
        platoMayor = platos.get(mayor);

           return this.plato.getNombre
  


           }









