package Ejercicios_Bucles;/*
   Ejercicios_Bucles
   Nombre_project: Ejercicios
    Ejercicio13
    Created by: cide
    Date : 11/11/20
    Description:
*/

public class Ejercicio13{

    public static void main(String[] args) {

        System.out.println("Por favor, introduzca 10 números enteros: ");
        int i;
        int negativos = 0;
        int positivos = 0;

        for ( i = 0; i < 10; i++) {
            if ((i) < 0) {
                negativos++;
            } else {
                positivos++;
            }
        }

        System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");

    }
}
