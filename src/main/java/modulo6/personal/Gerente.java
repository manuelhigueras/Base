
package modulo6.personal;

/**
 *
 * @author begonaolea
 */
public class Gerente extends Empleado{
    
    protected String departamento = "";

    @Override
    public String toString() {
          return super.toString() 
                  + " Gerente de " + departamento ;
    }  

    public void organizarDepartamento(){
        System.out.println("... Organizo el departamento " + departamento);
    }
}
