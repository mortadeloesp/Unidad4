
//Ejercicios 2 y 3


package Actividad2.Ej1;

import java.util.Scanner;

public class Ej1 {
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
    }
}
