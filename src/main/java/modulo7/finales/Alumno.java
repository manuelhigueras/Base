
package modulo7.finales;


public class Alumno {
    
    public double calcularNota(){
        return 10;
    }
    public final void  matricular(){
        System.out.println(" me matriculo");
    } 
}

class AntiguosAlumnos extends Alumno{

    @Override
    public double calcularNota() {
        return super.calcularNota(); 
    }
    
}

