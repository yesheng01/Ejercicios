package Ejercicios_Entorno;

import java.util.Scanner;

/**
 * Ejercicios_Entorno
 * Nombre_project: Ejercicios
 * Adivinanza_Parte03
 * Created by: cide
 * Date : 14/12/20
 * Description:
 * Modifica el programa anterior perquè doni un premi de 5€ a l’usuari que encerti el nombre amb els 5 intents o menys.
 * Però per començar una partida, s’ha de pagar 1€.

 * A més, l’usuari pot seguir jugant una vegada esgotat els 5 torns pagant 1€ de més i així obtenir una oportunitat més.
 * Aquest cas es pot repetir fins que endevina el nombre o es retira.
 *
 * Inicialment, la màquina comença amb un saldo de 20€ i porta un comptabilitat del guany de la màquina.
 * El programa no ha d’acabar fins que l’amo de la màquina l’atura, i sempre s’ha de poder començar una nova partida pagant 1€.
 * S’ha de poder consultar el guany de la màquina.
 **/
public class Adivinanza_Parte03 {
    //Atributos
    //Empiezas el juego con 20 euros tal como dice el balance
    private static int balance = 20;
    //clase
    private static Scanner escrito = new Scanner(System.in);

    //Empiezas un bucle con try y switch como un menu
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
//Aqui miras el balance que tienes osea el dinero que tienes antes de jugar el juego.
    private static void mirabalance() {
        System.out.println("Tu balance es: " + balance + "€");
    }
    //Aqui empiezas el juego.
    private static void startGame() {
        //Atributos
        System.out.println("Has añadido 1€");
        //Gastas el euro aqui
        balance--;
        boolean acertado = false;
        int intentos = 5;
        int i;
        int numeroMisterioso = (int) (Math.random() * 99 + 1);
        int[] numeroIntroducido = new int[5];
        //Methods de adivinar el juego
        while (intentos > 0 && !acertado) {
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.print("Introduce el numero a adivinar: ");
            i = Integer.parseInt(escrito.nextLine());
            //Cada numero qeu es introducido se resta un intento
            numeroIntroducido[intentos - 1] = i;
            intentos--;
            //Methods de que te dice si el numero es mayo o menor dependiendo del numero qeu añades
            if (i == numeroMisterioso) {
                acertado = true;
            } else if (numeroMisterioso > i) {
                System.out.println("El numero a adivinar es mayor.");
            } else {
                System.out.println("El numero a adivinar es menor.");
            }
        }
        //Methods el numero de intentos y si aciertas
        if (acertado) {
            System.out.println("Enhorabuena! Has acertado!. El numero de intentos ha quedado:" + intentos);
            //Se te suma 5 euros si aciertas.
            balance += 5;
        } else {
            //No aciertas
            System.out.println("Lo siento, no has acertado. El número era: " + numeroMisterioso +
                    "\n" + "Intentos utilizados son: " + intentos);
        }
        //Methods se te muestra los numeros introducidos en ella.
        for (i = 0; i < numeroIntroducido.length; i++) {
            System.out.println("El numero de intento:");
            System.out.println(numeroIntroducido[i]);
        }
    }
    public static void main (String[]args){
        MenuPrincipal();
    }
}

