
package modulo6.figuras;

public class Figura {
    protected int x;
    protected int y;
    
    public void dibujar(){
        System.out.println("Dibujo figura en posición " + x + ", " + y);
    }
    
    public double calcularArea(){
        return 0.0;
    }
}
