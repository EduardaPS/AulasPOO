package POO;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class contador {
    private int valorAtual;

    public void setValorAtual(int valorAtual) {
        this.valorAtual = valorAtual;
    }

    public void adicionaUm(){
        this.valorAtual++;
    }

    public int getValorAtual() {
        return this.valorAtual;
    }

    public void menosUm(){
        if(this.valorAtual == 0){
            throw new ValueException("não pode decrementar o valor ficara negativo");
        }
        else {
            this.valorAtual--;
        }
    }

    public void  zerar(){
        this.valorAtual = 0;
    }
}
