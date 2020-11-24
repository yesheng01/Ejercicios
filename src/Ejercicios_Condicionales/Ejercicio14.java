package Ejercicios_Condicionales;

/**
 * Ejercicios_Condicionales
 * Nombre_project: Ejercicios
 * Ejercicio14
 * Created by: cide
 * Date : 16/11/20
 * Description:
 **/
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero: ");
        int n ;
        n = UserIn.nextInt();

        if ((n % 2) == 0) {
            System.out.print("El número introducido es par");
        } else {
            System.out.print("El número introducido es impar");
        }

        if ((n % 5) == 0) {
            System.out.println(" y divisible entre 5.");
        } else {
            System.out.println(" y no es divisible entre 5.");
        }
    }
}
