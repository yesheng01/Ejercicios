package ArrayList;
import java.util.ArrayList;
/**
 * ArrayList
 * Nombre_project: Ejercicios
 * Ejercicio2
 * Created by: sheng
 * Date : 13/01/2021
 * Description:
 **/
public class Ejercicio2 {
    public static void main(String[] args) {
        int total = 0;
        int media = 0;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;


        int tamaño = (int)(Math.random() * 10) + 10;

        ArrayList<Integer> numAleatorio = new ArrayList();

        for (int i = 0; i < tamaño; i++) {
            numAleatorio.add((int)(Math.random() * 100));
        }

        int aux = 1;

        for (int n : numAleatorio) {
            System.out.println(aux + ". " + n);
            aux++;
        }

        // SUMA
        for (int n : numAleatorio) {
            total += n;
        }
        System.out.println("La suma total de su contenido es: " + total + ".");

        // MEDIA
        for (int n : numAleatorio) {
            media += n;
        }
        media /= numAleatorio.size();
        System.out.println("La media de su contenido es: " + media + ".");

        // MINIMO
        for (int n : numAleatorio) {
            if (minimo >= n) {
                minimo = n;
            }
        }
        System.out.println("El valor minimo es " + minimo + ".");

        // MAXIMO
        for (int n : numAleatorio) {
            if (maximo <= n) {
                maximo = n;
            }
        }
        System.out.println("El valor maximo es " + maximo + ".");

    }
}
