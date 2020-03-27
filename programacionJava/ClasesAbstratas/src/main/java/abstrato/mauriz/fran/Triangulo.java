package abstrato.mauriz.fran;

public class Triangulo extends FiguraGeometrica {
    
    public Triangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Soy un triangulo: " + this.getClass().getSimpleName());
    }
}
