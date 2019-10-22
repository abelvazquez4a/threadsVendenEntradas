package entradas;

public class Contador {
    static int contador=0;

    public synchronized static int getContador() {
        return contador;
    }

    public synchronized static void setContador(int contador) {
        Contador.contador = contador;
    }
}
