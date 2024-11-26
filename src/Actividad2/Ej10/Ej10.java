package Actividad2.Ej10;

import java.util.Arrays;

public class Ej10 {
    public static void main(String[] args) {

        int[] array1 = {10,20,30,40};
        int[] array2 = {10,20,30,50};


        System.out.println(comparacion(array1,array2));


    }
    public static boolean comparacion (int[] array, int[] array2) {

        Arrays.sort(array);
        Arrays.sort(array2);

        for (int i = 0; i <array.length; i++) {
            if (array[i] != array2[i]) {
                return false;
            }
        } return true;
    }
}
