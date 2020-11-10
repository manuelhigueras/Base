
package modulo6.figuras;

public class Circulo extends Figura{
    
    public double radio;

    @Override
    public void dibujar() {
        System.out.println("Dibujo un círculo de radio "
                +  radio + " en la posición " +  x + ", "+ y);
    }

    
    @Override
    public double calcularArea() {
        return 2 * Math.PI * radio;
    }
    
    
    
}
