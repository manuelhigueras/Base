
package modulo7.abstracta.informes;

import java.io.PrintStream;
import modulo7.abstracta.dominio.*;

public class InformeCombustibleNecesario {
    
    private Empresa empresa;

    public InformeCombustibleNecesario(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public void generateText(PrintStream output){
        Vehiculo v;
        double combustible;
        double total_combustible  = 0.0;
        for(int i = 0; i < empresa.getTamanoFlota(); i++ ){
            v = empresa.getVehiculo(i);
            //calcula combustible necesario para viaje
            combustible = v.calDistanticaViaje() / v.calEficienciaConsumo();
            System.out.println("El vehículo necesita " + Math.round(combustible )
                    + " litros de combustivle" );
            total_combustible += Math.round(combustible );
        }//fin recorrer vehiculos
        System.out.println("TOTAL Consumo necesario flota " + total_combustible);
        
    }//fin metodo
    
    
}
