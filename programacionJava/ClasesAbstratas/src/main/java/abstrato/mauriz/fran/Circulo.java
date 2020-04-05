package abstrato.mauriz.fran;

public class Circulo extends FiguraGeometrica {
      
    public Circulo(String tipoFigura){
        super(tipoFigura);
    }
    
   
    @Override
    public void dibujar(){
        System.out.println("Soy un circulo : " + this.getClass().getSimpleName());
    }
}
