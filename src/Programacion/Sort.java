package Programacion;

import java.util.Arrays;

/**
 * Programacion
 * Nombre_project: Ejercicios
 * Array
 * Created by: sheng
 * Date : 18/12/2020
 * Description:
 **/

    public class Sort {

    public static void main(String[] args) {

        int[] numeros = {2, 8, 56, 3, 4, 8, 96, 21, 42, 56, 75, 11,

                52, 43, 62, 112, 14, 3, 9, 58, 27, 91, 64, 38};


        System.out.println("SIN ORDENAR");

        for (int x = 1; x < numeros.length; x++) {

            System.out.println(x + ": " + numeros[x]);

        }

        System.out.println("ORDENADOS");

        Arrays.sort(numeros);


        for (int i = 1; i < numeros.length; i++) {

            System.out.println(i + ": " + numeros[i]);

        }

    }
}