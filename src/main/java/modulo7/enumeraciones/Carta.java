package modulo7.enumeraciones;

import java.util.Random;

public class Carta {
    
    //ATRIBUTOS
    private Palo palo;   // "OROS", "COPAS", "ESPADAS", "BASTOS"
    private int valor;

    //CONSTRUCTORES
    public Carta(Palo palo, int valor) {
        //validar
        this.palo = palo;
        // VALOR 1 A 10
        this.valor = valor;
    }
    
    
    public Carta(){
        this. palo = obtenerPaloAleatorio();
        this.valor =  obtenerValorAleatorio();
    }
    
    private Palo obtenerPaloAleatorio(){
        Palo[] palosBaraja = Palo.values();
        Random rdm = new Random();
        Palo p = palosBaraja[ rdm.nextInt(palosBaraja.length) ];
        return p; 
    }
    
    private int obtenerValorAleatorio(){
         Random rdm = new Random();
        return rdm.nextInt(11)+1;
    }
    
    
    //METODOS
    /**
     * Método que compara dos cartas indicando si es menor, igual o mayor
     * que la que se pasa como parametro
     * @param otraCarta
     * @return   entero negativo si es menor, valor 0 si es igual y positivo si es mayor
     */
    public int comparar(Carta otraCarta){
        
        if (this.equals(otraCarta)){
            return 0;
        }
        if(this.palo == otraCarta.palo){
            return this.valor - otraCarta.valor;
        }
        
        return   otraCarta.getPalo().ordinal() - this.palo.ordinal();
    }
    
    //GETTERS

    public Palo getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.valor != other.valor) {
            return false;
        }
        if (this.palo != other.palo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", valor=" + valor + '}';
    }
 
    
    
    
}//fin clase
