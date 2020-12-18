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
public class Array {

    public void sortArray(int[] arrayToSort){

        // Add the max value of the arrayToSort
        int[] count = new int[1000];

        for(int i = 0; i < arrayToSort.length;i++){
            count[arrayToSort[i] - 1]++;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] != 0)
                System.out.println(i + 1);
        }
    }

        public static void main(String[] args) {
            int[] toSort = new int[]{1,1,6,3,5,7,9,54,86,23,56};
            Array s = new Array();
            s.sortArray(toSort);
        }
}