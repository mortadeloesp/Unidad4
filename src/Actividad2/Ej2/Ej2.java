package Actividad2.Ej2;

import java.util.Arrays;

public class Ej2 {
    public static void main(String[] args) {
        // Lista de números enteros
        int[] numeros = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};

        // Variable para almacenar el máximo
        int maximo = numeros[0]; // Asumimos que el primer número es el máximo


        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i]; // Si encontramos un número mayor, lo actualizamos
            }
        }

        // Imprimimos el máximo

        System.out.println(Arrays.toString(numeros));
        System.out.println("El maximo es: " + maximo);
    }
}
