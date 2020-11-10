package modulo6.personal;

public class Pruebas {

    //psvm
    public static void main(String[] args) {
        Empleado e = new Empleado();
        System.out.println(e.toString());

        Ingeniero i = new Ingeniero();
        System.out.println(i.toString());

        Gerente g = new Gerente();
        g.departamento = "Marketing";
        g.salario = 3000.0;
        System.out.println(g.toString());

        Director d = new Director();
        d.vehiculoEmpresa = 5078.9;
        System.out.println(d.toString());
 
        g.saluda();
        d.saluda();
 
        Empleado luis = new Gerente();
        luis = new Director();
        luis = new Empleado();
        
        
        //Director es un Object ? SI
        Object o = new Director();
        
        // Gerente es un EMpleado? SI
        Empleado carlos = new Gerente();
        
        //UN Empleado es un Gerente ?  NO siempre
     //    Gerente gerente33 = new Empleado(); 
        
     
         Empleado  e67 = new Director(); // bd.getEmpleadoId(3);
        //  e67.aumentarComision(); // no esta declarado en Empleado
  
        felicitacionNavidad(e67);
        felicitacionNavidad(luis);
        felicitacionNavidad(g);

    }//fin main
    
    
    public static void felicitacionNavidad(Empleado e){
        System.out.println(" Felicitacion");
        e.saluda();
    }//fin metod

}
