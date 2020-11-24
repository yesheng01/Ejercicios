package Ejercicios_Bucles;

/**
 * Ejercicios_Bucles
 * Nombre_project: Ejercicios
 * Ejercicio21
 * Created by: cide
 * Date : 19/11/20
 * Description:
 **/
import java.util.Scanner;
public class Ejercicio21 {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Por favor, vaya introduciendo números enteros.");
            System.out.println("Puede terminar mediante la introducción de un número negativo.");

            int numeroIntroducido;

            int numeroDeElementos = 0;
            int sumaImpares = 0;
            int numeroDeElementosImpares = 0;
            int maximoPar = 0;

            do {
                numeroIntroducido = s.nextInt();

                if (numeroIntroducido >= 0) {
                    numeroDeElementos++;
                    if ((numeroIntroducido % 2) == 1) { // número impar
                        sumaImpares += numeroIntroducido;
                        numeroDeElementosImpares++;
                    } else { // número par
                        if (numeroIntroducido > maximoPar)
                            maximoPar = numeroIntroducido;
                    }
                }
            } while (numeroIntroducido >= 0);

            System.out.println("Ha introducido " + numeroDeElementos + " números");
            System.out.println("La media de los impares es " + sumaImpares/numeroDeElementosImpares);
            System.out.println("El máximo de los pares es " + maximoPar);
        }
    }
