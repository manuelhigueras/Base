package modulo6.personal;

import java.util.logging.Logger;

/**
 *
 * @author begonaolea
 */
public class Director extends Gerente {

    public double vehiculoEmpresa;

    //constructores
    public Director(double vehiculoEmpresa, String nombre, double salario, String departamento) {
        super(nombre, salario, departamento);
        this.vehiculoEmpresa = vehiculoEmpresa;
    }

    public void aumentarComision() {
        System.out.println(".... aumento mi comisión");
    }

    @Override
    public String toString() {
        return super.toString()
                + " Vehículo empresa " + vehiculoEmpresa;
    }

    @Override
    public void saluda() {
        System.out.println("Buenos días soy el Director");
    }

}//fin clase
