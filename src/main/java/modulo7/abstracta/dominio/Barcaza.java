
package modulo7.abstracta.dominio;


public class Barcaza extends Vehiculo{

    public Barcaza(double cargaMaxima) {
        super(cargaMaxima);
    }

    @Override
    public double calDistanticaViaje() {
        System.out.println(". cal disntacia viaje barcaza");
        return 144.0;
    }

    @Override
    public double calEficienciaConsumo() {
        System.out.println("cal eficiencia consumo barcaza");
        return 2.7;
    }
    
}
