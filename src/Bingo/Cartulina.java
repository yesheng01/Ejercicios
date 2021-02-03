package Bingo;

/**
 * Bingo
 * Nombre_project: Ejercicios
 * Bingo
 * Created by: sheng
 * Date : 02/02/2021
 * Description:
 **/
public class Cartulina {

    //Attriubutes
    private int[] cartulina;
    private boolean[] marcas=new boolean[10];
    private String nombre;
    //Builder

    public Cartulina(String nombre) {
        this.nombre = nombre;
        this.cartulina= new int[10];
        generarCartulina();
    }

    //Getters/Setters

    public int[] getCartulina() {
        return cartulina;
    }

    public void setCartulina(int[] catulina) {
        this.cartulina = catulina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean[] getMarcas() {
        return marcas;
    }

    public void setMarcas(boolean[] marcas) {
        this.marcas = marcas;
    }

    //Other Methods
    private void generarCartulina(){
        for (int i = 0; i < cartulina.length; i++) {
            int num=Metodos.generarNumAleatorio(1,99);
            for (int j = 0; j < cartulina.length; j++) {
                if (cartulina[j]==num){
                    num=Metodos.generarNumAleatorio(1,99);
                }
            }
            cartulina[i]=num;
        }
    }
    public void maracrCartulina(int bola){
        for (int i = 0; i < cartulina.length; i++) {
            if (cartulina[i]==bola){
                marcas[i]=true;
            }
        }
    }
    public boolean cartulinaLLena(){
        int cont=0;
        for (int i = 0; i < marcas.length; i++) {
            if (marcas[i]){
                cont++;
            }
        }
        if (cont==10){
            return true;
        }
        return false;
    }
}