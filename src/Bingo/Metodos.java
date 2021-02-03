package Bingo;

/**
 * Bingo
 * Nombre_project: Ejercicios
 * Metodos
 * Created by: sheng
 * Date : 02/02/2021
 * Description:
 **/
public class Metodos {
        //Metodo usado para generar numero enteros aleatorios.
        public static int generarNumAleatorio(int min, int max){
            int num= (int)(Math.random()*(min-(max+1))+(max+1));
            return num;

        }
}
