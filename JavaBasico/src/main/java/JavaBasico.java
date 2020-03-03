
import java.util.Scanner;

public class JavaBasico {

    public static void main(String args[]) {
        /* VARIABLES
        /* Apartir de Java 10 se puede usar el tipo var al definir la variables
        /* pero es obligatorio indicar el valor,sino, java no sabe de que tipo
        /* es la variable.*/
        var nombre = "Fran";
        var apellidos = "Mauriz";
        var edad = "18";
        var resultado="";
        /*Escribir en consola*/
        System.out.println("Hola Mundo desde Java");

        /*Caracteres Especiales*/
        System.out.println("Espacio: " + ".");
        System.out.println("Comillas simples: \'Fran\'");
        System.out.println("Comillas dobles: \"Fran\"");
        System.out.println("Tabulador: aqui hay un \t tabulador.");
        System.out.println("Retorno de carro: aqui hay un \rretorno de carro.");
        System.out.println("Salto de linea: aqui hay un \nsalto de linea. ");
        System.out.println("Salto hacia atras: aqui hay un salto\b hacia atras.");

        /*Concatenación*/
        System.out.println("Hola, mi nombre es " + nombre + " " + apellidos + "\ny tengo " + edad + " años.");

        /*Pedir datos al usuario por consola, para eso importamos la clase Scanner*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el resultado de la operacion:");
        System.out.print("4 + 6 = ");
        resultado = scanner.nextLine();
        if(resultado.equals("10")){
            System.out.println("Has acertado el resultado es " + resultado);
        }else{
            System.out.println("Has Fallado");
        }

    }
}
