package modulo8;

public class Pruebas {

    public static void main(String[] args) {
        try {
            // Exception 
            //     RuntimeException (no chequeables)
            //     Resto  son chequeables 
            String s = "22";

            int n = Integer.parseInt(s); //NumberFormatException

            System.out.println("n es " + n);
            s = "veintidos";
            n = Integer.parseInt(s);

            System.out.println("n es " + n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//Fin main

}//fin class
