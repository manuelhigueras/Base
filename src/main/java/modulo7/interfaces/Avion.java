
package modulo7.interfaces;

import modulo7.abstracta.dominio.Vehiculo;

public class Avion extends Vehiculo implements Volable{

    public Avion(double cargaMaxima) {
        super(cargaMaxima);
    }
    

    @Override
    public double calDistanticaViaje() {
        System.out.println("calculo disntanica viaje AVION");
        return 34.8;
    }

    @Override
    public double calEficienciaConsumo() {
        System.out.println("calculo eficienciaconsumo fuel  AVION");
        return 4.8; 
    }

    @Override
    public void despegar() {
        System.out.println("Despego como un avión");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizo como un avión ");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo como un avión");
    }

}
