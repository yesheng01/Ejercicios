import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.print("Introduzca un numero entre 0 y 9:");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 0 && num <= 9) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i * num);
            }
        } else {
            while (num >= 10) {
                System.out.println("Error, introduzca un numero entre 0 y 9 otra vez");
                num = sc.nextInt();

            }
        }
    }
}
