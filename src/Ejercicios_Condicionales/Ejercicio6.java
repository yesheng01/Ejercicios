package Ejercicios_Condicionales;/*
   Ejercicios_Condicionales
   Nombre_project: Ejercicios
    Ejercicio6
    Created by: cide
    Date : 11/11/20
    Description:
*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);
        System.out.print("Debe introducir la altura en (m) el objeto que será caido:");
        double h ;
        h =UserIn.nextDouble();

        final double g = 9.81; // las constantes se declaran con final
        double s = Math.sqrt(2*h/g);

        System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
    }
}
