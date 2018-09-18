package POO;

import java.util.HashMap;

public class Email {
    private HashMap<String,String> dados = new HashMap<>();

    /**
     *
     * @param r chave da tabela hash
     * @param e o email a ser adcionado
     * @return true se foi possivel adcionar
     */
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
        if(dados.containsKey(r)){
            dados.remove(r);
            return true;
        }
        return false;
    }
    public boolean update(String r, String e){
        if(dados.containsKey(r)){
            dados.remove(r);
            dados.put(r,e);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return " ";
    }
}
