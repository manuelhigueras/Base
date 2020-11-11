package modulo6.flota;


public class Prueba {
    
    public static void main(String[] args) {
        
        System.out.println("... creo peaje");
        Peaje p = new Peaje();
        
        // pasa un Vehiculo
        Vehiculo  v =    new Barcaza();
                      // new Vehiculo();
                      // new Camion();
        System.out.println(" va a pagar " + p.pagarPeaje(v) + " €");
        
        
        
    }
    
}
