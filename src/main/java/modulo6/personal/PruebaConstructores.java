
package modulo6.personal;

import java.util.Date;


public class PruebaConstructores {
    
    public static void main(String[] args) {
        Date fecha = new Date(89,0,31); // año + 1900 , mes 0 a 11, dia
        Empleado e1 = new Empleado("Luis Ramos",20_000.0, fecha);
        System.out.println(e1);
        
        Empleado e2 = new Empleado("Laura Roca", 39_0000.0);
        System.out.println(e2);
    }
    
}
