package modulo7.enumeraciones;

public class Carta {
    
    //ATRIBUTOS
    private String palo;   // "OROS", "COPAS", "ESPADAS", "BASTOS"
    private int valor;

    //CONSTRUCTORES
    public Carta(String palo, int valor) {
        //validar
        this.palo = palo;
        this.valor = valor;
    }
    
    //METODOS
    public int comparar(Carta otraCarta){
        return 0;
    }
    
    //GETTERS

    public String getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }
 
    
    
}//fin clase
