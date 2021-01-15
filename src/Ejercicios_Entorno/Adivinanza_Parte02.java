package Ejercicios_Entorno;

import java.util.Scanner;

/**
 * Ejercicios_Entorno
 * Nombre_project: Ejercicios
 * Adivinanza_Parte02
 * Created by: cide
 * Date : 11/12/20
 * Description:
 * Modifica el programa anterior, perquè l’usuari hagi d'endevinar un nombre a l’atzar entre 0 i 99,
 * i disposa de 5 intents per endevinar-ho. El programa donarà indicacions a l’usuari de si el nombre que ha provat i
 * que no és el correcte, és més gran o petit que el nombre que ha d'endevinar.
 * En cas d’endevinar el nombre mostrar per pantalla, els nombres que ha anat provant
 * (utilitza un array per anar guardant els valors que ha provar l’usuari) i els intent que ha necessitat.
 * En cas contrari, mostrar els 5 nombre que ha provat i els intents utilitzats (que han de ser 5).
 **/
public class Adivinanza_Parte02 {
    public static void main(String[] args) {
        //Atributos
        Scanner escrito = new Scanner(System.in);
        boolean acertado = false;
        //Numero de intentos que lo hemos puesto al nº5.
        int intentos = 5;
        int i;
        //Genera numero aleatorios de 0 a 99.
        int numeroMisterioso = (int) (Math.random() * 99 + 1);
        //Array de que solo se guardan 5 numeros en ello.
        int [] numeroIntroducido = new int[5];
        //Methods donde hara para que se empiece el juego y empezar a adivinar.
        do {
            //Numero de intentos y empieza a introducir valores.
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.print("Introduce el numero a adivinar: ");
            i = escrito.nextInt();
            numeroIntroducido[intentos- 1]=i;
            //Va restando los intentos a diferencia del primero
            intentos--;
            //Other Method , te dice que si el numero adivinado es mayo o es menor a ello.
            if (i == numeroMisterioso) {
                acertado = true;
            } else if (numeroMisterioso > i) {
                System.out.println("El numero a adivinar es mayor.");
            } else {
                System.out.println("El numero a adivinar es menor.");
            }
        } while (intentos > 0 && !acertado);
    //Te dice si has acertado acaba aqui y te dice los numero de intentos
        if (acertado) {
            System.out.println("Enhorabuena! Has acertado!. El numero de intentos ha quedado:"+ intentos);
        } else {
            //Y si no te dice lo utilizado y el numero misteriosos
            System.out.println("Lo siento, no has acertado. El número era: " + numeroMisterioso  +
                    "\n" +"Intentos utilizados son: " + intentos);
        }
        //Other method , Aqui te dice el numero de intento y los numeros que has introducido en el juego
        for (i  = 0; i < numeroIntroducido.length; i++) {
            System.out.println("El numero de intento: ");
            System.out.println(numeroIntroducido[i]);
        }
    }
}