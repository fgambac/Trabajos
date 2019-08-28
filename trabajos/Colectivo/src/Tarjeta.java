import  java.util.*;

public class Tarjeta{

    private double pagoAbonado;
    private int cantviajes;
    private double metrosrec;

    public Tarjeta(double pagoAbonadox, int cantviajesx, double metrosrecx){
        metrosrec = metrosrecx;
        pagoAbonado = pagoAbonadox;
        cantviajes = cantviajesx;
    }

    public double getmet(){
        return this.metrosrec;
    }

    public double getpago(){
        return this.pagoAbonado;
    }
    public int getcant(){
        return this.cantviajes;
    }

    public void setpago(double pagox){
        pagoAbonado=pagox;
    }

    public void setmet(double metx){
        metrosrec=metx;
    }


    public boolean viajeDesc(){

        boolean bien_o_mal2;

        if(this.cantviajes>=25 && this.pagoAbonado == this.metrosrec*0.5/2){
            bien_o_mal2=true;


        } else{
            bien_o_mal2=false;

        }

        return bien_o_mal2;
    }


    public boolean metrosjustos(){
        boolean bien_o_mal;

        if(this.metrosrec*0.5 == this.pagoAbonado){
            bien_o_mal=true;
        }
        else{
            bien_o_mal=false;
        }
        return bien_o_mal;
    }

    public void viaje(){

        if(cantviajes>=25){
            this.pagoAbonado = (this.metrosrec*0.5)/2;
        }
        else{
            this.pagoAbonado= this.metrosrec*0.5;
        }
        cantviajes++;

    }


} 