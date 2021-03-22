/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo6.personal;

import java.util.Date;

public class Ingeniero extends Empleado{

    public Ingeniero(String nombre) {
        super(nombre);
    }

    public Ingeniero(String nombre, double salario, Date fechaNacimiento) {
        super(nombre, salario, fechaNacimiento);
    }

    public Ingeniero(String nombre, double salario) {
        super(nombre, salario);
    }

    public Ingeniero(String nombre, Date FdeNac) {
        super(nombre, FdeNac);
    }

    public Ingeniero() {
        super(null);
    }
    
    
    
}
