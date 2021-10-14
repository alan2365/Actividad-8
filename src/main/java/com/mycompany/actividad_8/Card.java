package com.mycompany.actividad_8;

/**
 *
 * @author AlanEduardo
 */
public class Card {

    private String k1;
    private String k2;
    private String k3;

    public static String[] palo = {"Treboles", "Picas", "Corazones", "Diamantes"};
    public static String[] color = {"Negro", "Rojo"};
    public static String[] valor = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

    public Card(String k1, String k2, String k3) {
        this.k1 = k1;
        this.k2 = k2;
        this.k3 = k3;
    }

    public Card(){
        
    }

    @Override
    public String toString() {
        return "Card " + "{" + k1 + "}, {" + k2 + "}, {" + k3 + '}';
    }

}
