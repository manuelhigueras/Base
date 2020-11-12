
package modulo6.equals;

import java.util.Objects;

/**
 *
 * @author begonaolea
 */
public class Alumno{
    
    private int dni;
    private String nombre;
    private String apellido;

    public Alumno(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }

    
 
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        Alumno a = new Alumno(1,"Luis","Ramos");
        Alumno b = new Alumno(23,"Luis", "Ramos");
        
        if(a.equals(b) ){
            System.out.println("son iguales");
        }else{
            System.out.println(" son difernets");
        }
    }
    
}
