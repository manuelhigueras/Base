
package modulo7.enumeraciones;


public enum Palo {
    OROS(40), COPAS(30), 
    ESPADAS(20), BASTOS(10);
    
    private int valor;
    private String simbolo;
    
    private Palo(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
      
}
