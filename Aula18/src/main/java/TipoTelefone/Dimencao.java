package TipoTelefone;

public class Dimencao {
    private int h;
    private int l;
    private int p;

    public Dimencao(int h, int l, int p) {
        this.h = h;
        this.l = l;
        this.p = p;
    }

    public int getH() {
        return h;
    }

    public int getL() {
        return l;
    }

    public int getP() {
        return p;
    }

    @Override
    public String toString() {
        return "Dimencao{" +
                "h=" + h +
                ", l=" + l +
                ", p=" + p +
                '}';
    }
}
