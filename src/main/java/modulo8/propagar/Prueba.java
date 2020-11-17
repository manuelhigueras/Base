
package modulo8.propagar;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Prueba {
    public static void main(String[] args)  {
        
        int sb = 40000;
        int meses = 0;
        
        CalcularNomina cn = new CalcularNomina();
        try {
            cn.generaNomina(sb, meses);
        } catch (Exception ex) {
            
            System.out.println("Error " + ex.getMessage());
            System.out.println("Puede volver a intentarlo pasando meses > 0");
        }
        
        
        double numeroAredondear = -34.34;
        Calculadora c = new Calculadora();
        double r = c.redondeoPositivos(numeroAredondear);
        
        
    }
}
