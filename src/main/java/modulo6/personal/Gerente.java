
package modulo6.personal;

/**
 *
 * @author begonaolea
 */
public class Gerente extends Empleado{
    
    public String departamento = "";

    @Override
    public String toString() {
          return super.toString() 
                  + " Gerente de " + departamento ;
    }  
}
