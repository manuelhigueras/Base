
package modulo7.abstracta.dominio;

// AHORA ES CLASE BASE PARA OTRAS CLSES HIJA
// NO PERMITE INSTANCIAR OBJETO DE TIPOS VEHICULO 
// ERRRO NEW VEHICULO
public abstract class Vehiculo {
    
    private double cargaMaxima;

    public Vehiculo(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }
    
    //MÉTODOS ABSTRACTOS
    public abstract double calDistanticaViaje();
    public abstract double calEficienciaConsumo();
    
}//fin clase
