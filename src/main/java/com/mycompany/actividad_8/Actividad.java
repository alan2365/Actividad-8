package com.mycompany.actividad_8;

import java.util.Scanner;

/**
 *
 * @author AlanEduardo
 */
public class Actividad {

    public static void main(String[] args) {
        Deck d = new Deck();

        d.mazoNuevo();
        showMenu(d);
        //d.imprime();
    }

    public static void showMenu(Deck D) {
        Integer opc = 0;
        Scanner entradaEscaner = new Scanner(System.in);

        do {
            System.out.println("BIENVENIDO AL POKER!\n"
                    + "Seleccione una opcion:\n"
                    + "1 Mezclar deck\n"
                    + "2 Sacar una carta\n"
                    + "3 Carta al azar\n"
                    + "4 Generar una mano de 5 cartas\n"
                    + "0 Salir\n");
            opc = Integer.parseInt(entradaEscaner.nextLine());
            
            if(opc > 4){
                System.out.println("Opción no válida");
            }

            switch (opc) {
                case 1:
                    D.shuffle();
                    break;
                case 2:
                    D.head();
                    break;
                case 3:
                    D.pick();
                    break;
                case 4:
                    D.hand();
                    break;
                case 0:
                    break;
            }
            System.out.println();
        } while (opc != 0);
    }
}
