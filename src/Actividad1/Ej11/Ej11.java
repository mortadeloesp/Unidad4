package Actividad1.Ej11;

public class Ej11 {
    public static void main(String[] args) {

        int [] dataA = {12, 23, 45, 56};

        double[] dataB = new double[6];

        dataB[0] = dataA[2];
        dataB[3] = dataA[2];
        dataB[1] = dataA[1];
        dataB[5] = dataA[0];

        System.out.println("dataB: " + dataB[0] + ", " + dataB[1] + ", " + dataB[2] + ", " + dataB[3] + ", " + dataB[4] + ", " + dataB[5]);

        //Imprime: dataB: 45.0, 23.0, 0.0, 45.0, 0.0, 12.0
    }
}
