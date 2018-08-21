package POO;

public class Principal {

    public static void main(String[] args) {
        contador c = new contador();
        contador d = new contador();
        c.setValorAtual(0);
        d.setValorAtual(0);

        System.out.println(c.getValorAtual());
        System.out.println(d.getValorAtual());

        c.adicionaUm();
        c.adicionaUm();
        c.adicionaUm();

        System.out.println(c.getValorAtual());
        System.out.println(d.getValorAtual());

    }
}
