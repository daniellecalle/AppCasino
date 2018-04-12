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
public class Casino {

    private final Jugador[] jugadores;
    private int posicion;
    private final int nElementos;

    int sw;

    //metodos CONSTRUCTOR
    public Casino() {
        jugadores = new Jugador[4];
        posicion = 0;
        nElementos = jugadores.length;
    }

    public boolean estaVacio() {
        return posicion == 0;
    }

    public boolean estaLleno() {
        return posicion >= nElementos;
    }

    public void insertarJugador(Jugador objecto) {

        if (estaLleno()) {
            sw = 1;
        } else {
            jugadores[posicion] = objecto;
            posicion += 1;
            sw = 0;
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
