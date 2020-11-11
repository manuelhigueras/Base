package modulo6.personal;

import java.util.Date;

/**
 * Clase que modela un empleado
 * @author begonaolea
 */
public class Empleado {
    //variables de clases  ( por clase)
    public static final double SALARIO_BASE = 15_000.0;
    //variable de instancia (por cada objeto)
    protected String nombre;
    protected double salario;
    protected Date fechaNacimiento;
    
    
    //CONSTRUCTORES
    public Empleado(String nombre, double salario, Date fechaNacimiento) {
        System.out.println(".... constructor 1");
        this.nombre = nombre.toUpperCase();
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Empleado(String nombre, double salario) {
        this(nombre, salario, null); //llama al contructor anterior
        System.out.println(".... constructor 2");
    }
 

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", salario=" + salario + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    public void saluda(){
        System.out.println(" hola soy empleado");
    }
    
    public void saluda(String msg ){
        System.out.println(msg  + " empleado");
    }
 
}//fin clase
