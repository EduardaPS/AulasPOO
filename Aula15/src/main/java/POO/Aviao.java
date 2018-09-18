package POO;

import java.util.ArrayList;

public class Aviao {
    private ArrayList<Motor> motor;
    private int velocidade;
    private int peso;
    private int nTripulantes;
    private int nMaxPassageiros;
    private boolean botao;

    public boolean manche(int v){
        return true;
    }
    public boolean mudaBotao(){
        return true;
    }
    public boolean direcionar(String d, int f){
        return true;
    }
}
