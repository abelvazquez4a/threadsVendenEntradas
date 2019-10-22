package entradas;


import java.util.ArrayList;
import java.util.Collections;

public class SalesManager {
    public static void main(String[] args) {
        ArrayList<Vender> listaVendedores = new ArrayList<>();
        while (listaVendedores.size()<1000) {
            for (int i = 0; i < 5; i++) {
                Vender vendedor = new Vender();
                vendedor.start();
                listaVendedores.add(vendedor);
            }
            for (Vender vendedor : listaVendedores) {
                try {
                    vendedor.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        ArrayList<Integer> lista = Vender.contador;
        Collections.sort(lista);
        for (Integer entero:lista) {
            System.out.println("He vendido la entrada número: "+entero);
        }
    }
}
