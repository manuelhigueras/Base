/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo7.interfaces;

public class Pruebas {
    public static void main(String[] args) {
        
        Volable v = new Pajaro();
        v.aterrizar();
        if(v instanceof Pajaro){
           // ( (Pajaro)v).canta();
           Pajaro p = (Pajaro)v;
           p.canta();
        }
       
       int altura =  Volable.ALTURA_MAX_VUELO;
        
        
    }
}
