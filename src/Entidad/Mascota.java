/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Martin
 */
public class Mascota {
    
    private String color;
    private String tipo;
    private String nombre;
    private String raza;
    private int edad;
    private boolean cola;

    public Mascota(String color, String tipo, String nombre, String raza, int edad, boolean cola) {
        this.color = color;
        this.tipo = tipo;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.cola = cola;
    }

    public Mascota() {
    }

    public Mascota(String tipo, String nombre, int edad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }
    
    

    @Override
    public String toString() {
        return "Mascota{" + "color=" + color + ", tipo=" + tipo + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", cola=" + cola + '}';
    }
    
    
}
