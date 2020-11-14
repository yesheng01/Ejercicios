package Ejercicios_Condicionales;/*
   Ejercicios_Condicionales
   Nombre_project: Ejercicios
    Ejercicio2
    Created by: cide
    Date : 10/11/20
    Description:
*/

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);
        System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
        int hora = 0;
        hora = UserIn.nextInt();
        if ((hora >= 6) && (hora <= 12)) {
            System.out.println("Buenos días");
        }

        if ((hora >= 13) && (hora <= 20)) {
            System.out.println("Buenas tardes");
        }

        if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
            System.out.println("Buenas noches");
        }

        if ((hora >= 24) || (hora < 0)) {
            System.out.println("La hora introducida no es correcta.");
        }
    }
}

