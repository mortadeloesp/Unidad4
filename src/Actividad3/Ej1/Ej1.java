package Actividad3.Ej1;

import java.util.Arrays;

public class Ej1 {
    public static void main(String[] args) {

      int[] noReverso = {-10, -5, 0, 5, 10, 50, 70};

         reverso(noReverso);
        System.out.println("Array revertido: " + Arrays.toString(noReverso));
    }

    public static void reverso (int[] array) {
        System.out.println("Array original: " + Arrays.toString(array));

        for (int i = 0; i <array.length / 2; i++) {
            int ordenar = array[i]; //Variable temporal
            array[i] = array[array.length -1 - i]; //Remplazar con el elemento opuesto
            array[array.length - 1 - i] = ordenar;

        }
    }
}
