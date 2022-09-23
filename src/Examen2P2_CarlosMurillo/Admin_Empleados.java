package Examen2P2_CarlosMurillo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admin_Empleados {
    Empleado empleado = new Empleado();
    private File archivo = null;

    public Admin_Empleados(String path) {
        archivo = new File(path);
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setUniverso(Empleado empleado) {
        this.empleado = empleado;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    public void cargarArchivo() {
        try {            
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    empleado = (Empleado) objeto.readObject();
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
            try{
                bw.writeObject(empleado);
            }catch(Exception e){
                
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
