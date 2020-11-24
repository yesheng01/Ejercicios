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

        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pirÃ¡mide: ");
        int alturaIntroducida = Integer.parseInt(s.nextLine());

        System.out.print("Introduzca el carÃ¡cter de relleno: ");
        String relleno = s.nextLine();

        int altura = 1;
        int i = 0;
        int espacios = alturaIntroducida-1;

        while (altura <= alturaIntroducida) {

            // inserta espacios
            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            // pinta la lÃ­nea
            for (i = 1; i < altura * 2; i++) {
                System.out.print(relleno);
            }

            System.out.println();

            altura++;
            espacios--;
        }
    }
}