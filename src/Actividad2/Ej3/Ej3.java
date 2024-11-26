package Actividad2.Ej3;

import java.util.Arrays;

public class Ej3 {

    public static void main(String[] args) {

        int array[] = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Valor máximo: " + array[9]);

    }
}
