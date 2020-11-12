package modulo6.equals;


public class Figura {
    
    protected int x;
    protected int y;
    protected String color;

    public Figura(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //toString
    
    //equals

    @Override
    public String toString() {
        return "Figura{" + "x=" + x + ", y=" + y + ", color=" + color + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.x;
        hash = 59 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Figura other = (Figura) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    
}
