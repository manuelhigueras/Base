
package modulo8;


public class PruebaFinally {
    
    
    public static void main(String[] args) {
        suma("SUMATORIO", 3,4,6,7,8,67);
    }
    
    
    public static void suma(String titulo, int... numeros){
        int total = 0;
        for(int n : numeros){
            total += n;
        }
        System.out.println(titulo.toUpperCase()  );
        System.out.println("...................");
        System.out.println("Total : " + total);
        
    }//suma
    
}
