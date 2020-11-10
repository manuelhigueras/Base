
package modulo6.personal;

/**
 *
 * @author begonaolea
 */
public class Director extends Gerente{
    public double vehiculoEmpresa;
    
    public void aumentarComision(){
        System.out.println(".... aumento mi comisión");
    }
    
     @Override
    public String toString() {
          return "{" + "nombre=" + nombre 
                  + ", salario=" + salario 
                  + ", fechaNacimiento=" + fechaNacimiento 
                  + " Gerente de " + departamento
                  + " Vehículo empresa " + vehiculoEmpresa
                  + '}';
    }  

    @Override
    public void saluda() {
        System.out.println("Buenos días soy el Director");
    }
    
}//fin clase
