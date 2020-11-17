package modulo8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prueba2 {

    public static void main(String[] args) {

        File carta = new File("/otros/carta.txt");

        try {
            //crear fichero
            carta.createNewFile();
            
        } catch (FileNotFoundException ex1) {
            
            System.out.println("Fichero no  existe");
            
        } catch (IOException ex2) {

            System.out.println("Error " + ex2.getMessage());
            ex2.printStackTrace();

        } catch (Exception ex3) {
            System.out.println("Error inteperado");
            System.out.println("Error " + ex3.getMessage());
        }//fin try-catch

    }//fin main

}//
