package POO;

import java.util.HashMap;

public class Email {
    private HashMap<String,String> dados = new HashMap<>();

    public boolean add(String r, String e){
        String emailER = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if(!e.matches(emailER)){
            return false;
        }
        if(dados.containsKey(r)){
            return false;
        }
        dados.put(r,e);
        return true;
    }
    public boolean remove(String r){
        return false;
    }
    public boolean update(String r, String e){
        return true;
    }
    public String toString(){
        return "";
    }
}
