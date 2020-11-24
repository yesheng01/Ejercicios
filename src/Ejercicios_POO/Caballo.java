package Ejercicios_POO;/*
   Ejercicios_POO
   Nombre_project: Ejercicios
    Caballo
    Created by: cide
    Date : 14/11/20
    Description:
*/

public class Caballo {
    String nombre;
    String rasa;
    String color;


    public Caballo(String nombre,String rasa,String color) {
        this.nombre = nombre;
        this.rasa = rasa;
        this.color = color;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getRasa() {
        return this.rasa;
    }

    public void camina() {
        System.out.println("taca taca taca taca");
    }
    public void relincha() {
        System.out.println("emmmmmmmmmmiaaaaaaaa");
    }

}