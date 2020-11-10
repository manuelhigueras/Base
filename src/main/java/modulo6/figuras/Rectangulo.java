
package modulo6.figuras;

public class Rectangulo extends Figura {
    
    public int alto;
    public int ancho;

    @Override
    public void dibujar() {
        System.out.println("Dibujo un rectángulo de alto  " + alto
                +  " y ancho " + ancho + " en la posición " +  x + ", "+ y);
    }

    @Override
    public double calcularArea() {
        return alto * ancho;
    }
   
}
