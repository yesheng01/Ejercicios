package Ejercicios_Condicionales;/*
   Ejercicios_Condicionales
   Nombre_project: Ejercicios
    Ejercicio12
    Created by: cide
    Date : 15/11/20
    Description:
*/
public class Ejercicio12{
    public static void main(String[] args) {

        System.out.println("¡Juega al minicuestionario!");
        int puntos = 0;
        int respuesta = 0;

        System.out.println("1ª pregunta: ¿En qué día de la semana fue el día de presentación?");
        System.out.println("1) Lunes");
        System.out.println("2) Martes");
        System.out.println("3) Sábado");
        System.out.println("4) Febrero");
        respuesta = Integer.parseInt(System.console().readLine());
        if (respuesta == 1) {
            puntos++;
        } /*1ª pregunta*/

        System.out.println("2ª pregunta: ¿Cuantas horas a la semana damos FOL?");
        System.out.println("1) media hora");
        System.out.println("2) 7 horas");
        System.out.println("3) 3 horas");
        System.out.println("4) 5 horas");
        respuesta = Integer.parseInt(System.console().readLine());
        if (respuesta == 3) {
            puntos++;
        } /*2ª pregunta*/

        System.out.println("3ª pregunta: ¿Quién nos da la asignatura de bases de datos?");
        System.out.println("1) Juan Antonio");
        System.out.println("2) Eva");
        System.out.println("3) Pilar");
        System.out.println("4) Isabel");
        respuesta = Integer.parseInt(System.console().readLine());
        if (respuesta == 2) {
            puntos++;
        } /*3ª pregunta*/

        System.out.println("4ª pregunta: ¿Cómo se le conocía a Juan Antonio en el grupo de Whattsapp de SMR?");
        System.out.println("1) profe router");
        System.out.println("2) Profesor RJ45");
        System.out.println("3) er wanan");
        System.out.println("4) er de rede, illo");
        respuesta = Integer.parseInt(System.console().readLine());
        if (respuesta == 3) {
            puntos++;
        } /*4ª pregunta*/

        System.out.println("5ª pregunta: ¿En programación, cómo se ejecutaría en consola el bytecode del ejercicio ej12.java?");
        System.out.println("1) java ej12.bytecode");
        System.out.println("2) java ej12");
        System.out.println("3) javac ej12.class");
        System.out.println("4) javac ej12.java");
        respuesta = Integer.parseInt(System.console().readLine());
        if (respuesta == 2) {
            puntos++;
        } /*5ª pregunta*/

        System.out.println("6ª pregunta: ¿Y cómo se compilaría?");
        System.out.println("1) java ej12.bytecode");
        System.out.println("2) java ej12");
        System.out.println("3) javac ej12.class");
        System.out.println("4) javac ej12.java");
        respuesta = Integer.parseInt(System.console().readLine());
        if (respuesta == 4) {
            puntos++;
        } /*6ª pregunta*/

        System.out.println("7ª pregunta: ¿Cual es la plataforma del IES Campanillas?");
        System.out.println("1) iescampanillas.es/moodle");
        System.out.println("2) iescampanillas.moodle.com");
        System.out.println("3) iescampanillas.com/moodle");
        System.out.println("4) moodle.iescampanillas.net");
        respuesta = Integer.parseInt(System.console().readLine());
        if (respuesta == 3) {
            puntos++;
        } /*7ª pregunta*/

        System.out.println("8ª pregunta: ¿Qué software hemos usado en bases de datos?");
        System.out.println("1) Xampp");
        System.out.println("2) Virtualbox");
        System.out.println("3) Dezign for Databases");
        System.out.println("4) La 1 y la 3 son correctas");
        respuesta = Integer.parseInt(System.console().readLine());
        if (respuesta == 4) {
            puntos++;
        } /*8ª pregunta*/

        System.out.println("9ª pregunta: ¿Si aprobaste FOL en SMR, puedes convalidarla en DAW/DAM?");
        System.out.println("1) Si, excepto los trabajos");
        System.out.println("2) SI");
        System.out.println("3) NO");
        System.out.println("4) Si, excepto los exámenes");
        respuesta = Integer.parseInt(System.console().readLine());
        if (respuesta == 2) {
            puntos++;
        } /*9ª pregunta*/

        System.out.println("10ª pregunta: ¿En qué lenguaje se programaba en DAI antes de pasar a llamarse DAW/DAM?");
        System.out.println("1) C");
        System.out.println("2) Ruby");
        System.out.println("3) C#");
        System.out.println("4) C++");
        respuesta = Integer.parseInt(System.console().readLine());
        if (respuesta == 1) {
            puntos++;
        } /*10ª pregunta*/

        System.out.printf("Has conseguido %d de 10 puntos.\n", puntos);
    }
}