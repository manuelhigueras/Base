
package modulo6.personal;

/**
 *
 * @author begonaolea
 */
public class Gerente extends Empleado{
    
    protected String departamento;

    //construtores
    public Gerente(String nombre, double salario , String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    public Gerente(String nombre, String dpto) {
      //  super(nombre);
      //  this.departamento = dpto;
      this(nombre, 0, dpto);
    }

    // métodos
    
    @Override
    public String toString() {
          return super.toString() 
                  + " Gerente de " + departamento ;
    }  

    public void organizarDepartamento(){
        System.out.println("... Organizo el departamento " + departamento);
    }
}
