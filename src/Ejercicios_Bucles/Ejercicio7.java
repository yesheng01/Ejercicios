import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner combiancion = new Scanner(System.in);
        int intentos = 4;
        int combinaciones = 5988;
        boolean encertat = false;
        do {
            System.out.print("Pon la combinació: ");
            if(combiancion.nextInt() == combinaciones){
                System.out.println("Combinació correcta");
                encertat = true;
            } else {
                System.out.println("Ho sentim, combinació incorrecta.");
                intentos--;
            }
        } while(intentos > 0 && !encertat);
    }
}