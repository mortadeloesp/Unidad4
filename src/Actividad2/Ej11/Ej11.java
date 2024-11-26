package Actividad2.Ej11;

import java.util.Arrays;

public class Ej11 {
    public static void main(String[] args) {

        int[] array1 = {10, 20, 30, 40, 50,};
        int[] array2 = {10, 80};

        System.out.println(isArrayOn(array1, array2));
    }

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
        return true;
    }
}
