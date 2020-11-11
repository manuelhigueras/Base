
package modulo6.personal;

public class PruebaConversion {
      
    public static void main(String[] args) {
        // 1. crear un Ingeniero
        Ingeniero i = new Ingeniero();
        // 2. crear un Gerente
        Gerente g = new Gerente();
        g.departamento = "Comercial";
        // llamar al método iniciarJornada para
        // 3. Ingeniero 
        // 4. Gerente
        iniciarJornada(i);
        iniciarJornada(g);
        
    }//main
    
    public static void iniciarJornada(Empleado e){
        // 1  saluda
        e.saluda();
        // 2  si es gerente  organizaDepartamento
        if(e instanceof Gerente){
            //java.lang.ClassCastException:
            Gerente g = (Gerente) e;
            g.organizarDepartamento();
        }
    }
    
    
}//fin clase
