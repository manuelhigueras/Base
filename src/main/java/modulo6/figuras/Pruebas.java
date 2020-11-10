
package modulo6.figuras;


public class Pruebas {
    public static void main(String[] args) {
        
        Figura f = new Figura();
        f.x = 4;
        f.y = 5;
        f.dibujar();
        System.out.println("Area de f es " + f.calcularArea());
        
        Circulo c = new Circulo();
        c.x = 6;
        c.y = 1;
        c.radio = 5;
        c.dibujar();
        System.out.println("Area de c es " + c.calcularArea());
        
        Cuadrado ca = new Cuadrado();
        ca.lado = 5;
        ca.x = 4;
        ca.y = 37;
        
        Rectangulo r = new Rectangulo();
        r.x = 5;
        r.y = 14;
        r.alto = 5;
        r.ancho = 10;
        
        Figura[] figuras = new Figura[4];
        figuras[0] = f;
        figuras[1] = c;
        figuras[2] = ca;
        figuras[3] = r;
        
        for(Figura fig: figuras){
            fig.dibujar();
        }
         
        
    }
}
