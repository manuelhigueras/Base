
package modulo7.abstracta.dominio;

public class Empresa {
    //atributos
    private Vehiculo[] vehiculos;
    private int tamanoFlota = 0;
    //constructores
    public Empresa() {
        this.vehiculos = new Vehiculo[5];
    }
    //Métodos
    public int getTamanoFlota() {
        return tamanoFlota;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }
    
    public void addVehiculo(Vehiculo v){
        if(tamanoFlota < 5){
             this.vehiculos[tamanoFlota] = v;
             tamanoFlota ++;
        }
    }

}//fin clase
