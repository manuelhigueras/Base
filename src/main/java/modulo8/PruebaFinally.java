package modulo8;

public class PruebaFinally {

    public static void main(String[] args) {
        suma("SUMATORIO", 3, 4, 6, 7, 8, 67);
        suma(null, 34, 56, 7);
    }//fin main

    public static void suma(String titulo, int... numeros) {
        int total = 0;
        for (int n : numeros) {
            total += n;
        }
        try {
            System.out.println(titulo.toUpperCase());
            System.out.println("...................");
            System.out.println("Total : " + total);
        } catch (Exception e) {
            System.out.println("Has indicado mas el titulo");
        }finally{
            System.out.println(".... fin  suma");
        }
    }//suma
}//fin clase
