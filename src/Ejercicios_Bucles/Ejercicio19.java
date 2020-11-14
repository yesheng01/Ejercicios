package Ejercicios_Bucles;/*
   Ejercicios_Bucles
   Nombre_project: Ejercicios
    Ejercicio19
    Created by: cide
    Date : 13/11/20
    Description:
*/
import java.util.Scanner;
public class Ejercicio19{
public static void main(String[] args) {
    Scanner UserIn = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int alturaIntroducida;
        alturaIntroducida = UserIn.nextInt();
        System.out.print("Introduzca el carácter de relleno: ");
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida-1;

        while (planta <= alturaIntroducida) {

        // inserta espacios
        for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
        }

        // pinta la línea
        for (int i = 1; i <= longitudDeLinea; i++) {
        }

        System.out.println();

        planta++;
        espacios--;
        longitudDeLinea += 2;
        }
        }
        }
