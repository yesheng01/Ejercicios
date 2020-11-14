package Ejercicios_Bucles;/*
   Ejercicios_Bucles
   Nombre_project: Ejercicios
    Exc2
    Created by: cide
    Date : 12/11/20
    Description:
*/

import java.util.Scanner;

public class Exc2 {

    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        Scanner sc1 = new Scanner(System.in);
        boolean salir = false;
        int opcion; //opcion que ha elegido el usuario
        while (!salir) {
            System.out.println("Opción 1: Crear usuari");
            System.out.println("Opción 2: Cercar usuari");
            System.out.println("Opción 3: Canviar contraseña");
            System.out.println("Opción 4: Donar de baixa");
            System.out.println("Opcion 5: Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc1.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("crear!");
                    crear();
                    break;
                case 2:
                    System.out.println("cercar!");
                    cercar();
                    break;
                case 3:
                    System.out.println("canviar");
                    canviar();
                    break;
                case 4:
                    System.out.println("donar");
                    donar();
                    break;
                case 5:
                    System.out.println("Salir");
                    salir = true;
                    break;
                default:
                    System.out.println("Selecciona un número entre 1 y 5");
            }

        }

    }

    private static void donar() {
        System.out.println("Donat de baixa");
    }

    private static void canviar() {
        System.out.println("Canviat contraseña");
    }

    private static void cercar() {
        System.out.println("Cercarnt usuari");
    }

    private static void crear() {
        System.out.println("Creant usuari");
    }
}
