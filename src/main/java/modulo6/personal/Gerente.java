
package modulo6.personal;

/**
 *
 * @author begonaolea
 */
public class Gerente extends Empleado{
    
    public String departamento = "";

    @Override
    public String toString() {
          return "{" + "nombre=" + nombre 
                  + ", salario=" + salario 
                  + ", fechaNacimiento=" + fechaNacimiento 
                  + " Gerente de " + departamento
                  + '}';
    }  
}
