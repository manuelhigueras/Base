package modulo6.personal;

public class Pruebas {

    //psvm
    public static void main(String[] args) {
        Empleado e = new Empleado();
        System.out.println(e.toString());

        Ingeniero i = new Ingeniero();
        System.out.println(i.toString());

        Gerente g = new Gerente();
        System.out.println(g.toString());

        Director d = new Director();
        System.out.println(d.toString());

    }

}
