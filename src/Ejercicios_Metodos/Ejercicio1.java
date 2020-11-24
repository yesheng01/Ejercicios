package Ejercicios_Metodos;

/**
 * Ejercicios_Metodos
 * Nombre_project: Ejercicios
 * Ejercicio1
 * Created by: cide
 * Date : 18/11/20
 * Description:
 **/
import java.util.Scanner;
public class Ejercicio1{
public static void main ( String [] args)
        {
        Scanner input = new Scanner (System.in);

        double totalReceipts=0.0;
        double fee;
        double hours;

        System.out.print("Enter number of hours (a negative to quit): " );
        hours=input.nextDouble();

        while (hours >=0.0)
        {
        fee=calculateCharge(hours);
        totalReceipts += fee;
        System.out.printf("Current charge: N%.2f, Total receipts: N%.2f\n", fee, totalReceipts );
        System.out.print("Enter number of hours (a negative to quit)");
        hours=input.nextDouble();
        }
        }


private static double calculateCharge(double hours)
        {
        /*final*/ double minPark= 2.0;

        /*final*/ double maxPark= 10.0;

        /*final*/ double maxHours= 24.0;

        /*final*/ double minHours= 3.0;

        /*final*/ double hourEx= 0.5;

        double fee;

        fee= minPark;

        if ( hours <= minHours )

        fee = minPark;


        if ( hours > minHours && hours < maxHours )
        fee = hourEx*(Math.ceil(hours) - minHours) + minPark;

        if ( hours == maxHours )

        fee = maxPark;


        return fee;
        }

        }
