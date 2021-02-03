package Fichero;

import java.io.*;
import java.util.Scanner;

/**
 * Fichero
 * Nombre_project: Ejercicios
 * FitxersDam
 * Created by: sheng
 * Date : 19/01/2021
 * Description:
 **/
public class FitxersDam {
        private String File;
        private BufferedWriter writer;
        private BufferedReader reader;

    public void Fitxers(String file , String mode){
        try{
            this.File = file;
            if (mode.equals("write")){
                this.writer = new BufferedWriter(new FileWriter(this.File));
            }else if(mode.equals("read")){
                this.reader = new BufferedReader(new FileReader(this.File));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String readFile(int line){
        String output = "";
        try {
            for (int i = 0; i < line; i++) {
                output += this.reader.readLine();
            }
            this.reader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return output;
    }

    public boolean writeFile(String text){
        try {
            this.writer.write(text);
            this.writer.close();
            return true;
        }catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }


}


