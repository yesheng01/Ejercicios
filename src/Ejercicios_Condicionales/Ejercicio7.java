package Ejercicios_Condicionales;/*
   Ejercicios_Condicionales
   Nombre_project: Ejercicios
    Ejercicio7
    Created by: cide
    Date : 11/11/20
    Description:
*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);

        System.out.println("Este programa calcula la media de tres notas.");
        System.out.print("Por favor, introduzca la primera nota: ");
        double nota1;
        nota1 =UserIn.nextDouble();

        System.out.print("Ahora introduzca la segunda nota: ");
        double nota2 ;
        nota2 =UserIn.nextDouble();
        System.out.print("Por último introduzca la tercera nota: ");
        double nota3;
        nota3 =UserIn.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("La media es %.3f\n", media);
    }
}

