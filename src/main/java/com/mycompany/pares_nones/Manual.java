//https://github.com/Migueluwu/Pares-Nones.git
package com.mycompany.pares_nones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Manual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaracion de variables
        Scanner entradaTeclado = new Scanner(System.in);
        int eleccion=0;
        int numero1=11;
        int numero2=11;
        int suma;
        
        //bucle para elegir pares o nones
        do {
            System.out.println("El jugador 1 tiene que elegir pares o nones");
            System.out.println("Escribe 1 para elegir pares y 2 para elegir nones");
            try{
            eleccion = entradaTeclado.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("Valor introducido no valido");
                entradaTeclado.nextLine();
            }
        } while (eleccion < 1 || eleccion > 2);
        //bucle para elegir cuantos dedos saca el jugador 1
        
        do {
            System.out.println("Jugador 1, escribe del 0 10 cuantos dedos enseñas:");
            try{
            numero1 = entradaTeclado.nextInt();
            
            }catch(InputMismatchException ime){
                System.out.println("Valor introducido no valido");
                entradaTeclado.nextLine();
            }
        } while (numero1 > 10 || numero1 < 0);
        
        //bucle para elegir cuantos dedos saca el jugador 2
        do {
            System.out.println("Jugador 2, escribe del 0 10 cuantos dedos enseñas:");
            try{
            numero2 = entradaTeclado.nextInt();
            
            }catch(InputMismatchException ime){
                System.out.println("Valor introducido no valido");
                entradaTeclado.nextLine();
            }
        } while (numero2 > 10 || numero2 < 0);
        //suma de numeros totales
        suma = numero1 + numero2;
        //salida por pantalla para recordar lo que se ha elegido
        if(eleccion==1){
            System.out.println("el jugador 1 elegio pares");
        }else{
            System.out.println("el jugador 2 eligio nones");
        }
        System.out.println("el jugador 1 saca " +numero1+
                "\nel jugador 2 saca "+numero2+
                "\nel total es de "+suma);
        //condiciones para que gane el jugador 1
        if (suma % 2 == 0 && eleccion == 1) {
            System.out.println("gana el jugador 1");
        } else if (suma % 2 != 0 && eleccion == 2) {
            System.out.println("gana el jugador 1");
        } else {//si no cumple las condiciones para que gane el jugador 1 gana el jugador 2
            System.out.println("gana el jugador 2");
        }
    

}
}
