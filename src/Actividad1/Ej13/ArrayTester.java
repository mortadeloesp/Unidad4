//Angel Sempere Garcia 1ºJ
package Actividad1.Ej13;

import java.util.Scanner;

public class ArrayTester {


    public static void main(String[] args) {
        // Llamada para obtener el array original
        int array[] = leerEnteros();

        // Llamada para obtener el array transformado
        int transformedArray[] = transformarArray(array);

        // Llamada para mostrar el array original
        System.out.println("Array Original:");
        imprimirArray(array);

        // Llamada para mostrar el array transformado
        System.out.println("Array Transformado:");
        imprimirArray(transformedArray);
    }

    // metodo para leer los enteros en teclado y devolverlos en array
    public static int[] leerEnteros() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres introducir? ");
        int num = scanner.nextInt();

        int array[] = new int[num];

        System.out.println("Introduce los numeros que quieras usar: ");
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }


    // metodo para imprimir un array
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // metodo para transformar los enteros impares a -1
    public static int[] transformarArray (int[] array ) {
        int[] arraytransformado = new int[array.length];

        // Recorrer el array original
        for (int i = 0; i < array.length; i++) {
            // Si el número es par, lo dejamos igual, si es impar, colocamos -1
            if ( array[i] % 2 == 0) {
                arraytransformado[i] = array[i];
            } else {
                arraytransformado[i] = -1;
            }
        }
        return arraytransformado;

    }

}
