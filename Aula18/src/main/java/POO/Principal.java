package POO;

import TipoTelefone.Dimencao;
import TipoTelefone.SemFio;
import TipoTelefone.Telefone;

public class Principal {
    public static void main(String[] args) {
        Telefone t1 = new Telefone(10, "P3g5","G2",0.5f,new Dimencao(12,14,20));
        System.out.println(t1);
        SemFio t2 = new SemFio(14,"pqer","eeee",0.6f,new Dimencao(12,13,16),5000f,200f,5);
        System.out.println(t2);

        t1.ola();
        System.out.println(" ");
        t2.ola();

        Object o = new Object();

    }
}
