package modulo7.enumeraciones;
public class PruebaEnumeracionAvanazada {
    public static void main(String[] args) {
        
        Palo p1 = Palo.OROS;
        System.out.println(" nombre :" +  p1.name() );
        System.out.println(" ordinal :" +  p1.ordinal());
        System.out.println(" valor :" + p1.getValor() );
        
        
    }
}
