package modulo7.abstracta.figuras;

public final class Cuadrado3D extends Figura3D{

    private int lado ;

    public Cuadrado3D(int lado, int x, int y, int z, String color) {
        super(x, y, z, color);
        this.lado = lado;
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujo un cuadrado en 3D  de lado "  +  lado +
                " en la posicion [" + x + ", " + y + ", " + z +"]");
    }
    
}
