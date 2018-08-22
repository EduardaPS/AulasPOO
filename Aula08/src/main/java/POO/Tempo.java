package POO;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    public Tempo(int h){
        this.minuto = 0;
        this.segundo = 0;
        if(h < 24){
            this.hora = h;
        }
        else {
            this.hora = 0;
        }

    }
    public Tempo(int h,int m){
        this.segundo = 0;
        if(h < 24){
            this.hora = h;
        }

        if(m < 60){
            this.minuto = m;
        }
        else {
            this.hora = 0;
            this.minuto = 0;
            return;
        }

    }

    public Tempo(int h, int m, int s){
        if(h < 24){
            this.hora = h;
        }
        if(m < 60){
            this.minuto = m;
        }
        if(s < 60){
            this.segundo = m;
        }
        else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
            return;
        }
    }

    public String toString() {
        return  hora + ":" + minuto + ":" + segundo;
    }

    public boolean setHora(int hora) {
        if(hora < 24){
            this.hora = hora;
            return true;
        }
        return false;
    }

    public boolean setMinuto(int minuto) {
        if(minuto < 60){
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    public boolean setSegundo(int segundo) {
        if(segundo < 60){
            this.segundo = segundo;
            return true;
        }
        return false;
    }

    public long retornaEmSegundos(){

    }
}
