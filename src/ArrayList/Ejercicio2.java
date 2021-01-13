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

        ArrayList<Integer> nombres = new ArrayList<Integer>();

        int suma = 0;
        int media;
        int max = 0;
        int min = 0;
        boolean firstIteration = true;

        for (int i = 0; i <= 20; i++) {
            nombres.add((int) ((Math.random() * 99 +1)));
        }

        // SUMA
        for (Integer nombre : nombres) {
            if (firstIteration) {
                min = nombre;
                firstIteration = false;
            }
            suma += nombre;
            if (nombre > max) max = nombre;
            if (nombre < min) min = nombre;
        }
        // MEDIA
        media = suma / nombres.size();

        System.out.println(nombres + "\n\n");
        System.out.printf("SUMA: %d MAX: %d MIN: %d media : %d", suma,max, min,media);

    }
}
