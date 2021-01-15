package ArrayListHashMap;
import java.util.Scanner;
import java.util.*;
/**
 * ArrayListHashMap
 * Nombre_project: Ejercicios
 * Ejercicio1
 * Created by: sheng
 * Date : 13/01/2021
 * Description:Implementa el control d’accés a l’àrea restringida d’un programa.
 * S’ha de demanar un nom d’usuari i una contrasenya. Si l’usuari introdueix les dades correctament, el programa dirà “Ha accedit a l’àrea restringida”.
 * L’usuari tindrà un màxim de 3 oportunitats. Si s’esgoten les oportunitats el programa dirà “Ho sento, no té accés”.
 * Els noms d’usuari i contrasenyes han d’estar emmagatzemats en una estructura de la classe HashMap.
 **/
public class Ejercicio1 {
    public static void main(String[] args) {
        boolean Correcto = false;
        int intentos= 0;
        String Usuario;
        String Contraseña;

        Scanner numero = new Scanner(System.in);
        HashMap<String , String> usuarios = new HashMap();

        usuarios.put("usuario1" , "1234" );

        while (intentos !=3 && !Correcto) {
            System.out.println("Nombre de usuario : ");
            Usuario = numero.nextLine();

            System.out.println("Contraseña : ");
            Contraseña = numero.nextLine();
        if ((usuarios.containsKey(Usuario)) && (usuarios.get(Usuario).equals(Contraseña))){
                System.out.println("Has podido acceder a ello. ");
                Correcto = true;
            }else {
            System.out.println("Error , vuelve a introducir los datos . \n \n ");

        }
        intentos ++ ;
        }
    }
}
