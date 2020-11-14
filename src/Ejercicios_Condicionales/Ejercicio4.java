package Ejercicios_Condicionales;/*
   Ejercicios_Condicionales
   Nombre_project: Ejercicios
    Ejercicio4
    Created by: cide
    Date : 10/11/20
    Description:
*/
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        int sueldoSemanal;
        Scanner UserIn = new Scanner(System.in);
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas;
        horasTrabajadas = UserIn.nextInt();
        if (horasTrabajadas < 40) {
            sueldoSemanal = 12 * horasTrabajadas;
        } else {
            sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
        }
        System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");
    }
}
