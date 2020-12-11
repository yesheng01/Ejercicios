package Ejercicios_Entorno;

import java.util.Scanner;

/**
 * Ejercicios_Entorno
 * Nombre_project: Ejercicios
 * Adivinanza_Parte02
 * Created by: cide
 * Date : 11/12/20
 * Description:
 **/
public class Adivinanza_Parte02 {
    public static void main(String[] args) {
        Scanner escrito = new Scanner(System.in);
        boolean acertado = false;
        int intentos = 5;
        int i;
        int numeroMisterioso = (int) (Math.random() * 99 + 1);
        int [] numeroIntroducido = new int[5];
        do {
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.print("Introduce el numero a adivinar: ");
            i = escrito.nextInt();
            numeroIntroducido[intentos- 1]=i;
            intentos--;
            if (i == numeroMisterioso) {
                acertado = true;
            } else if (numeroMisterioso > i) {
                System.out.println("El numero a adivinar es mayor.");
            } else {
                System.out.println("El numero a adivinar es menor.");
            }
        } while (intentos > 0 && !acertado);

        if (acertado) {
            System.out.println("Enhorabuena! Has acertado!. El numero de intentos ha quedado:"+ intentos);
        } else {
            System.out.println("Lo siento, no has acertado. El número era: " + numeroMisterioso  + "\n" +"Intentos utilizados son: " + intentos);
        }
        for (i  = 0; i < numeroIntroducido.length; i++) {
            System.out.println(numeroIntroducido[i]);
        }
    }
}

