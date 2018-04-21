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
public class Jugador {

    //ATRIBUTOS
    private int random;
    private String nom1, nom2, nom3, nom4;
    private double vrApostado1, vrApostado2, vrApostado3, vrApostado4;
    private double saldo1, saldo2, saldo3, saldo4;
    private int numApostado1, numApostado2, numApostado3, numApostado4;

    //CONTRUSTRUCTOR por defecto
    public Jugador() {
    }

    /*public boolean validar() {
        return (valorApostar <= 10000 && numeroApostar >= 0 && numeroApostar <= 10);
    }*/
    /**
     * @return the nom1
     */
    public String getNom1() {
        return nom1;
    }

    /**
     * @param nom1 the nom1 to set
     */
    public void setNom1(String nom1) {
        this.nom1 = nom1;
    }

    /**
     * @return the nom2
     */
    public String getNom2() {
        return nom2;
    }

    /**
     * @param nom2 the nom2 to set
     */
    public void setNom2(String nom2) {
        this.nom2 = nom2;
    }

    /**
     * @return the nom3
     */
    public String getNom3() {
        return nom3;
    }

    /**
     * @param nom3 the nom3 to set
     */
    public void setNom3(String nom3) {
        this.nom3 = nom3;
    }

    /**
     * @return the nom4
     */
    public String getNom4() {
        return nom4;
    }

    /**
     * @param nom4 the nom4 to set
     */
    public void setNom4(String nom4) {
        this.nom4 = nom4;
    }

    /**
     * @return the vrApostado1
     */
    public double getVrApostado1() {
        return vrApostado1;
    }

    /**
     * @param vrApostado1 the vrApostado1 to set
     */
    public void setVrApostado1(double vrApostado1) {
        this.vrApostado1 = vrApostado1;
    }

    /**
     * @return the vrApostado2
     */
    public double getVrApostado2() {
        return vrApostado2;
    }

    /**
     * @param vrApostado2 the vrApostado2 to set
     */
    public void setVrApostado2(double vrApostado2) {
        this.vrApostado2 = vrApostado2;
    }

    /**
     * @return the vrApostado3
     */
    public double getVrApostado3() {
        return vrApostado3;
    }

    /**
     * @param vrApostado3 the vrApostado3 to set
     */
    public void setVrApostado3(double vrApostado3) {
        this.vrApostado3 = vrApostado3;
    }

    /**
     * @return the vrApostado4
     */
    public double getVrApostado4() {
        return vrApostado4;
    }

    /**
     * @param vrApostado4 the vrApostado4 to set
     */
    public void setVrApostado4(double vrApostado4) {
        this.vrApostado4 = vrApostado4;
    }

    /**
     * @return the numApostado1
     */
    public int getNumApostado1() {
        return numApostado1;
    }

    /**
     * @param numApostado1 the numApostado1 to set
     */
    public void setNumApostado1(int numApostado1) {
        this.numApostado1 = numApostado1;
    }

    /**
     * @return the numApostado2
     */
    public int getNumApostado2() {
        return numApostado2;
    }

    /**
     * @param numApostado2 the numApostado2 to set
     */
    public void setNumApostado2(int numApostado2) {
        this.numApostado2 = numApostado2;
    }

    /**
     * @return the numApostado3
     */
    public int getNumApostado3() {
        return numApostado3;
    }

    /**
     * @param numApostado3 the numApostado3 to set
     */
    public void setNumApostado3(int numApostado3) {
        this.numApostado3 = numApostado3;
    }

    /**
     * @return the numApostado4
     */
    public int getNumApostado4() {
        return numApostado4;
    }

    /**
     * @param numApostado4 the numApostado4 to set
     */
    public void setNumApostado4(int numApostado4) {
        this.numApostado4 = numApostado4;
    }

    /**
     * @return the random
     */
    public int getRandom() {
        return random;
    }

    public void Random() {
        this.random = (int) (Math.random() * 10 - 1);
    }

    /**
     * @return the saldo1
     */
    public double getSaldo1() {
        return saldo1;
    }

    /**
     * @param saldo1 the saldo1 to set
     */
    public void setSaldo1(double saldo1) {
        this.saldo1 = saldo1;
    }

    /**
     * @return the saldo2
     */
    public double getSaldo2() {
        return saldo2;
    }

    /**
     * @param saldo2 the saldo2 to set
     */
    public void setSaldo2(double saldo2) {
        this.saldo2 = saldo2;
    }

    /**
     * @return the saldo3
     */
    public double getSaldo3() {
        return saldo3;
    }

    /**
     * @param saldo3 the saldo3 to set
     */
    public void setSaldo3(double saldo3) {
        this.saldo3 = saldo3;
    }

    /**
     * @return the saldo4
     */
    public double getSaldo4() {
        return saldo4;
    }

    /**
     * @param saldo4 the saldo4 to set
     */
    public void setSaldo4(double saldo4) {
        this.saldo4 = saldo4;
    }

    /*public boolean Validar1() {

        return ((numApostado1 >= 0 && numApostado1 <= 10) && (numApostado2 >= 0 && numApostado2 <= 10)
                && (numApostado3 >= 0 && numApostado3 <= 10) && (numApostado4 >= 0 && numApostado4 <= 10));
    }
    public boolean Validar2() {
        return ((vrApostado1 <= saldo1) && (vrApostado2 <= saldo2) && (vrApostado3 <= saldo3) && (vrApostado4 <= saldo4));
    }*/

    public double ganador1() {

        if (random == getNumApostado1()) {
            return saldo1 = vrApostado1 + saldo1;
        } else {
            return saldo1 = saldo1 - vrApostado1;
        }
    }

    public double ganador2() {

        if (random == getNumApostado2()) {
            return saldo2 = vrApostado2 + saldo2;
        } else {
            return saldo2 = saldo2 - vrApostado2;
        }
    }

    public double ganador3() {

        if (random == getNumApostado3()) {
            return saldo3 = vrApostado3 + saldo3;
        } else {
            return saldo3 = saldo3 - vrApostado3;
        }
    }

    public double ganador4() {

        if (random == getNumApostado4()) {
            return saldo4 = vrApostado4 + saldo4;
        } else {
            return saldo4 = saldo4 - vrApostado4;
        }
    }

}
