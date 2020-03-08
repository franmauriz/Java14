public class Aritmetica {
    
    int a;
    int b;
    
    public Aritmetica(){
        System.out.println("Ejecutanto constructor vacio");
    }
    
    public Aritmetica(int a, int b){
        this.a=a;
        this.b=b;
    }
       
    public int sumar(){
        return this.a + this.b;
    }
    
    public int restar(){
        return this.a - this.b;
    }
    
    public int multiplicar(){
        return this.a * this.b;
    }
    
    public int dividir(){
        return this.a / this.b;
    }
}
