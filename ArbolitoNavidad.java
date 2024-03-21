package com.mycompany.arbolitonavidad;

import java.util.Scanner;

public class ArbolitoNavidad {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        //Declarar la altura del árbol
        System.out.println("Ingrese de que tamaño quiere el arbol: ");
        int altura = leer.nextInt();

        //Bucle que recorre todas las filas(altura)
        for (int fila = 0; fila < altura; fila++) {
            //Bucle para los espacios
            for (int espacio = 0; espacio < (altura - fila - 1); espacio++) {
                System.out.print(" ");
            }
            //Bucles para los asteriscos
            for (int asterisco = 0; asterisco < (fila * 2) + 1; asterisco++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Tronco
        int largoTronco = 1;
        for (int base = 0; base < largoTronco; base++) {
            //Espacios en blando
            for (int espacio = 0; espacio < (altura - 2); espacio++) {
                System.out.print(" ");
            }

            //Barritas del tronco
            for (int barritas = 0; barritas < 3; barritas++) {
                System.out.print("|");
            }
            System.out.println("");
        }

    }
}
