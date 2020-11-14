package Ejercicios_Condicionales;/*
   Ejercicios_Condicionales
   Nombre_project: Ejercicios
    Ejercicio5
    Created by: cide
    Date : 11/11/20
    Description:
*/
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);
        System.out.println("Se resuelve el programa del primer grado");
        System.out.print("Por favor, introduzca el valor de a: ");
        double a;
        a = UserIn.nextInt();
        System.out.print("Ahora introduzca el valor de b: ");
        double b;
        b = UserIn.nextInt();
        if (a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            System.out.println("x = " + (-b/a));
        }
    }
}
