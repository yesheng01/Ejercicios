import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);

        int nombre = 0;

        System.out.print("Introdueix el nombre: ");

        nombre = userIn.nextInt();

        System.out.println("El nombre " + nombre + " te " + (Double.toString(nombre).replace(".","").length()) + " digits.");

    }
}