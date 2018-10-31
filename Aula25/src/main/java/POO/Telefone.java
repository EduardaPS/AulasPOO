package POO;

import java.util.HashMap;

public class Telefone {
    private HashMap<String, String> dados;

    public Telefone(){}
    public boolean add(String r, String n){
        if(dados.containsKey(r)){
            return false;
        }
        dados.put(r,n);
        return true;
    }
    public boolean remove (String r){
        if(dados.containsKey(r)){
            dados.remove(r);
            return true;
        }
        return false;
    }
    public boolean update (String r, String n){
        if(dados.containsKey(r)){
            dados.remove(r);
            dados.put(r,n);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "dados=" + dados +
                '}';
    }
}
