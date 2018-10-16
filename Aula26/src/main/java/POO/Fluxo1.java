package POO;

public class Fluxo1 extends Thread {
    public void run(){
        for(int i=0; i<10;i++){
            System.err.println("Herança");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.err.println(e.toString());
            }
            System.err.println("oi");
        }
    }
}
