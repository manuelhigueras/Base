package modulo8;

public class PruebaFinally {

    public static void main(String[] args) {
       // suma("SUMATORIO", 3, 4, 6, 7, 8, 67);
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
           // return;
        } catch (Exception e) {
            System.out.println("Has indicado mal el titulo");
            return ;
        }finally{
            System.out.println(".... fin  suma en finally");
        }
        System.out.println("...  fin del fin de suma");
        
    }//suma
}//fin clase
