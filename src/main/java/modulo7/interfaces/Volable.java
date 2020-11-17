
package modulo7.interfaces;

public interface Volable {
    
    // constantes static
    public static final int ALTURA_MAX_VUELO = 20_000; // pies
    
    // métodos abstractos - 
    // lo ponga o no siempre es public abstract 
    public abstract void despegar();
    abstract void aterrizar();
    void volar();
}
