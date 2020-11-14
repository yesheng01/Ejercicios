package Ejercicios_Bucles;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numeroIntroducido ;
        numeroIntroducido =UserIn.nextInt();
        for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
            System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
        }
    }
}
