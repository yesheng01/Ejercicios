
public class Objeto {
    public static void main(String[] args) {
        test prueba1;
        prueba1= new test();
        System.out.println(prueba1.GetAllTest());
    }
public static class test{
    private int inttest;
    private char charTest;
    public String GetAllTest(){
        return "" + inttest + ", " + charTest;
    }
    }
}