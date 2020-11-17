
package modulo8.propagar;

public class CalcularNomina {
    
    public void generaNomina(int salarioBaseAnual, int meses) throws CalculadoraException {
        
        Calculadora c = new Calculadora();
        double salario = c.dividir(salarioBaseAnual, meses);
        salario = c.redondeoPositivos(salario);
        System.out.println("... Nomina mensual es  de " + salario );
    }
    
}
