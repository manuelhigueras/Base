
package modulo7.account;


public class Counter3 {
    
    private int serialNumber;
    private static int counter;
    
    //bloque static - se ejecuta una vez para toda la aplicación 
    //              - cuando se carga la clase
    static{
        // java -DvalorInicioCounter=3 NombrClasePrueba
        counter =  Integer.getInteger("valorInicioCounter");
    }

    //constructor - se ejecuta cada vez que instancio un objeto de la clase
    public Counter3() {
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
