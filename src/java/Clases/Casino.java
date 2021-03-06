/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author daniel
 */

public class Casino {

    static private Jugador[] jugadores;//Se Define un Vector de objecto tipo clase cuenta
    private int posicion;//para saber hasta dodne se lleno el vector
    static private int nElementos;//numero de elementos del vector

    int sw = 0;

    
    //metodos CONSTRUCTOR
    public Casino() {
        nElementos = 4;
        posicion = 0;
        jugadores = new Jugador[nElementos];  
    }

    public boolean estaVacio() {
        return posicion == 0;
    }

    public boolean estaLleno() {
        return posicion >= nElementos;
    }

    public void insertarJugador(Jugador objecto) {

        if (!estaLleno()) {
            jugadores[posicion] = objecto;
            posicion++;
        }
    }

    public boolean validarDatos() {
        return sw != 1;
    }

    public int numeroJugadores() {
        return posicion;
    }

    public Jugador[] vJugadores() {
        return jugadores;
    }
    
}
