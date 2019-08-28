import java.util.*;
public class Aula {
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    ArrayList<Computadora> compus = new ArrayList<Computadora>();
    ArrayList<Estante> estantes = new ArrayList<Estante>();
    ArrayList<Mesa> mesas = new ArrayList<Mesa>();
    private Pizarron pizarron;


    public Aula(ArrayList<Alumno> alumnos, ArrayList<Computadora> compus, ArrayList<Estante> estantes, ArrayList<Mesa> mesas, Pizarron pizarron) {
        this.alumnos = alumnos;
        this.compus = compus;
        this.estantes = estantes;
        this.mesas = mesas;
        this.pizarron = pizarron;
    }


    public ArrayList<Alumno> getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Computadora> getCompus() {
        return this.compus;
    }

    public void setCompus(ArrayList<Computadora> compus) {
        this.compus = compus;
    }

    public ArrayList<Estante> getEstantes() {
        return this.estantes;
    }

    public void setEstantes(ArrayList<Estante> estantes) {
        this.estantes = estantes;
    }

    public ArrayList<Mesa> getMesas() {
        return this.mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }

    public Pizarron getPizarron() {
        return this.pizarron;
    }

    public void setPizarron(Pizarron pizarron) {
        this.pizarron = pizarron;
    }
}