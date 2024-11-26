package Actividad2.Ej12;

import java.util.Arrays;
import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {

        int array[];
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es el tamaño del array?");
        int size = scanner.nextInt();

        //añadiendole el size dentro del array le estamos dando una memoria variable, ya que la
        // estas eligiendo por parámetro anteriormente
        array = new int[size];

        for (int i = 0; i <array.length; i++) {
            System.out.println("Inserta un entero: ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        //bucle para imprimir en orden descendente

       /* for (int i = 0; i <array.length / 2; i++) {
            int ordenar = array[i];
            array[i] = array[array.length -1 - i];
            array[array.length -1 - i] = ordenar;
        }

        */

        int[] arrayOrdenado = array;
        System.out.print("El array ordenado es: ");
        for (int i = 0; i <arrayOrdenado.length; i++) {
            System.out.print(arrayOrdenado[i] + " ");
        }

    }
}