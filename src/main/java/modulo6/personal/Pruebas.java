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

    }

}
