package Examen2P2_CarlosMurillo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admin_Carros {
    ArrayList<Carro> lista;
    private File archivo = null;

    public Admin_Carros(String path) {
        archivo = new File(path);
    }

    public ArrayList<Carro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Carro> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setCarro(Carro car){
        this.lista.add(car);
    }
    
    public void cargarArchivo() {
        try {            
            lista = new ArrayList();
            Carro car;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((car = (Carro) objeto.readObject()) != null) {
                        lista.add(car);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Carro car : lista) {
                bw.writeObject(car);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
