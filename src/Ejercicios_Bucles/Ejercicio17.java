package Ejercicios_Bucles;/*
   Ejercicios_Bucles
   Nombre_project: Ejercicios
    Ejercicio17
    Created by: cide
    Date : 13/11/20
    Description:
*/
import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num ;
        num = UserIn.nextInt();
        if (num < 0){
            System.out.print("En positivo");
        } else {
            System.out.print("La suma de siguientes 100 números a "+num+" son: ");
            int suma = 0;
            for(int i = num; i < (num+100); i++){
                suma += i;
            }
            System.out.print(suma);
        }
    }
}
