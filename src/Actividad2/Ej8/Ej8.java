package Actividad2.Ej8;

public class Ej8 {

    public static void main(String[] args) {

        double[] algoritmo = {-47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42};
        double suma = 0.0;

        for (double i : algoritmo) {
            suma += i;
        }

        double media = suma/ algoritmo.length;

        System.out.println("La media será: " + media);
    }
}
