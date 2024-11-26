package Actividad3.EJ2;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {

        int[] array = {230, 341, 1, 2};
        int[] array2 = {231, 341, 1, 2};

        ArrayOperations.print(array);
        ArrayOperations.reverso(array);
        ArrayOperations.max(array);
        ArrayOperations.min(array);
        ArrayOperations.suma(array);
        ArrayOperations.equals(array, array2);
        ArrayOperations.equalsSinOrden(array, array2);
        System.out.println(ArrayOperations.isArrayOn(array,array2)); // Es boleano
        System.out.println("--------------------------------------");
        ArrayOperations.sort(array);
        ArrayOperations.copy(array2, array);
        ArrayOperations.removeOddNumbers(array);

    }

    //a = Método que imprima el array con formato [1, 2, 3].
    public static void print(int[] array) {

        String resultado = "[";

        for (int i = 0; i < array.length; i++) {
            resultado += array[i]; // Añadir el elemento actual
            if (i < array.length - 1) {
                resultado += ", "; // Añadir coma y espacio entre elementos
            }
        }
        resultado += "]";
        System.out.println();
        System.out.print("a)");
        System.out.println(resultado);  // Imprimir la cadena construida
        System.out.println("--------------------------------------");
    }

    //b = metodo que le da la vuelta a los arrays
    public static void reverso(int[] array) {
        System.out.println("b) Array original: " + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int ordenar = array[i]; //Variable temporal
            array[i] = array[array.length - 1 - i]; //Remplazar con el elemento opuesto
            array[array.length - 1 - i] = ordenar;

        }
        System.out.println("   Array revertido: " + Arrays.toString(array));
        System.out.println("--------------------------------------");
    }

    //c = metodo que localiza el elemento maximo
    public static void max(int[] max) {
        Arrays.sort(max);

        System.out.print("c) ");
        for (int i = 0; i < max.length; i++) {
        }
        System.out.println("Valor maximo: " + max[3]);
        System.out.println("--------------------------------------");
    }

    //d = metodo que localiza el minimo
    public static void min(int[] array) {
        Arrays.sort(array);

        System.out.print("d) ");
        for (int i = 0; i < array.length; i++) {
        }
        System.out.println("Valor mínimo: " + array[0]);
        System.out.println("--------------------------------------");
    }

    //e = metodo que suma el array
    public static void suma (int[] suma)  {
        int sumaTotal = 0;
        System.out.print("e) ");
        for (int valor : suma) {
            sumaTotal += valor;
        }
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("--------------------------------------");
    }

    //f = metodo que compara dos arrays
    public static void equals (int[] array1, int[] array2) {
        boolean sonIguales = true;

        System.out.print("f) ");
        for (int i = 0; i < array1.length; i++) {
            if (array1 != array2) {
                sonIguales = false;
                break;
            }
        }
        if (sonIguales) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays no son iguales.");
        }
        System.out.println("--------------------------------------");
    }

    //g = metodo que compara dos arrays sin orden
    public static void equalsSinOrden (int[] array1, int[] array2) {

        System.out.print("g) ");
        for (int i = 0; i <array1.length; i++) {
            if (array1[i] != array2[i]) {
                System.out.println("No son iguales");
                break;
            } else {
                System.out.println("Son iguales");

            }
        }
        System.out.println("--------------------------------------");
    }

    //h = metodo que observa si los elementos del segundo array coinciden en el del primero
    public static boolean isArrayOn (int[] src, int[] dst) {
        Arrays.sort(src);
        Arrays.sort(dst);

        for (int i : src) {
            boolean encontrado = true;
            for (int j : dst) {
                if (i == j) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                return false;
            }
        }
        System.out.print("h) ");
        return true;
    }

    //i = metodo que coge el array y lo ordena en orden ascendente.
    public static void sort(int[] array) {
        System.out.print("i) El array ordenado es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------");
    }

    //j = metodo que copia un array en el otro
    public static void copy (int[] src, int[] dst) {
        if (src.length != dst.length) {
            System.out.println("Deben tener la misma longitud.");
        }
        System.out.print("j) ");
        for (int i = 0; i <src.length; i++) {
            dst[i] = src[i];
            System.out.print(dst[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------");
    }

    public static void removeOddNumbers (int[] array) {
          for (int i = 0; i <array.length; i++) {
              if (array[i] % 2 != 0 ) {
                  array[i] = 0;
              } else {
                  System.out.println("k) Numeros no impares del array: " + array[i]);
              }
          }
    }
}
