package POO;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    public Telefone telefone;
    public Email email;

    public Pessoa(String n, String s, Telefone t,Email e){

    }
    public Pessoa(String n, String s){

    }
    public boolean addTelefone(String n, String s){
        return true;
    }
    public boolean addEmail(String r, String e){
        return true;
    }
    public boolean updateTelefone(String r,String n){
        return true;
    }
    public boolean updateEmail(String r, String e){
        return true;
    }
    public boolean removeTelefone(String r){
        return true;
    }
    public boolean removeEmail(String r){
        return true;
    }
    public String toString(){
        return "";
    }
}
