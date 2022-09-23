package Examen2P2_CarlosMurillo;

import java.io.Serializable;

public class Empleado implements Serializable{
    private String nombre;
    private int edad;
    private String identidad;
    private int reparados;
    
    private static final long SerialVersionUID=88L;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, String identidad, int reparados) {
        this.nombre = nombre;
        this.edad = edad;
        this.identidad = identidad;
        this.reparados = reparados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public int getReparados() {
        return reparados;
    }

    public void setReparados(int reparados) {
        this.reparados = reparados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", identidad=" + identidad + ", reparados=" + reparados + '}';
    }
    
    
    
}
