
package modulo6.equals;

public class PruebasEqualsString {
    
    public static void main(String[] args) {
        
        String a = "Ramona";
        String b = "Ramona";
        String c = new String("Ramona");
        
        System.out.println("a == b?  " + (a == b));
        System.out.println("a equals b?  " + (a.equals(b)));
     
        System.out.println("a == c?  " + (a == c));
        System.out.println("a equals c?  " + (a.equals(c)));
        
        
        
        
        //INMUTABLE
        String s = "Hola";
        
        System.out.println(s);
        s = s.concat(" amigo");
        System.out.println(s); 
      
        
        Integer i = 200;
        Integer j =200;
        
        System.out.println(i.equals(j));
        System.out.println(i == j);
        
        
        
    }
    
}
