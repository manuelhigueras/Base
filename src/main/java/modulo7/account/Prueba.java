
package modulo7.account;

public class Prueba {
    
    public static void main(String[] args) {
        
        System.out.println( Counter.counter);  //0
        
        Counter c1 = new Counter();
        System.out.println(c1);
        
        System.out.println("Ahora counter vale " + Counter.counter);  //1
        
        Counter c2 = new Counter();
        System.out.println(c2);
        
        System.out.println("Ahora counter vale " + Counter.counter);  //2
        
    }
    
}
