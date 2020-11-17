package modulo8.propagar;

public class Calculadora {
    /**
     * divide dos numeros enteros . 
     * @param n1  numerador
     * @param n2  divisor
     * @return    double con la división
     * @throws Exception   si n2 es cero da error
     */
    public double dividir(int n1, int n2) throws CalculadoraException{
        
        if(n2 == 0){
            throw new CalculadoraException("Denominador no debe ser 0", n2 );
        }
        return n1/n2;
        
    }//fin dividir
    
    /**
     * Redondea un numeor positivo 
     * @param numero
     * @return el numero double redondeado a cero decimales
     * @throws IllegalArgumentException  si numero es negativo
     */
    public double redondeoPositivos(double numero) throws IllegalArgumentException{
        
        // positivo validr
        if(numero < 0){
            // hijo de RuntimeException
            throw new IllegalArgumentException("el numero debe ser positivo pero es " + numero);
        }
        return Math.round(numero);
    }
    
    
}
