
package modulo7.enumeraciones;


public class Juego {
    
    public static void main(String[] args) {   
        
        //CASOS 
        //  1 Cartas iguales
        //  Cartas mismo palo  pero valores distins
        //  Cartas distinto palo  pero mismo valor
        //  Cartas distintos palos igual valor
   
        //CASO 1 - cartas iguales
        Carta c1 = new Carta(Palo.BASTOS,4);
        Carta c2 = new Carta(Palo.BASTOS,4);
        
        System.out.println("espero  0");
        System.out.println("sale " + c1.comparar(c2));
        
        //CASO 2  - pasos IGUALES pero c1  valor menor
        c1 = new Carta(Palo.BASTOS,4);
        c2 = new Carta(Palo.BASTOS,8);
        
        System.out.println("espero  -");
        System.out.println("sale " + c1.comparar(c2));
        
        //CASO 2  B - pasos IGUALES c1 valor mayor
        
        c1 = new Carta(Palo.BASTOS,10);
        c2 = new Carta(Palo.BASTOS,2);
        
        System.out.println("espero  -");
        System.out.println("sale " + c1.comparar(c2));
        
        //CASO 3  A - palos distintos donde c1 palo mayor que c2 
        
        c1 = new Carta(Palo.OROS,10);
        c2 = new Carta(Palo.BASTOS,2);
        
        System.out.println("espero  +");
        System.out.println("sale " + c1.comparar(c2));
        
        
         //CASO 3  A - palos distintos donde c1 palo MENOR que c2 
        
        c1 = new Carta(Palo.ESPADAS,10);
        c2 = new Carta(Palo.COPAS,2);
        
        System.out.println("espero  -");
        System.out.println("sale " + c1.comparar(c2));
        
        //PROBAR CREAR DOS CARTAS ALEATORIAMENTE Y 
        //JUGAR
        
        c1 = new Carta();
        c2 = new Carta();
        
        System.out.println("carta 1: " + c1);
        System.out.println("carta 2: " + c2);
        int res = c1.comparar(c2) ;
        if(res == 0){
            System.out.println(" empate");
        }else if (res > 0 ){
            System.out.println(" gana carta 1");
        }else{
             System.out.println(" gana carta 2");
        }
         
        
        
        
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
