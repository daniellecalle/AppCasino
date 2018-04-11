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

    private Jugador[] jugadores;
    private int nElementos;
    private int posicion;

    int sw = 0;
    
    //metodos CONSTRUCTOR
    public Casino() {
    }

    public Casino(int tam) {
        jugadores = new Jugador[tam];
        nElementos = tam;
        posicion = 0;
    }
    
    public boolean estaVacio(){       
        return posicion == 0;
    }
    
    public boolean estaLleno(){
        return posicion>=nElementos;
    }
    
    public int  insertarJugador(Jugador objJ){
        
        if(estaLleno()){
            sw = 1;
        }else{
            jugadores[posicion] = objJ;
        }
      
        return sw;
    }
}
