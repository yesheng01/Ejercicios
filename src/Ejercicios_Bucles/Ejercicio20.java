package Ejercicios_Bucles;/*
   Ejercicios_Bucles
   Nombre_project: Ejercicios
    Ejercicio20
    Created by: cide
    Date : 15/11/20
    Description:
*/
import java.util.Scanner;
public class Ejercicio20 {

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.print("Por favor, introduzca la altura de la pirÃ¡mide: ");
            int alturaIntroducida = Integer.parseInt(s.nextLine());

            System.out.print("Introduzca el carÃ¡cter de relleno: ");
            String relleno = s.nextLine();

            int altura = 1;
            int i = 0;
            int espaciosPorDelante = alturaIntroducida - 1;
            int espaciosInternos = 0;

            while (altura < alturaIntroducida) {

                // inserta espacios delante
                for (i = 1; i <= espaciosPorDelante; i++) {
                    System.out.print(" ");
                }

                // pinta la lÃ­nea
                System.out.print(relleno);
                for (i = 1; i < espaciosInternos; i++) {
                    System.out.print(" ");
                }

                if (altura>1) {
                    System.out.print(relleno);
                }

                System.out.println();
                altura++;
                espaciosPorDelante--;
                espaciosInternos += 2;
            } // while ////////////////////////////

            // base de la pirÃ¡mide
            for (i = 1; i < altura*2; i++) {
                System.out.print(relleno);
            }
        }
    }
