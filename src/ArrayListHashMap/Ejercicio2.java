package ArrayListHashMap;
import java.util.*;
/**
 * ArrayListHashMap
 * Nombre_project: Ejercicios
 * Ejercicio2
 * Created by: sheng
 * Date : 13/01/2021
 * Description:
 **/
public class Ejercicio2 {
        public static void main(String[] args) {
            ArrayList<Moneda> monedas = new ArrayList();
            monedas.add(new Moneda());

            Moneda aux;
            int indice = 0;

            while (monedas.size() != 6) {
                aux = new Moneda();

                if ((aux.getValor().equals(monedas.get(indice).getValor())) || (aux.getPosicion().equals(monedas.get(indice).getPosicion()))) {
                    monedas.add(aux);

                    indice++;
                }
            }

            for (Moneda m : monedas) {
                System.out.println(m);
            }

        }


}
