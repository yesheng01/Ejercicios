package Ejercicios_Bucles;/*
   Ejercicios_Bucles
   Nombre_project: Ejercicios
    Exc3
    Created by: cide
    Date : 12/11/20
    Description:
*/

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        boolean salir = false;
        Scanner sc1 = new Scanner(System.in);
        int opcion;  //opcion que ha elegido el usuario
        while (!salir) {
            System.out.println("Opción 1:Gestion de empleados");
            System.out.println("Opción 2:Gestion de productos");
            System.out.println("Opción 3:Gestion de compra/venta");
            System.out.println("Opción 4:Salir");
            opcion =sc1.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Entras en el gestion");
                    entrar();
                    break;
                case 2:
                    System.out.println("Entras");
                    entras();
                    break;
                case 3:
                    System.out.println("compra/venta");
                    compraventa();
                    break;
                case 4:
                    System.out.println("Salir");
                    salir = true;
                    break;
                default:
                    System.out.println("Selecciona un número entre 1 y 4");
            }
        }
    }
    private static void entrar()
    {
        boolean salir = false;
        Scanner sc1 = new Scanner(System.in);
        int opcion;  //opcion que ha elegido el usuario
        while (!salir) {
            System.out.println("1.1 Donar d’alta un empleat");
            System.out.println("1.2 Modificar un empleat");
            System.out.println("1.3 Donar de baixa un empleat");
            System.out.println("Opción 4:Salir");
            opcion = sc1.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("donar");
                    donar();
                    break;
                case 2:
                    System.out.println("modificar");
                    modificar();
                    break;
                case 3:
                    System.out.println("donant baixa");
                    donant();
                    break;
                case 4:
                    System.out.println("Salir");
                    salir = true;
                    break;
                default:
                    System.out.println("Selecciona un número entre 1 y 4");
            }
        }
    }
    private static void donar() {
    }
    private static void modificar() {
    }
    private static void donant() {
    }
    private static void entras()
    {
        boolean salir = false;
        Scanner sc1 = new Scanner(System.in);
        int opcion;  //opcion que ha elegido el usuario
        while (!salir) {
            System.out.println("\t2.1 Donar d'alta un producte");
            System.out.println("\t2.1 Modificar un producte");
            System.out.println("\t2.1 Donar de baixa un producte");
            System.out.println("Opción 4:Salir");
            opcion = sc1.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("donar");
                    donarprod();
                    break;
                case 2:
                    System.out.println("modificar");
                    modificarprod();
                    break;
                case 3:
                    System.out.println("donant baixa");
                    donantprod();
                    break;
                case 4:
                    System.out.println("Salir");
                    salir = true;
                    break;
                default:
                    System.out.println("Selecciona un número entre 1 y 4");
            }
        }
    }
    private static void donarprod() {
    }
    private static void modificarprod() {
    }
    private static void donantprod() {
    }
    private static void compraventa(){
        boolean salir = false;
        Scanner sc1 = new Scanner(System.in);
        int opcion;  //opcion que ha elegido el usuario
        while (!salir) {
            System.out.println("3.1 Gestió de comandes");
            System.out.println("3.2 Veure estadístiques i gràfics");
            System.out.println("Opción 4:Salir");
            opcion =sc1.nextInt();
            switch (opcion){
            case 1:
                System.out.println("gestio");
                comandes();
                break;
            case 2:
                System.out.println("veure");
                veure();
                break;
            case 3:
                System.out.println("Salir");
                salir = true;
                break;
            default:
                System.out.println("Selecciona un número entre 1 y 3");
        }
    }
    }

    private static void comandes() {
    }
    private static void veure() {
    }
}