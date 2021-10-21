package com.mycompany.actividad_8;

import java.util.ArrayList;

/**
 *
 * @author AlanEduardo
 */
public class Deck {

    ArrayList<Object> mazoRevuelto = new ArrayList<Object>();
    ArrayList<Object> mazo = new ArrayList<Object>();

    public void mazoNuevo() {

        for (int a = 0; a < Card.color.length - 1; a++) {

            for (int e = 0; e < Card.palo.length - 2; e++) {

                for (int i = 0; i < Card.valor.length; i++) {

                    Card negro = new Card(Card.palo[e], Card.color[a], Card.valor[i]);

                    mazo.add(negro);
                }
            }
        }

        for (int a = 1; a < Card.color.length; a++) {

            for (int e = 2; e < Card.palo.length; e++) {

                for (int i = 0; i < Card.valor.length; i++) {

                    Card rojo = new Card(Card.palo[e], Card.color[a], Card.valor[i]);

                    mazo.add(rojo);
                }
            }
        }
    }

    public void shuffle() {

        for (int i = 0; i < mazo.size(); i++) {
            int p = (int) (Math.random() * 4 + 0);
            int v = (int) (Math.random() * 13 + 0);

            if (Card.palo[p] == "Diamantes" || Card.palo[p] == "Corazones") {
                Card rojo = new Card(Card.palo[p], Card.color[1], Card.valor[v]);
                mazoRevuelto.add(rojo);
            } else {
                Card negro = new Card(Card.palo[p], Card.color[0], Card.valor[v]);
                mazoRevuelto.add(negro);
            }
        }

        System.out.println("SE MEZCLO EL DECK\n");
    }

    public void head() {

        if (mazoRevuelto.isEmpty()) {
            System.out.println("Primer carta del mazo\n" + mazo.remove(0));
            System.out.println("Quedan: " + mazo.size() + " en el Deck\n");
        } else {
            System.out.println("Primer carta del mazo\n" + mazoRevuelto.remove(0));
            System.out.println("Quedan: " + mazoRevuelto.size() + " en el Deck\n");
        }
    }

    public void pick() {

        if (mazoRevuelto.isEmpty()) {
            int r = (int) (Math.random() * mazo.size() + 0);
            System.out.println("Carta al azar del mazo\n" + mazo.remove(r));
            System.out.println("Quedan: " + mazo.size() + " en el Deck\n");
        } else {
            int r = (int) (Math.random() * mazoRevuelto.size() + 0);
            System.out.println("Carta al azar del mazo\n" + mazoRevuelto.remove(r));
            System.out.println("Quedan: " + mazoRevuelto.size() + " en el Deck\n");
        }
    }

    public void hand() {

        if (mazoRevuelto.isEmpty()) {
            System.out.println("Cartas al azar del mazo");

            for (int i = 0; i < 5; i++) {
                int r = (int) (Math.random() * mazo.size() + 0);
                System.out.println(mazo.remove(r));
            }

            System.out.println("Quedan: " + mazo.size() + " en el Deck");
        } else {
            System.out.println("Cartas al azar del mazo");

            for (int i = 0; i < 5; i++) {
                int r = (int) (Math.random() * mazoRevuelto.size() + 0);
                System.out.println(mazoRevuelto.remove(r));
            }

            System.out.println("Quedan: " + mazoRevuelto.size() + " en el Deck");
        }
    }

    public void imprime() {

        for (Object entry : mazoRevuelto) {
            System.out.println(entry);
        }

        for (Object entry : mazo) {
            System.out.println(entry);
        }

    }
}
