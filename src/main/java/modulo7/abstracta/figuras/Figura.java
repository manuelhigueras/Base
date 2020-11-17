package modulo7.abstracta.figuras;

public abstract class Figura {
    
    protected int x, y;
    protected String color;

    public Figura(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figura{" + "x=" + x + ", y=" + y + ", color=" + color + '}';
    }
    
    public abstract  void dibujar();

}//fin clases
