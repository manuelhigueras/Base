
package modulo6.equals;

public class PruebaEquals {
    
    public static void main(String[] args) {
        
        Figura f1 = new Figura(3,5, "Red");
        Figura f2 = new Figura(3,5, "Red");
        Figura f3 = f2;
        
        System.out.println(f1);
        
        if( f1 == f2 ){
            System.out.println(" son iguales ");
        }else{
            System.out.println(" no son iguales ");
        }
        
        if( f1.equals(f2)){
            System.out.println(" son iguales ");
        }else{
            System.out.println(" no son iguales ");
        }
        
    }
    
}
