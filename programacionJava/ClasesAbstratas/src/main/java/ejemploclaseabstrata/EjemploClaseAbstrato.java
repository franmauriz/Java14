package ejemploclaseabstrata;

import abstrato.mauriz.fran.Circulo;
import abstrato.mauriz.fran.FiguraGeometrica;
import abstrato.mauriz.fran.Rectangulo;
import abstrato.mauriz.fran.Triangulo;

public class EjemploClaseAbstrato {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Soy un circulo");
        Triangulo triangulo = new Triangulo("Soy un triangulo");
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        
        circulo.dibujar();
        triangulo.dibujar();
        rectangulo.dibujar();
        System.out.println("rectangulo = " + rectangulo);
    }
}
