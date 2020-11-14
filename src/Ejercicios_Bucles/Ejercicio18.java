package Ejercicios_Bucles;/*
   Ejercicios_Bucles
   Nombre_project: Ejercicios
    Ejercicio18
    Created by: cide
    Date : 13/11/20
    Description:
*/
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num1;
        num1 = UserIn.nextInt();
        System.out.print("Introduce otro número diferente: ");
        int num2;
        num2 = UserIn.nextInt();
        if (num1 == num2) {
            System.out.print("Que sean diferentes");
        } else {
            int menor = 0;
            int mayor = 0;
            int i = 0;
            if (num1 < num2) {
                menor = num1;
                mayor = num2;
            } else {
                menor = num2;
                mayor = num1;
            }
            for (i = 0; menor < mayor; i++) {
                menor += 7;
            }
            System.out.print("El número 7 cabe " + (i - 1) + " veces entre el " + num1 + " y el " + num2);
        }
    }
}