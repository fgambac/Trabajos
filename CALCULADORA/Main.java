import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();

        Programa programa = new Programa("programa");
        calculadora1.setPrograma(programa);
        Programa programaX = new Programa("programaX");
        programaX = calculadora1.getPrograma();

        Rutina rutina1 = new Rutina("Rutina A");
        Rutina rutina2 = new Rutina("Rutina B");
        programaX.agregarRutina(rutina1);
        programaX.agregarRutina(rutina2);

        Variable variable1 = new Variable("var1", 15);
        Variable variable2 = new Variable("var2", 5);
        Variable variable3 = new Variable("var3");
        Variable variable4 = new Variable("var4", 27);
        Variable variable5 = new Variable("var5");

        calculadora1.agregarAMemoria(variable1);
        calculadora1.agregarAMemoria(variable2);
        calculadora1.agregarAMemoria(variable3);
        calculadora1.agregarAMemoria(variable4);
        calculadora1.agregarAMemoria(variable5);

        rutina1.agregarInstruccion(new Instruccion("read", "var1"));
        rutina1.agregarInstruccion(new Instruccion("push", 2));
        rutina1.agregarInstruccion(new Instruccion("add"));
        rutina1.agregarInstruccion(new Instruccion("write", "var2"));

        rutina2.agregarInstruccion(new Instruccion("read", "var3"));
        rutina2.agregarInstruccion(new Instruccion("read", "var4"));
        rutina2.agregarInstruccion(new Instruccion("mul"));
        rutina2.agregarInstruccion(new Instruccion("write", "var5"));

        calculadora1.ejectuar();
    }
}
