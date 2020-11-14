package Ejercicios_Bucles;/*
   Ejercicios_Bucles
   Nombre_project: Ejercicios
    Ejercicio15
    Created by: cide
    Date : 13/11/20
    Description:
*/
import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);
        System.out.print("Introduzca un número real como base: ");
        double base ;
        base = UserIn.nextDouble();
        System.out.print("Introduzca un múmero entero como exponente: ");
        int exponenteFinal;
        exponenteFinal = UserIn.nextInt();
        int potencia;
        int exponente;

        for (int i = 1; i <= exponenteFinal; i++) {

            potencia = 1;
            exponente = i;

            for (int j = 0; j < exponente; j++) {
                potencia *= base;
            }

            System.out.println(base + "^" + i + " = " + potencia);
        }

    }
}
