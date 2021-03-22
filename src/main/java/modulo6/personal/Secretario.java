/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo6.personal;

import java.util.Date;

public class Secretario extends Empleado{

    public Secretario(String nombre, double salario, Date fechaNacimiento) {
        super(nombre, salario, fechaNacimiento);
    }

    public Secretario(String nombre, double salario) {
        super(nombre, salario);
    }

    public Secretario(String nombre) {
        super(nombre);
    }
    
    
    
}
