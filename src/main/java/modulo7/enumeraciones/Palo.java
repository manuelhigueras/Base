
package modulo7.enumeraciones;


public enum Palo {
    OROS(40), COPAS(30), 
    ESPADAS(20), BASTOS(10);
    
    private int valor;
    
    private Palo(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
    
}
