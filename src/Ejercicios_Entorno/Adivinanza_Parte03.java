package Ejercicios_Entorno;

import java.util.Scanner;

/**
 * Ejercicios_Entorno
 * Nombre_project: Ejercicios
 * Adivinanza_Parte03
 * Created by: cide
 * Date : 14/12/20
 * Description:
 **/
public class Adivinanza_Parte03 {
    private static int balance = 20;
    private static Scanner escrito = new Scanner(System.in);

    private static void MenuPrincipal() {
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("Decide lo que quieres hacer con tu maquina: ");
                System.out.println("1 Iniciar Juego(0-99)\n2 Mira tu balance \n3 Salir " );
                System.out.print("Elige la opcion: ");
                switch (Integer.parseInt(escrito.nextLine())) {
                    case 1 -> startGame();
                    case 2 -> mirabalance();
                    case 3 -> exit = true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void mirabalance() {
        System.out.println("Tu balance es: " + balance + "€");
    }


    private static void startGame() {
        System.out.println("Has añadido 1€");
        balance--;
        boolean acertado = false;
        int intentos = 5;
        int i;
        int numeroMisterioso = (int) (Math.random() * 99 + 1);
        int[] numeroIntroducido = new int[5];
        while (intentos > 0 && !acertado) {
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.print("Introduce el numero a adivinar: ");
            i = Integer.parseInt(escrito.nextLine());
            numeroIntroducido[intentos - 1] = i;
            intentos--;
            if (i == numeroMisterioso) {
                acertado = true;
            } else if (numeroMisterioso > i) {
                System.out.println("El numero a adivinar es mayor.");
            } else {
                System.out.println("El numero a adivinar es menor.");
            }
        }
        if (acertado) {
            System.out.println("Enhorabuena! Has acertado!. El numero de intentos ha quedado:" + intentos);
            balance += 5;
        } else {
            System.out.println("Lo siento, no has acertado. El número era: " + numeroMisterioso + "\n" + "Intentos utilizados son: " + intentos);
        }
        for (i = 0; i < numeroIntroducido.length; i++) {
            System.out.println("El numero de intento:");
            System.out.println(numeroIntroducido[i]);
        }
    }
    public static void main (String[]args){
        MenuPrincipal();
    }
}

