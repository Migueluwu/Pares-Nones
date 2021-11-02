/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        // TODO code application logic here
        Scanner entradaTeclado = new Scanner(System.in);
        Random numAleatorio = new Random();
        int eleccion;
        int numero1;
        int numero2;
        int suma;
        do {
            System.out.println("El jugador 1 tiene que elegir pares o nones");
            System.out.println("Escribe 1 para elegir pares y 2 para elegir nones");
            eleccion = entradaTeclado.nextInt();
        } while (eleccion < 1 || eleccion > 2);
        do {
            System.out.println("Jugador 1, escribe del 0 10 cuantos dedos enseñas:");
            numero1 = entradaTeclado.nextInt();
        } while (numero1 > 10 || numero1 < 0);
        numero2=numAleatorio.nextInt(10)+1;
        System.out.println("la maquina elige "+numero2);
        suma = numero1 + numero2;
        if (suma % 2 == 0 && eleccion == 1) {
            System.out.println("gana el jugador 1");
        } else if (suma % 2 != 0 && eleccion == 2) {
            System.out.println("gana el jugador 1");
        } else {
            System.out.println("gana la maquina");
        }
    }

}
