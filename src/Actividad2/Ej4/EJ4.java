package Actividad2.Ej4;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class EJ4 {
    public static void main(String[] args) {
        // Lista de números enteros
        int[] numeros = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};

        // Variable para almacenar el máximo
        int minimo = numeros[0]; // Asumimos que el primer número es el máximo


        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i]; // Si encontramos un número mayor, lo actualizamos
            }
        }

        // Imprimimos el minimo
        System.out.println("El mínimo de la colección es: " + minimo);
    }
}