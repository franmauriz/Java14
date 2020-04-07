package calculadora;

import java.util.Scanner;
import operaciones.Operaciones;

public class Calculadora {
    public static void main(String[] args) {
        int operando1,operando2;
        Scanner scan= new Scanner(System.in);
        System.out.print("Introduce el primer operando: ");
        operando1 = scan.nextInt();
        System.out.println("");
        System.out.print("Introduce el segundo operando: ");
        operando2 = scan.nextInt();
        System.out.println("");
        System.out.print("Resultado de la suma: ");
        System.out.println(Operaciones.suma(operando1,operando2));
    }
}
