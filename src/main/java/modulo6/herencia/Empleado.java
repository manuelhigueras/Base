package modulo6.herencia;

public class Empleado {
    
    protected String nombre;

    public Empleado(String nombre){
      //  super();
        this.nombre = nombre;
    }  
}

class Gerente extends Empleado{
 
    public Gerente(String nombre) {
        super(nombre);
    }
 

 
}


