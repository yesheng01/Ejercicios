package Ejercicios_Bucles;/*
   Ejercicios_Bucles
   Nombre_project: Ejercicios
    prueba
    Created by: cide
    Date : 12/11/20
    Description:
*/

import java.util.Scanner;
    public class prueba  {

        public static void main(String[] args) {
            menu();
        }
        private static void menu() {
            Scanner sc = new Scanner(System.in);
            boolean salir = false;
            int opcion; //opcion que ha elegido el usuario
            while (!salir) {
                System.out.println("Opción 1: Sumar ");
                System.out.println("Opción 2: Restar");
                System.out.println("Opción 3: Multiplicar");
                System.out.println("Opción 4: Dividir");
                System.out.println("Opcion 5: Salir");
                System.out.println("Selecciona una opción: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Suma!");
                        suma();
                        break;
                    case 2:
                        System.out.println("Resta!");
                        restar();
                        break;
                    case 3:
                        System.out.println("Multiplicacion");
                        multiplicar();
                        break;
                    case 4:
                        System.out.println("Dividir");
                        dividir();
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

        private static void dividir() {
            System.out.println("Estas en la division");
        }

        private static void multiplicar() {
            System.out.println("Estas en la multiplicacion");
        }

        private static void restar() {
            System.out.println("Estas en la resta");
        }

        private static void suma() {
            System.out.println("Estas en la suma");
        }

    }