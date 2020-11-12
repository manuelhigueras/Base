package modulo6.equals;

import java.util.Scanner;

public class PruebaEqualsFiguras {

    public static void main(String[] args) {

        Figura[] cuadrado = new Figura[4];
        int posicion = 0;

        Scanner sc = new Scanner(System.in);

        while (posicion < 4) {
            System.out.println("Introduce x: ");
            int x = sc.nextInt();
             System.out.println("Introduce y: ");
            int y = sc.nextInt();
             System.out.println("Introduce color: ");
            String color = sc.next();

            Figura f1 = new Figura(x, y, color);
            boolean encontrado = false;
            for (int i = 0; i < cuadrado.length; i++) {
                if (f1.equals(cuadrado[i])) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                cuadrado[posicion] = f1;
                posicion++;
            }  
        }//fin while
        
        for(Figura f : cuadrado){
            System.out.println(f);
        }
        
        
    }//fin main
}
