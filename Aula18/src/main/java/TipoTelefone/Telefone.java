package TipoTelefone;

public class Telefone {
    protected int codigo;
    protected String numSerie, modelo;
    protected float peso;
    protected Dimencao dim;

    public Telefone(int codigo, String numSerie, String modelo, float peso, Dimencao dim) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dim = dim;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codigo=" + codigo +
                ", numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", dim=" + dim +
                '}';
    }

    public void ola(){
        System.out.println("Olá, eu sou um telefone");
    }
}
