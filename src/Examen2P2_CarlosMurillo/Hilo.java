package Examen2P2_CarlosMurillo;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Hilo extends Thread{
    private JProgressBar progBar;
    private int costo;
    private int num;
    private int num2;
    private boolean desi;
    private int au_repa;
    private JLabel repa;
    String nombre;
    int id;
    JButton boton;

    public Hilo(JProgressBar progBar, int costo, int au_repa, JLabel repa, String nombre, int id, JButton boton) {
        this.progBar = progBar;
        this.costo = costo;
        desi = true;
        this.num2 = costo/1000;
        this.num = num = costo/1000;
        this.au_repa = au_repa;
        this.repa = repa;
        this.nombre = nombre;
        this.id = id;
        this.boton = boton;
    }
    
    @Override
    public void run() {
        try{
            while(num2>0){
                int d = 1;
                
                if (progBar.getValue() > 0) {
                    d = progBar.getValue();
                }
                int num1 = 100/num;
                progBar.setValue(d+num1);
                num2--;
                try {
                    Thread.sleep(600);
                } catch (InterruptedException ex) {
                }
            }
            progBar.setValue(0);
            Random r = new Random();
            int num = 1+r.nextInt(100);
            if(au_repa == 0){
                repa.setText("Reparacion exitosa");
            }else if(au_repa >= 1 && au_repa <= 5){
                if(num <= 30){
                    repa.setText("Reparacion fallida");
                }else{
                    repa.setText("Reparacion exitosa");
                }
            }else if(au_repa >= 6 && au_repa <= 15){
                if(num <= 22){
                    repa.setText("Reparacion fallida");
                }else{
                    repa.setText("Reparacion exitosa");
                }
            }else if(au_repa >= 16 && au_repa <= 30){
                if(num <= 13){
                    repa.setText("Reparacion fallida");
                }else{
                    repa.setText("Reparacion exitosa");
                }
            }else if(au_repa > 30){
                if(num <= 7){
                    repa.setText("Reparacion fallida");
                }else{
                    repa.setText("Reparacion exitosa");
                }
            }
            String rep = repa.getText();
            if(rep.equals("Reparacion exitosa")){
                Admin_Empleados emp = new Admin_Empleados("./archivos/Empleados/"+nombre+".emp");
                emp.cargarArchivo();
                Empleado empleado = emp.getEmpleado();
                int au_rep2 = empleado.getReparados();
                au_rep2++;
                empleado.setReparados(au_rep2);
                emp.setEmpleado(empleado);
                emp.escribirArchivo();
                
                Admin_Carros car = new Admin_Carros("./archivos/Carros.car");
                car.cargarArchivo();
                ArrayList<Carro> carros = car.getLista();
                carros.get(id-1).setEstado("Reparado");
                car.setLista(carros);
                car.escribirArchivo();
                
            }
            boton.doClick();
            
            
        }catch(Exception e){
            
        }
    }
    
}
