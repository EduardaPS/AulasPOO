package TipoTelefone;

public class SemFio extends Telefone {
    private float frequencia, distancia;
    private int canais;

    public SemFio(int codigo, String numSerie, String modelo, float peso, Dimencao dim, float frequencia, float distancia, int canais) {
        super(codigo, numSerie, modelo, peso, dim);
        this.frequencia = frequencia;
        this.distancia = distancia;
        this.canais = canais;
    }

    @Override
    public String toString() {

        return super.toString() +
                "SemFio{" +
                "frequencia=" + frequencia +
                ", distancia=" + distancia +
                ", canais=" + canais +
                '}';
    }

    @Override
    public void ola() {
        System.out.println("Ola, sou um telefone sem fio");
    }
}
