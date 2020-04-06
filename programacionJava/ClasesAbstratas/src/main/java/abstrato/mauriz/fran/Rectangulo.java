package abstrato.mauriz.fran;

public class Rectangulo extends FiguraGeometrica {
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    public void dibujar(){
        System.out.println("Soy un rectangulo: " + this.getClass().getSimpleName());
    }
    
}
