
package modulo7.account;

import java.io.File;

public class Counter2 {
    
    private int serialNumber;
    private static int counter;
    
    //bloque static - se ejecuta una vez para toda la aplicación 
    //              - cuando se carga la clase
    static{
        System.out.println("... static");
        //File f = new File("paramentros.properties");
        //.... 
        counter = 0;
    }

    //constructor - se ejecuta cada vez que instancio un objeto de la clase
    public Counter2() {
        System.out.println(".... constructor");
        counter ++;
        this.serialNumber = counter;
    }

    @Override
    public String toString() {
        return "Account{" + "serialNumber=" + serialNumber + '}';
    }  

    public static int getCounter() {
        return counter;
    }
    
}
