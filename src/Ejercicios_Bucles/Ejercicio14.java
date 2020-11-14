package Ejercicios_Bucles;/*
   Ejercicios_Bucles
   Nombre_project: Ejercicios
    Ejercicio14
    Created by: cide
    Date : 13/11/20
    Description:
*/
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);
        System.out.println("Cálculo de una potencia");

        System.out.print("Introduzca la base: ");
        int base ;
        base = UserIn.nextInt();
        System.out.print("Introduzca el exponente: ");
        int exponente ;
        exponente = UserIn.nextInt();
        double potencia = 1;

        if (exponente == 0) {
            potencia = 1;
        }

        if (exponente > 0) {
            for (int i = 0; i < exponente; i++) {
                potencia *= base;
            }
        }

        if (exponente < 0) {
            for (int i = 0; i < -exponente; i++) {
                potencia *= base;
            }

            potencia = 1/potencia;
        }
        else {
            System.out.println("No tiene nombre");
        }

        System.out.println(base + "^" + exponente + " = " + potencia);
    }
}

