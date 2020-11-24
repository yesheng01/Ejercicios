package Ejercicios_POO;/*
   Ejercicios_POO
   Nombre_project: Ejercicios
    TestCaballo
    Created by: cide
    Date : 14/11/20
    Description:
*/

public class TestCaballo {
    public static void main(String[] args) {
        Caballo x = new Caballo("Togo", "arabe", "marron");
        Caballo y = new Caballo("Steven", "mustang", "negro");

        System.out.println(" Mi nombre es " + x.getNombre());
    x.camina();


    System.out.println(" Mi nombre es " + y.getNombre()+ "." );
    y.relincha();
}
}
