
package modulo7.account;

public class Counter {
    
    private int serialNumber;
    private static int counter = 0;

    public Counter() {
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
