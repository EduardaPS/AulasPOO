package POO;

public class Robo {
    private int coord[] = new int[2];
    private char lado;
    private int campo;

    public Robo(int area, int x, int y, char  lado){
        this.campo = (int)Math.sqrt(area);
        if(x > campo || y > campo){
            throw new IllegalArgumentException("coloque coordenadas dentro do campo");
        }
        if(lado != 'L' && lado != 'N' && lado != 'S' && lado != 'O'){
            throw new IllegalArgumentException("Lado " + lado + " não é permitido!");
        }
        this.coord[0] = x;
        this.coord[1] = y;
        this.lado = lado;
    }

    private void mudarDirecao(char dir){
        if(dir == 'E'){
            if(this.lado == 'N'){
                this.lado = 'O';
            }
            else if(this.lado == 'S'){
                this.lado = 'L';
            }
            else if(this.lado == 'L'){
                this.lado = 'N';
            }
            else if(this.lado == 'O'){
                this.lado = 'S';
            }
        }
        else if (dir == 'D') {
            if(this.lado == 'N'){
                this.lado = 'L';
            }
            else if(this.lado == 'S'){
                this.lado = 'O';
            }
            else if(this.lado == 'L'){
                this.lado = 'S';
            }
            else if(this.lado == 'O'){
                this.lado = 'N';
            }
        }
    }

    private void mover(){
        if(this.lado == 'N'){
            //if(this.campo >= )
        }
        else if(this.lado == 'S'){

        }
        else if(this.lado == 'L'){

        }
        else if(this.lado == 'O'){

        }
    }

    public void viagem(String plano){
        for(int i = 0; i < plano.length(); i++){
            char car = plano.charAt(i);
            if(car == 'E' || car == 'D'){
                mudarDirecao(car);
            }
            else if(car == 'M'){
                mover();
            }
        }
    }

    public int[] getCoord() {
        return coord;
    }

    public char getLado() {
        return lado;
    }
}



