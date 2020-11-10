
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
        ca.dibujar();
        System.out.println("Area de cuadrado es " + ca.calcularArea());
        
        Rectangulo r = new Rectangulo();
        r.x = 5;
        r.y = 14;
        r.alto = 5;
        r.ancho = 10;
        
        
        //Polimofismo
        Figura cuadrado = new Cuadrado();
        cuadrado.x = 5;
        cuadrado.y = 5;
        
        
        // CREAR UN ARRAY DE FIGURAS DONDE
        // pongo los elementos a digujar en el cuadro
        Figura[] figuras = new Figura[4];
        figuras[0] = f;
        figuras[1] = c;
        figuras[2] = ca;
        figuras[3] = r;
    
        dibujarCuadro(figuras);
        
    }//fin main
    
    public static void dibujarCuadro(Figura[] figurasADibujar){
        for(Figura f: figurasADibujar){
            f.dibujar();
        }//fin for
    }  
}
