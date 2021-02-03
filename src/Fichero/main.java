package Fichero;

/**
 * Fichero
 * Nombre_project: Ejercicios
 * main
 * Created by: sheng
 * Date : 19/01/2021
 * Description:
 **/
public class main {
    public static void main(String[] args) {

        FitxersDam fitxersDam = new FitxersDam();
        fitxersDam.Fitxers("C:\\Users\\Sheng\\Documents\\prueba.txt" , "write");
        System.out.println(fitxersDam.writeFile("Hello"));
        fitxersDam.Fitxers("C:\\Users\\Sheng\\Documents\\prueba.txt" , "read");
        System.out.println(fitxersDam.readFile(1));
    }


}
