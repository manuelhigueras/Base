
package modulo7.abstracta.figuras;

public abstract class Figura3D extends Figura {
    
    protected int z;

    public Figura3D( int x, int y, int z,  String color) {
        super(x, y, color);
        this.z = z;
    }

    public int getZ() {
        return z;
    }
 
}
