import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);

        double accumulador = 0;

        double intermediari = 0;

        int comptador = 0;

        boolean terminat = false;

        do {

            System.out.print("Introdueix un nombre: ");

            intermediari = userIn.nextDouble();

            if(intermediari < 0 )
                terminat = true;

            accumulador += intermediari;

            comptador++;

        } while (!terminat);

        System.out.println("La mitja dels nombres introduits es: " + (accumulador / comptador));

    }
}