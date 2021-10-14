package com.mycompany.actividad_8;

/**
 *
 * @author AlanEduardo
 */
public class Actividad {
    public static void main(String[] args) {
        Deck d = new Deck();
        
        d.mazoNuevo();
        d.shuffle();
        d.head();
        d.pick();
        d.hand();
        //d.imprime();
    }
}
