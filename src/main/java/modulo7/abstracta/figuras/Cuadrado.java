
package modulo7.abstracta.figuras;

public class Cuadrado extends Figura{
    private int lado ;

    public Cuadrado(int lado, int x, int y, String color) {
        super(x, y, color);
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("DIBUJO UN CUADRADO de lado " + lado + 
                " en la posicion [" + x+", " + y +"]");
    }//fin dibujar
    
}
