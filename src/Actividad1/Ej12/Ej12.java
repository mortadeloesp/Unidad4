package Actividad1.Ej12;

public class Ej12 {
    public static void main(String[] args) {

        int[] array1 = {0, 10, 20, 30, 40, 50};
        int[] array2 = new int[6];

        array2[0] = array1[5];
        array2[1] = array1[4];
        array2[2] = array1[3];
        array2[3] = array1[2];
        array2[4] = array1[1];
        array2[5] = array1[0];


        System.out.println("array2: " + array2[0] + ", " + array2[1] + ", " + array2[2] + ", " + array2[3] + ", " + array2[4] + ", " + array2[5]);

    }
}
