package Actividad1.Ej6;

public class Ej6 {
    public static void main(String[] args) {

         double[] array = new double[4];

         array[0] = 0.21;
         array[1] = 4.31;
         array[2] = 9.28;

         int j = 3;
        System.out.println("posicion " + j + " valor " + array[j]);
        System.out.println("posicion " + (j-1) + " valor " + array[j-1]);

        j = j-2;
        System.out.println("posicion " + j + " valor " + array[j]);

        //array[] = {0.21, 4.31, 9.28}

    }
}
