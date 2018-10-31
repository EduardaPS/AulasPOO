package POO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> contato;



    public void addPessoa (Pessoa p){

    }
    public boolean removePessoa(String n,String s){
        return true;
    }
    public boolean addTelefone(String r,String n,int plndex ){
        return true;
    }
    public boolean addEmail(String r, String e,int plndex){
        return true;
    }
    public boolean updateTelefone(String r,String n,int plndex){
        return true;
    }
    public boolean updateEmail(String r, String e,int plndex){
        return true;
    }
    public boolean removeTelefone(String r, int plndex){
        return true;
    }
    public boolean removeEmail(String r, int plndex){
        return true;
    }
    public String toString(){
        return "";
    }
    public void salvar(String nomeArquivo){
        File arquivo = new File(nomeArquivo);
        try{
            FileOutputStream fout = new FileOutputStream(arquivo);

        }
    }
    public void lerDoDisco(){

    }
}
