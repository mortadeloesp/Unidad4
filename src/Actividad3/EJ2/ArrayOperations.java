package Actividad3.EJ2;

import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        // Creamos un array de ejemplo
        int[] array = {1, 2, 3, 4, 5};

        // Imprimir el array original
        System.out.print("Array original: ");
        ArrayOperations.print(array);

        // a) Invertir el array
        ArrayOperations.reverse(array);
        System.out.print("Array invertido: ");
        ArrayOperations.print(array);

        // b) Encontrar el máximo
        int max = ArrayOperations.max(array);
        System.out.println("Máximo del array: " + max);

        // c) Encontrar el mínimo
        int min = ArrayOperations.min(array);
        System.out.println("Mínimo del array: " + min);

        // d) Sumar los elementos del array
        int sum = ArrayOperations.sum(array);
        System.out.println("Suma del array: " + sum);

        // e) Comparar dos arrays (igualdad exacta)
        int[] array2 = {5, 4, 3, 2, 1};
        boolean areEqual = ArrayOperations.equals(array, array2);
        System.out.println("¿Los arrays son iguales? " + areEqual);

        // f) Comparar dos arrays sin importar el orden
        boolean areEqualWithoutOrder = ArrayOperations.equalsWithoutOrder(array, array2);
        System.out.println("¿Los arrays son iguales sin importar el orden? " + areEqualWithoutOrder);

        // g) Verificar si un número está en el array
        boolean isNumberOnArray = ArrayOperations.isArrayOn(array, 3);
        System.out.println("¿El número 3 está en el array? " + isNumberOnArray);

        // h) Ordenar el array
        ArrayOperations.sort(array);
        System.out.print("Array ordenado: ");
        ArrayOperations.print(array);

        // i) Copiar el array
        int[] arrayCopy = new int[array.length];
        ArrayOperations.copy(array, arrayCopy);
        System.out.print("Array copiado: ");
        ArrayOperations.print(arrayCopy);

        // j) Eliminar números impares (poner 0 en su lugar)
        ArrayOperations.removeOddNumbers(array);
        System.out.print("Array después de eliminar los números impares: ");
        ArrayOperations.print(array);
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
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Método g) Comparar dos arrays sin importar el orden
    public static boolean equalsWithoutOrder(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        int[] sortedArray1 = array1.clone();
        int[] sortedArray2 = array2.clone();

        // Ordenar ambos arrays
        sort(sortedArray1);
        sort(sortedArray2);

        // Comparar los arrays ordenados
        for (int i = 0; i < sortedArray1.length; i++) {
            if (sortedArray1[i] != sortedArray2[i]) {
                return false;
            }
        }
        return true;
    }

    // Método h) Verificar si un array contiene un número
    public static boolean isArrayOn(int[] array, int number) {
        for (int num : array) {
            if (num == number) {
                return true;
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
            throw new IllegalArgumentException("Los arrays deben tener el mismo tamaño.");
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
}

