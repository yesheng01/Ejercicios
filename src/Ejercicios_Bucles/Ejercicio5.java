public class Ejercicio5 {
    public static void main(String[] args) {
        int contado = 320;
        while(contado >= 160) {
            if (contado % 20 == 0)
                System.out.println(contado);
            contado--;
        }
    }
}

