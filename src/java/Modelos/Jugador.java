/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author daniel
 */
public class Jugador {
    
    private String nombre;
    private double valorApostar;
    private int numeroApostar;

    //Contructor Por Defecto. 
    public Jugador() {
    }

    public Jugador(String nombre, double valorApostar, int numeroApostar) {
        this.nombre = nombre;
        this.valorApostar = valorApostar;
        this.numeroApostar = numeroApostar;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the valorApostar
     */
    public double getValorApostar() {
        return valorApostar;
    }

    /**
     * @param valorApostar the valorApostar to set
     */
    public void setValorApostar(double valorApostar) {
        this.valorApostar = valorApostar;
    }

    /**
     * @return the numeroApostar
     */
    public int getNumeroApostar() {
        return numeroApostar;
    }

    /**
     * @param numeroApostar the numeroApostar to set
     */
    public void setNumeroApostar(int numeroApostar) {
        this.numeroApostar = numeroApostar;
    }
    
    
}
