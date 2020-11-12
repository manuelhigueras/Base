
package modulo6.equals.practica;

import java.util.Scanner;

public class Buscador {
    
    public static void main(String[] args) {
        
        String[] nombres = {"Laura","Carlos","Alfonso","Ramiro","veronica"};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String nombre =  sc.next();
        
        int posicion = -1;
        for(int i = 0; i < nombres.length ;i ++){
            if( nombres[i].equals(nombre)){
                posicion = i;
                break;
            }
        }
        if(posicion > -1){
            System.out.println("Encontrado en la posicion " + posicion);
        }else{
            System.out.println("No encontrado");
        }
        
        
        
        
        
    }//fin main
    
}
