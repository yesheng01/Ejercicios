package Ejercicios_Condicionales;/*
   Ejercicios_Condicionales
   Nombre_project: Ejercicios
    Ejercicio13
    Created by: cide
    Date : 15/11/20
    Description:
*/
import java.util.Scanner;
public class Ejercicio13 {

        public static void main(String[] args) {
            Scanner UserIn = new Scanner(System.in);
            int aux;

            System.out.println("Este programa ordena tres números introducidos por teclado.");
            System.out.println("Por favor, vaya introduciendo los tres números y pulsando INTRO:");
            int a ;
            a =UserIn.nextInt();
            int b ;
            b =UserIn.nextInt();
            int c ;
            c =UserIn.nextInt();

            // ordenación de los dos primeros números
            if (a > b) {
                aux = a;
                a = b;
                b = aux;
            }

            // ordenación de los dos últimos números
            if (b > c) {
                aux = b;
                b = c;
                c = aux;
            }

            // se vuelven a ordenar los dos primeros
            if (a > b) {
                aux = a;
                a = b;
                b = aux;
            }

            System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");
        }
    }
