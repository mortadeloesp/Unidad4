package Actividad2.Ej9;

import java.util.Arrays;
import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sonIguales = true;

        System.out.println("Cuantos numeros quieres introducir en le primer array? ");
        int num = sc.nextInt();

        int array[] = new int[num];

        System.out.println("Introduce los numeros que quieras usar en el primer array: ");
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Tu array es: " + Arrays.toString(array));

        System.out.println("Cuantos numeros quieres introducir en el segundo array? ");
        int num2 = sc.nextInt();

        int array2[] = new int [num2];

        System.out.println("Introduce los numeros que quieras usar en el segundo array: ");
        for (int i = 0; i < num2; i++) {
            array2[i] = sc.nextInt();
        }
        System.out.println("Tu array2 es: " + Arrays.toString(array2));

       for (int  i = 0; i < array.length; i++) {
           if (array.length != array2.length) {
               sonIguales = false;
               break;
           }
       }
       if (sonIguales) {
           System.out.println("Son iguales.");
       } else  {
           System.out.println("No son iguales.");
       }



    }
}
