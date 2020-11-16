
package modulo7.abstracta.dominio;

public class Camion extends Vehiculo{

    public Camion(double cargaMaxima) {
        super(cargaMaxima);
    }

    @Override
    public double calDistanticaViaje() {
        System.out.println(". cal disntacia viaje camion");
        return 32.0;
    }

    @Override
    public double calEficienciaConsumo() {
        System.out.println("cal eficiencia consumo camion");
        return 3.5;
    }
    
}
