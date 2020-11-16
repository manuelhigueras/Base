package modulo7.abstracta;

import modulo7.abstracta.dominio.*;
import modulo7.abstracta.informes.InformeCombustibleNecesario;

public class TransporteMain {

    public static void main(String[] args) {
        Empresa c = new Empresa();
        // llena la empresa con una flota de vehículos
        c.addVehiculo(new Camion(10000.0));
        c.addVehiculo(new Camion(15000.0));
        c.addVehiculo(new Barcaza(500000.0));
        c.addVehiculo(new Camion(9500.0));
        c.addVehiculo(new Barcaza(750000.0));
        
        InformeCombustibleNecesario informe = new InformeCombustibleNecesario(c);
        informe.generateText(System.out);
    }
}
