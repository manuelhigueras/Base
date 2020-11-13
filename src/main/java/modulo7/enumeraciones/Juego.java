
package modulo7.enumeraciones;


public class Juego {
    
    public static void main(String[] args) {    
        Carta c = new Carta(Palo.BASTOS,4);
        Carta c2 = new Carta(Palo.COPAS,8);
        
        int resultado = c2.comparar(c);
        
        System.out.println(Palo.BASTOS);
        
        Palo[] palosBaraja = Palo.values();
        
        for(Palo p : palosBaraja){
            System.out.println(p);
        }
        
        if ( c.getPalo() == Palo.BASTOS){
            System.out.println(".... igual"); 
        }
        
    } 
}
