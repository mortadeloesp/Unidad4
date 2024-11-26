package Actividad1.Ej10;

public class Ej10 {
    public static void main(String[] args) {

        char profesora[] = new char[8];

        profesora[0] = 'p';
        profesora[1] = 'a';
        profesora[2] = 't';
        profesora[3] = 'r';
        profesora[4] = 'i';
        profesora[5] = 'c';
        profesora[6] = 'i';
        profesora[7] = 'a';

        for (int i = 7; i >= 0; i--){
            System.out.print(profesora[i] );
        }
    }
}
