package Bingo;

/**
 * Bingo
 * Nombre_project: Ejercicios
 * Main
 * Created by: sheng
 * Date : 03/02/2021
 * Description:
 **/

public class Main {
    public static void main(String[] args) {
        Maquina m = new Maquina();
        Cartulina p1 = new Cartulina("Juan");
        Cartulina p2 = new Cartulina("Maria");
        p1.getCartulina();
        m.generarBola();
        m.getBola();
        p1.maracrCartulina(m.getBola());
        m.generarBola();
        m.comprobarGanador(p1);
        m.comprobarGanador(p2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("");


    }
}
