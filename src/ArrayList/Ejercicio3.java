package ArrayList;
import java.util.ArrayList;
import  java.util.*;
/**
 * ArrayList
 * Nombre_project: Ejercicios
 * Ejercicio3
 * Created by: sheng
 * Date : 13/01/2021
 * Description:
 **/
public class Ejercicio3 {
    public static void main(String[] args) {
    ArrayList<Integer> numero = new ArrayList<Integer>();
    int i;
    Scanner escrito = new Scanner(System.in);
        System.out.println("Introduce 10 numero enteros: ");
        for (int j = 0; j < 10; j++) {
            numero.add(escrito.nextInt());
        }
        Collections.sort(numero);
        System.out.println(numero);

    }
}
