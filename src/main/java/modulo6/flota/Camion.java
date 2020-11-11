
package modulo6.flota;

public class Camion extends Vehiculo {
    
    private int ejes;

    public Camion(int ejes) {
        this.ejes = ejes;
    }

    @Override
    public double peaje() {
        return super.peaje() + (ejes * 2);
    }
  
}
