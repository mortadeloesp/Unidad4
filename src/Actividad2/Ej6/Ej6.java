package Actividad2.Ej6;

import java.util.Arrays;

public class Ej6 {
    public static void main(String[] args) {

        //Ejercicio 3

        int ej3[] = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};
        Arrays.sort(ej3);

        for (int numero : ej3) {
            System.out.println(numero);
        }
        System.out.println("--------------------------------");


        //Ejercicio 5

        int[] pagoSemanal = {987, 688, 1324, 450, 667, 801};
        int sum = 0;

        for (int pago : pagoSemanal) {
            sum += pago;
            System.out.println(sum);
        }
    }
}


