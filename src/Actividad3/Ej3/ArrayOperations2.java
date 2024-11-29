package Actividad3.Ej3;

import Actividad3.EJ2.ArrayOperations;

import java.util.Arrays;

public class ArrayOperations2 {
    public static void main(String[] args) {
        // Creamos un array de ejemplo
        int[] array = {1, 2, 3, 4, 5};
        int[] arrayplus = new int[array.length];

        // a) Imprimir el array original
        System.out.print("Array original: ");
        ArrayOperations2.print(array);

        // b) Invertir el array
        ArrayOperations2.reverse(array);
        System.out.print("Array invertido: ");
        ArrayOperations2.print(array);

        // c) Encontrar el máximo
        int max = ArrayOperations2.max(array);
        System.out.println("Máximo del array: " + max);

        // d) Encontrar el mínimo
        int min = ArrayOperations2.min(array);
        System.out.println("Mínimo del array: " + min);

        // e) Sumar los elementos del array
        int sum = ArrayOperations2.sum(array);
        System.out.println("Suma del array: " + sum);

        // f) Comparar dos arrays (igualdad exacta)
        int[] array2 = {1, 2, 3, 4, 5};
        boolean areEqual = ArrayOperations2.equals(array, array2);
        System.out.println("¿Los arrays son iguales? " + areEqual);

        // g) Comparar dos arrays sin importar el orden
        boolean areEqualWithoutOrder = ArrayOperations2.equalsWithoutOrder(array, array2);
        System.out.println("¿Los arrays son iguales sin importar el orden? " + areEqualWithoutOrder);

        // h) Verificar si un número está en el array
        boolean isNumberOnArray = ArrayOperations2.isArrayOn(array, 3);
        System.out.println("¿El número 3 está en el array? " + isNumberOnArray);

        // i) Ordenar el array
        ArrayOperations2.sort(array);
        System.out.print("Array ordenado: ");
        ArrayOperations2.print(array);

        // j) Copiar el array
        int[] arrayCopy = new int[array.length];
        ArrayOperations2.copy(array, arrayCopy);
        System.out.print("Array copiado: ");
        ArrayOperations2.print(arrayCopy);

        // k) Eliminar números impares (poner 0 en su lugar)
        ArrayOperations2.removeOddNumbers(array);
        System.out.print("Array después de eliminar los números impares: ");
        ArrayOperations2.print(array);

        // l) imprimir los elementos del array que estén dentro del rango inicio y fin ambos inclusive


        System.out.print("Elementos dentro del array: ");
        ArrayOperations2.printRange(arrayplus, 1, 4);



    }


    // Método a) Imprimir el array con formato [1, 2, 3]
    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Método b) Invertir el array
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    // Método c) Devolver el máximo del array
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Método d) Devolver el mínimo del array
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Método e) Realizar la suma del array
    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Método f) Comparar dos arrays (igualdad exacta)
    public static boolean equals(int[] array1, int[] array2) {
        boolean falso = false;
        boolean verdadero = true;

        if (array1.length != array2.length) {
            return falso;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return falso;
            }
        }
        return verdadero;
    }

    // Método g) Comparar dos arrays sin importar el orden
    public static boolean equalsWithoutOrder(int[] array1, int[] array2) {
        boolean falso = false;

        if (array1.length != array2.length) {
            return falso;
        }

        int[] sortedArray1 = array1.clone();
        int[] sortedArray2 = array2.clone();

        // Ordenar ambos arrays
        sort(sortedArray1);
        sort(sortedArray2);

        // Comparar los arrays ordenados
        for (int i = 0; i < sortedArray1.length; i++) {
            if (sortedArray1[i] != sortedArray2[i]) {
                return falso;
            }
        }
        return true;
    }

    // Método h) Verificar si un array contiene un número
    public static boolean isArrayOn(int[] array, int number) {
        boolean dentro = true;
        for (int num : array) {
            if (num == number) {
                return dentro;
            }
        }
        return false;
    }

    // Método i) Ordenar el array
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Método j) Copiar el array de origen en el array destino
    public static void copy(int[] src, int[] dst) {
        if (src.length != dst.length) {
            System.out.println("Tienen que tener el la mis longitud.");
        }
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
    }

    // Método k) Eliminar los números impares (poner 0 en su lugar)
    public static void removeOddNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
    }

    //Metodo l) imprimir los elementos del array que estén dentro del rango inicio y fin ambos inclusive.
    public static void printRange(int[] array, int inicio, int fin) {

        // Verificar si los índices están dentro del rango
        if (inicio < 0 || fin >= array.length || inicio > fin) {
            System.out.println("El índice " + (inicio < 0 ? inicio : (fin >= array.length ? fin : "fuera de rango")) + " excede los límites del array.");
            return;
        }

        // Imprimir los elementos dentro del rango
        System.out.print("[");
        for (int i = inicio; i <= fin; i++) {
            System.out.print(array[i]);
            if (i < fin) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}


