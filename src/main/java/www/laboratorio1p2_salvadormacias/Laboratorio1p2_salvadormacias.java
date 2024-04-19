/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package www.laboratorio1p2_salvadormacias;

//fila 3 asiento 3
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Apple
 */
public class Laboratorio1p2_salvadormacias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);
    public static ArrayList medianas = new ArrayList();

    public static void main(String[] args) {
        boolean salida = false;
        do {
            System.out.println("1.generacion de matriz"
                    + "\n2.ordenamiento de filas"
                    + "\n3.calculo de medianas"
                    + "\n4.ordenamiento de medianas"
                    + "\n5.calculo de la mediana de medianas"
                    + "\n6.salida completa"
                    + "\n7.salir"
                    + "\nIngrese opcion: \n\n");
            int op = lea.nextInt();
            switch (op) {
                case 1: {
                    generar();
                    break;

                }// fin case 1

                case 2: {
                    generar();
                    ordenamiento();

                    break;

                }//fin case 2

                case 3: {
                    generar();
                    calculo();
                    break;
                }//fin case 3

                case 4: {
                    generar();
                    ordenamiento_medianas();
                    break;
                }//fin case 4
                case 5: {
                    generar();
                    calculo_medianas();
                    break;
                }

                case 6: {
                    System.out.println("salida completa de resultados: ");
                    salida();

                    break;

                }

                case 7: {
                    salida = true;
                    System.out.println("se abandonara el programa...");
                    break;
                }

                default: {
                    System.out.println("opcion ingresada es invalida");
                    break;
                }
            }

        } while (salida != true);

    }//fin main

    public static void generar() {
        System.out.println("Ingrese el tamano de la matriz: ");
        int n = lea.nextInt();
        if (n % 2 == 0 && n < 4) {
            System.out.println("el numero ingresado tiene que ser impar y mayor a 4");

        } else {
            int matriz[][] = new int[n][n];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    Random r = new Random();

                }
            }
            for (int i = 0; i < matriz.length; i++) {
                System.out.println("[" + (matriz) + "]");
            }

        }

    }

    public static int[][] ordenamiento() {
        System.out.println("Ingrese el tamano de la matriz: ");
        int n = lea.nextInt();
        if (n % 2 == 0 && n < 4) {
            System.out.println("el numero ingresado tiene que ser impar y mayor a 4");

        } else {
            int matriz[][] = new int[n][n];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    Random r = new Random();

                }
            }
            for (int i = 0; i < matriz.length; i++) {
                System.out.println("[" + (matriz) + "]");
                return matriz;

            }

        }
        return null;
    }

    public static int[][] calculo() {

        System.out.println("Ingrese el tamano de la matriz: ");
        int n = lea.nextInt();
        if (n % 2 == 0 && n < 4) {
            System.out.println("el numero ingresado tiene que ser impar y mayor a 4");

        } else {
            int matriz[][] = new int[n][n];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    Random r = new Random();

                }
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    int y = 0;
                    y += i;
                    y %= matriz.length;
                    System.out.println("[" + (matriz) + "]");
                    return matriz;

                }

            }
        }
        return null;

    }

    public static int[][] ordenamiento_medianas() {
        generar();

        return null;

    }

    public static int[][] calculo_medianas() {
        generar();
        return null;

    }

    public static void salida() {
        int[][] matriz = null;
        ordenamiento();
        calculo();
        ordenamiento_medianas();
        calculo_medianas();

    }

}//fin clase
