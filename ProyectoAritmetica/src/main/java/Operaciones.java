
public class Operaciones {

    public static void main(String[] args) {
        //Aritmetica op = new Aritmetica();
        int operandoA =6;
        int operandoB =2;
        Aritmetica op = new Aritmetica(operandoA,operandoB);
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);
        System.out.println("");
        System.out.println("Suma: " + op.sumar());
        System.out.println("Resta: " + op.restar());
        System.out.println("Multiplicar: " + op.multiplicar());
        System.out.println("Division: " + op.dividir());
    }

}
