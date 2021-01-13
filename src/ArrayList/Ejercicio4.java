package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ArrayList
 * Nombre_project: Ejercicios
 * Ejercicio4
 * Created by: sheng
 * Date : 13/01/2021
 * Description:
 **/
public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> Nombre = new ArrayList<String>();
        int i;
        Scanner escrito = new Scanner(System.in);
        System.out.println("Introduce 10 numero enteros: ");
        for (int j = 0; j < 10; j++) {
            Nombre.add(escrito.nextLine());
        }
        Collections.sort(Nombre);
        System.out.println(Nombre);
    }
}
