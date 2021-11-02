//https://github.com/Migueluwu/Pares-Nones.git
package com.mycompany.pares_nones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class VsMaquina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        Scanner entradaTeclado = new Scanner(System.in);
        Random numAleatorio = new Random();
        int eleccion;
        int numero1;
        int numero2;
        int suma;
        //buble para elegir pares o nones
        do {
            System.out.println("El jugador tiene que elegir pares o nones");
            System.out.println("Escribe 1 para elegir pares y 2 para elegir nones");
            eleccion = entradaTeclado.nextInt();
        } while (eleccion < 1 || eleccion > 2);
        // Bucle para que el jugador eliga cuantos dedos saca
        do {
            System.out.println("Jugador , escribe del 0 10 cuantos dedos enseñas:");
            numero1 = entradaTeclado.nextInt();
        } while (numero1 > 10 || numero1 < 0);
        //Se guarda un numero aleatorio entre 0 y 10
        numero2 = numAleatorio.nextInt(11);
        // se añade salidas de teclado para aclarar lo que ha pasado
        if(eleccion==1){
            System.out.println("el jugador eligio pares");
        }else{
            System.out.println("el jugador eligio nones");
        }
        System.out.println("el jugador elige "+numero1);
        System.out.println("la maquina elige " + numero2);
        suma = numero1 + numero2;
        // COndiciones para que gane el jugador
        if (suma % 2 == 0 && eleccion == 1) {
            System.out.println("gana el jugador");
        } else if (suma % 2 != 0 && eleccion == 2) {
            System.out.println("gana el jugador");
        } else {//si no gana el jugador gana la maquina
            System.out.println("gana la maquina");
        }
    }

}
