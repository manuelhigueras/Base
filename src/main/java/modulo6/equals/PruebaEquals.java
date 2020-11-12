
package modulo6.equals;

public class PruebaEquals {
    
    public static void main(String[] args) {
        
        Figura f1 = new Figura(3,5, "Red");
        Figura f2 = new Figura(3,5, "Red");
        Figura f3 = f2;
        
        System.out.println(f1);
        
        System.out.println("f1 == f2?  " + (f1 == f2));
        System.out.println("f1 equals f2?  " + (f1.equals(f2)));
        
         System.out.println("f3 == f2?  " + (f3 == f2));
        System.out.println("f3 equals f2?  " + (f3.equals(f2)));
        
        
        
    }
    
}
