
package modulo7.interfaces;


public class Pajaro implements Volable{

    public void canta(){
        System.out.println(" pio pio");
    }
    
    @Override
    public void despegar() {
        System.out.println("Despego como un pajaro");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizo como mis patitas ");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo batiendo las alas");
    }
    
}
