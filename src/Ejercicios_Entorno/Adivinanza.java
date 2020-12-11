package Ejercicios_Entorno;

/**
 * Ejercicios_Entorno
 * Nombre_project: Ejercicios
 * Adivinanza
 * Created by: cide
 * Date : 11/12/20
 * Description:
 **/
import java.util.Scanner;

    public class Adivinanza {
        public static void main(String[] args) {
            Scanner escrito = new Scanner(System.in);
            boolean acertado = false;
            int numerointentos = 0;
            int numeroMisterioso = (int) (Math.random() * 9 + 1);
            int numeroIntroducido;
            do {
                System.out.print("Introduce un número de 0 a 9: ");
                numeroIntroducido = escrito.nextInt();
                numerointentos++;
                if (numeroIntroducido == numeroMisterioso) {
                    acertado = true;
                    System.out.println("Has acertado");
                } else {
                    System.out.println("No vale");
                }
            } while (numerointentos > 0 && !acertado);
            if (acertado)
                System.out.println(numerointentos);
        }
    }
