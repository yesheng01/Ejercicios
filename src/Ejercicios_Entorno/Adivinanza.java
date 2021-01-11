package Ejercicios_Entorno;

/**
 * Ejercicios_Entorno
 * Nombre_project: Ejercicios
 * Adivinanza
 * Created by: cide
 * Date : 11/12/20
 * Description:
 * Part 1
 * Realitza un programa en el qual es genera un nombre a l’atzar entre 0 i 9, i l’usuari l’ha d’endevinar.
 * Per tant, el primer que s’ha fer és generar el nombre aleatori (entre 0 i 9) i no s’ha de mostrar a l’usuari.
 * El programa sol·licitarà a l’usuari que intenti un nombre entre 0 i 9, i el programa compararà el nombre donat per l’usuari amb el nombre aleatori.
 * Si coincideixen els nombres, es mostra una notificació de què ha endevinat el nombre i acabarà el programa, en cas contrari tornarà a provar l’usuari amb un altre nombre.
 * Comptabilitza els nombre d’intents i mostra’ls també en acabar el programa.
 **/
import java.util.Scanner;

    public class Adivinanza {
        public static void main(String[] args) {
            Scanner escrito = new Scanner(System.in);
            //Atributos
            boolean acertado = false;
            //Numero de intentos al 0
            int numerointentos = 0;
            //Atributos para generar numero aleatorio entre 0 y 9
            int numeroMisterioso = (int) (Math.random() * 9 + 1);
            int numeroIntroducido;
            //El bucle que muestra si has adivinado el numero o no depende del numero que añades
            do {
                System.out.print("Introduce un número de 0 a 9: ");
                numeroIntroducido = escrito.nextInt();
                //Va sumando el numero de intentos , asi que no hay limite de intentos
                numerointentos++;
                //Te dice que aciertas o no.
                if (numeroIntroducido == numeroMisterioso) {
                    acertado = true;
                    System.out.println("Has acertado");
                } else {
                    System.out.println("No vale");
                }
            } while (numerointentos > 0 && !acertado);
            //Y si aciertas te sale el numero de intentos que has intentado
            if (acertado)
                System.out.println("El numero de intentos ha sido : " + numerointentos);
        }
    }
