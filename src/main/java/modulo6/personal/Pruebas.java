package modulo6.personal;

import java.util.Date;

public class Pruebas {

    //psvm
    public static void main(String[] args) {
        Date fn  = new Date();
        
        Empleado e = new Empleado("Luis Ramos");
        System.out.println(e.toString());

        Ingeniero i = new Ingeniero("Carlos", 20_000, fn);
        System.out.println(i.toString());

        Gerente g = new Gerente("Ramón","Marketing");
       // g.departamento = "Marketing";
        g.salario = 3000.0;
        System.out.println(g.toString());

        Director d = new Director(20_000.0, "Roberto",40_000, "Direccion" );
        //d.vehiculoEmpresa = 5078.9;
        System.out.println(d.toString());
 
        g.saluda();
        d.saluda();
 
        Empleado luis = new Gerente("Rosario Bilbao", "Ventas");
        luis = new Director(18_000.0, "Teresa",45_000, "I+D" );
        luis = new Empleado("Raul");
        
        
        //Director es un Object ? SI
        Object o = new Director(18_000.0, "Teresa",45_000, "I+D" );
        
        // Gerente es un EMpleado? SI
        Empleado carlos = new Gerente("Carlos","Ingenieria");
        
        //UN Empleado es un Gerente ?  NO siempre
     //    Gerente gerente33 = new Empleado(); 
        
     
         Empleado  e67 = luis; // bd.getEmpleadoId(3);
        //  e67.aumentarComision(); // no esta declarado en Empleado
  
        felicitacionNavidad(e67);
        felicitacionNavidad(luis);
        felicitacionNavidad(g);
        felicitacionNavidad(new Ingeniero("Laura"));

    }//fin main
    
    
    public static void felicitacionNavidad(Empleado e){
        System.out.println(" Felicitacion");
        e.saluda();
        if ( e instanceof Ingeniero){
            System.out.println("... Tómatelo con más calma este nuevo año");
        }
        
    }//fin metod

}
