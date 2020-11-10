package modulo6.personal;

import java.util.Date;

/**
 * Clase que modela un empleado
 * @author begonaolea
 */
public class Empleado {
    
    public String nombre = "";
    public double salario;
    public Date fechaNacimiento;

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", salario=" + salario + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    public void saluda(){
        System.out.println(" hola soy empleado");
    }
 
}//fin clase
