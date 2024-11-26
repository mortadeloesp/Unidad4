package Actividad3.Ej1;

import java.util.Arrays;

public class Ej1 {
    public static void main(String[] args) {

      int[] noReverso = {-10, -5, 0, 5, 10};

         reverso(noReverso);

    }

    public static void reverso (int[] array) {

        for (int i = 0; i <array.length / 2; i++) {
            int ordenar = array[i];
            array[i] = array[array.length -1 - i];
            array[array.length -1 - i] = ordenar;
            for (int u = 0; u <array.length; u++) {
                System.out.println("Array reverso: " + array);
            }
        }
    }
}
