package modulo6.figuras;

public class Cuadrado extends Figura {
    
    public int lado;

    @Override
    public void dibujar() {
        System.out.println("Dibujo un cuadrado de lado "
                +  lado + " en la posición " +  x + ", "+ y);
    }

    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
}
