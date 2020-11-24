package Ejercicios_Condicionales;/*
   Ejercicios_Condicionales
   Nombre_project: Ejercicios
    Ejercicio11
    Created by: cide
    Date : 15/11/20
    Description:
*/
import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner UserIn = new Scanner(System.in);
        System.out.print("A continuación deberá introducir una hora del día, ");
        System.out.println("primero introducirá la hora y luego los minutos.");

        System.out.print("hora: ");
        int hora ;
        hora =UserIn.nextInt();
        System.out.print("minuto: ");
        int minuto;
        minuto =UserIn.nextInt();
        int segundosTranscurridos = (hora * 3600) + (minuto * 60);
        int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;

        //System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " + segundosHastaMedianoche + " segundos.");
        System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", hora, minuto, segundosHastaMedianoche);
    }
}