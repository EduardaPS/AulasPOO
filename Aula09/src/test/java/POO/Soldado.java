package POO;

public class Soldado {
    private static int total;
    private int posicao;


    private final int movBasic = 6;
    private final String arBasic = "fuzil";

    public Soldado(){
        total++;
    }
    public void movimentar(){
        this.movimentar(movBasic);
    }
    public void movimentar(int quanto){
        this.posicao = this.posicao + quanto;
        System.out.println("O soldado está na posição: "+ posicao);
    }
    public void atacar(){
        this.atacar(arBasic);
    }
    public  void atacar(String arma){
        if(total >= 10){
            if(arma == "Baioneta" || arma == arBasic){
                System.out.println("o Soldado atirou com toda assua astucia e assim conseguiu a vitoria");
            }
            else if (arma == "Punho" || arma == "Pedra"){
                System.out.println("o Soldado lutou com toda assua astucia e assim sobreviveu com astucia");
            }
        }
        else {
            System.out.println("o Soldado está esperando reforços , não irá atacar enquanto não tiver mais "+ (10 -total) + " soldados");
        }
    }

}
