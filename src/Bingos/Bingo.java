package Bingos;

import java.util.ArrayList;
import java.util.Random;

/**
 * Bingos
 * Nombre_project: Ejercicios
 * Bingo
 * Created by: sheng
 * Date : 03/02/2021
 * Description:
 **/
public class Bingo {
    ArrayList<Integer> jugador1 = new ArrayList<>(10);
    ArrayList<Integer> jugador2 = new ArrayList<>(10);

    public static void main(String[] args) {
        long tStart,tEnd,tTotal;
        tStart=System.currentTimeMillis();
        Bingo bingo = new Bingo();
        bingo.juego();
        bingo.jugar();

        tEnd=System.currentTimeMillis();
        tTotal=tEnd-tStart;
        System.out.println("Tiempo de ejecución total: "+tTotal + "miliseg");
    }

    public void juego() {
        Random numero = new Random();
        for (int i = 0; i < 10; i++) {
            int cartulina1 = (numero.nextInt(99)+1);
            jugador1.add(cartulina1);
            int cartulina2 = (numero.nextInt(99)+1);
            jugador2.add(cartulina2);
        }
        System.out.println("Empieza el Juego:");
        System.out.println("Cartulina de primer jugador " + jugador1 );
        System.out.println("Cartulina de segundo jugador" +jugador2 + "\n");
    }

    public void jugar() {
        Random numero = new Random();
        while (!jugador1.isEmpty() && !jugador2.isEmpty()) {
            int letreros = (numero.nextInt(99)+1);
            if (jugador1.contains(letreros)) {
                jugador1.remove(Integer.valueOf(letreros));
            }
            if (jugador2.contains(letreros)) {
                jugador2.remove(Integer.valueOf(letreros));
            }
            System.out.println("el numero sacada es.." + letreros);
            System.out.println("Cartulina 1 numeros que quedan" + jugador1 );
            System.out.println("Cartulina 2 numeros que quedan " + jugador2);
            System.out.println("-----------------------------------------------------------");
        }

            if (jugador1.isEmpty() && jugador2.isEmpty()) {
                System.out.println("Los jugadores han empatado! \n");
            }else if (jugador1.isEmpty()) {
                System.out.println("Bingo , Ha ganado el primero!!!! \n" );
            } else if (jugador2.isEmpty()) {
                System.out.println("Bingo , Ha ganado el segundo!!!! \n");
            }
    }
}
