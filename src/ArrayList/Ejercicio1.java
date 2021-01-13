package ArrayList;

/**
 * ArrayList
 * Nombre_project: Ejercicios
 * ArrayList
 * Created by: sheng
 * Date : 12/01/2021
 * Description:
 **/

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();

        alumnos.add("Gonzalo");
        alumnos.add("Miguel");
        alumnos.add("Carlos");
        alumnos.add("Adan");
        alumnos.add("Rodrigo");
        alumnos.add("Lluc");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
            
        }
    }
}
