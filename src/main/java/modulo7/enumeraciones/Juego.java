
package modulo7.enumeraciones;


public class Juego {
    
    public static void main(String[] args) {   
        
        //CASOS 
        //  1 Cartas iguales
        //  Cartas mismo palo  pero valores distins
        //  Cartas distinto palo  pero mismo valor
        //  Cartas distintos palos igual valor
   
        //CASO 1
        Carta c1 = new Carta(Palo.BASTOS,4);
        Carta c2 = new Carta(Palo.BASTOS,4);
        
        System.out.println("espero  0");
        System.out.println("sale " + c1.comparar(c2));
        
        //CASO 2  - c1 valor menor
        c1 = new Carta(Palo.BASTOS,4);
        c2 = new Carta(Palo.BASTOS,8);
        
        System.out.println("espero  -");
        System.out.println("sale " + c1.comparar(c2));
        
        //CASO 2  - c1 valor mayor
        
        c1 = new Carta(Palo.BASTOS,10);
        c2 = new Carta(Palo.BASTOS,2);
        
        System.out.println("espero  -");
        System.out.println("sale " + c1.comparar(c2));
        
        
        
        
        
        
//        int resultado = c2.comparar(c);
//        
//        System.out.println(Palo.BASTOS);
//        
//        Palo[] palosBaraja = Palo.values();
//        
//        for(Palo p : palosBaraja){
//            System.out.println(p);
//        }
//        
//        if ( c.getPalo() == Palo.BASTOS){
//            System.out.println(".... igual"); 
//        }
//        
//        System.out.println(c.getPalo().ordinal());
       
        
        char s = '\u03A0';
        System.out.println("s " + s);
    } 
}
