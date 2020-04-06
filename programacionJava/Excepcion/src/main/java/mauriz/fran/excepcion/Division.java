package mauriz.fran.excepcion;

public class Division {
    private int denominador;
    private int numerador;
    
    public Division(int denominador,int numerador) throws MyExcepcion{
        if(numerador==0){
            throw new MyExcepcion("Numerador igual a cero");
        }
        
        this.numerador=numerador;
        this.denominador=denominador;
    }
    
    public void resultado(){
        System.out.println("El resultado de la division es: "+  this.denominador/this.numerador);
    }
}
