package modulo8.propagar;

public class CalculadoraException extends Exception{

    private double numeroMal;
    
    //consturcot 
    public CalculadoraException(String msg, double numeroMal) {
        super(msg);
        this.numeroMal = numeroMal;
    }

    public double getNumeroMal() {
        return numeroMal;
    }
 
    
}
