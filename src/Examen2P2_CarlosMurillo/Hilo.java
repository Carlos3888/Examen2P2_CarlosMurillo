package Examen2P2_CarlosMurillo;

import javax.swing.JProgressBar;

public class Hilo extends Thread{
    private JProgressBar progBar;
    private int costo;

    public Hilo(JProgressBar progBar, int costo) {
        this.progBar = progBar;
        this.costo = costo;
    }
    
    @Override
    public void run() {
        try{
            while(costo>0){
                System.out.println("aaaaaaaaaaa");
                costo=costo-1000;
                try {
                    Thread.sleep(60);
                } catch (InterruptedException ex) {
                }
            }
        }catch(Exception e){
            
        }
    }
}
