package Ejercicios_Bucles;

/**
 * Ejercicios_Bucles
 * Nombre_project: Ejercicios
 * Ejercicio16
 * Created by: cide
 * Date : 24/11/20
 * Description:
 **/
public class Ejercicio16 {

    public static void main(String[] args) {

        if (args.length==0) {
            System.out.println("Heu d'introduir un nombre enter com argument.");
        } else {

            int nombreIntroduit = Integer.parseInt(args[0]);

            boolean esPrimer = true;

            for (int i = 2; i < nombreIntroduit; i++) {
                if ((nombreIntroduit % i) == 0) {
                    esPrimer = false;
                }
            }

            if (esPrimer) {
                System.out.println("El nombre introduït és primer.");
            } else {
                System.out.println("El nombre introduït no és primer");
            }
        }
    }
}
