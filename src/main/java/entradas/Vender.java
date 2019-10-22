package entradas;

import java.util.ArrayList;

public class Vender extends Thread{
   static ArrayList<Integer> contador = new ArrayList<>();

    @Override
    public void run() {
        venderEntrada();
    }
    public void venderEntrada(){
        Contador.setContador(Contador.getContador()+1);
        contador.add(Contador.getContador());
    }
}
