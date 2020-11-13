package modulo7.enumeraciones;

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
        this. palo = aletorio 
        this.valor =  aleatorio 
    }
    
    //METODOS
    public int comparar(Carta otraCarta){
        return 0;
    }
    
    //GETTERS

    public Palo getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }
 
    
    
}//fin clase
