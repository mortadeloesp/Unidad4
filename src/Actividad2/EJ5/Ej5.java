package Actividad2.EJ5;

public class Ej5 {
    public static void main(String[] args) {

        int[] pagoSemanal = {987, 688, 1324, 450, 667, 801};
        int sum = 0;

        for (int j = 0; j<=5; j++) {
            sum += pagoSemanal[j];
            System.out.println(sum);
        }
    }
}
//Cambiando la longitud a 5 en vez de 6.