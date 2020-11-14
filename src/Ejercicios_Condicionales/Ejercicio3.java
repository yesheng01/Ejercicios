package Ejercicios_Condicionales;/*
   Ejercicios_Condicionales
   Nombre_project: Ejercicios
    Ejercicio3
    Created by: cide
    Date : 10/11/20
    Description:
*/
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
    String Semana;
    Scanner UserIn = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número del 1 al 7: ");
    int n ;
    n = UserIn.nextInt();

    switch(n) {
        case 1:
            Semana   = "lunes";
            break;
        case 2:
            Semana   = "martes";
            break;
        case 3:
            Semana = "miércoles";
            break;
        case 4:
            Semana = "jueves";
            break;
        case 5:
            Semana = "viernes";
            break;
        case 6:
            Semana = "sábado";
            break;
        case 7:
            Semana = "domingo";
            break;
        default:
            Semana = "Debe introducir un número del 1 al 7";
    }

    System.out.println(Semana);

}
}
