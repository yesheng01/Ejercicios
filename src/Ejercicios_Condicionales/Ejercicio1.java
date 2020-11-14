package Ejercicios_Condicionales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] assignatures = new String[]{
                "Entorno",
                "Lenguaje de marcas",
                "Programacion"
        };

        Scanner Lector = new Scanner(System.in);

        String DiaDeAsigntura;
        boolean terminat = false;

        do {

            System.out.print("Introduce el dia de la semana: ");
            DiaDeAsigntura = Lector.nextLine();

            if (DiaDeAsigntura.toLowerCase().contains("lunes")) {
                System.out.println("lunes -- Primera assignatura: " + assignatures[1]);
                terminat = true;
            } else if(DiaDeAsigntura.toLowerCase().contains("martes")){
                System.out.println("martes -- Primera assignatura: " + assignatures[1]);
                terminat = true;
            } else if(DiaDeAsigntura.toLowerCase().contains("miercoles")){
                System.out.println("miercoles -- Primera assignatura: " + assignatures[2]);
                terminat = true;
            } else if(DiaDeAsigntura.toLowerCase().contains("jueves")){
                System.out.println("jueves -- Primera assignatura: " + assignatures[1]);
                terminat = true;
            } else if(DiaDeAsigntura.toLowerCase().contains("viernes")){
                System.out.println("viernes -- Primera assignatura: " + assignatures[0]);
                terminat = true;
            }

        } while(!terminat);
    }
}