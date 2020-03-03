
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
        
        /* TIPOS PRIMITIVOS 
        /* byte,short,int,log
        */
        byte byteVar = 15; // son valores de 8bits
        System.out.println("byteVar = " + byteVar);
        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipo byte:" + Byte.BYTES);
        System.out.println("valor minimo tipo byte:" + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo byte:" + Byte.MAX_VALUE);
        
        short shortVar = 1000;        
        System.out.println("shortVar = " + shortVar);
        System.out.println("bits tipo short: " + Short.SIZE);
        System.out.println("bytes tipo short:" + Short.BYTES);
        System.out.println("valor minimo tipo short:" + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short:" + Short.MAX_VALUE);
        
        int intVar =5000;
        System.out.println("intVar = " + intVar);
        System.out.println("bits tipo int: " + Integer.SIZE);
        System.out.println("bytes tipo int:" + Integer.BYTES);
        System.out.println("valor minimo tipo int:" + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int:" + Integer.MAX_VALUE);
        
        long longVar =9223372036854775807L;
        System.out.println("longVar = " + longVar);
        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long:" + Long.BYTES);
        System.out.println("valor minimo tipo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long:" + Long.MAX_VALUE);
        
        float floatVar=100.0F;
        System.out.println("floatVar = " + floatVar);
        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float:" + Float.BYTES);
        System.out.println("valor minimo tipo float:" + Float.MIN_VALUE);
        System.out.println("valor maximo tipo float:" + Float.MAX_VALUE);
        
        double doubleVar = 300.0D;
        System.out.println("doubleVar = " + doubleVar);
        System.out.println("bits tipo doudle: " + Double.SIZE);
        System.out.println("bytes tipo double:" + Double.BYTES);
        System.out.println("valor minimo tipo double:" + Double.MIN_VALUE);
        System.out.println("valor maximo tipo double:" + Double.MAX_VALUE);
        
        System.out.println("bits tipo char: " + Character.SIZE);
        System.out.println("bytes tipo char:" + Character.BYTES);
        System.out.println("valor minimo tipo char:" + Character.MIN_VALUE);
        System.out.println("valor maximo tipo char:" + Character.MAX_VALUE);
        
        char varChar = 'a';
        System.out.println("varChar = " + varChar);
        
        char varCharExclamacion = '\u0021'; // tambien e puede usar var
        System.out.println("varCharExclamacion = " + varCharExclamacion);
        
        char varCharExclamacionDecimal = 33; // no se puede usar var por que se convertiria en decimal
        System.out.println("varCharExclamacionDecimal = " + varCharExclamacionDecimal);
        
        char varCharExclamacionSimbolo = '!'; // se puede usar var
        System.out.println("varCharExclamacionSimbolo = " + varCharExclamacionSimbolo);
        
        
        var numeroInt =127234;
        System.out.println("numero = " + numeroInt);
        var numeroLong=9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        
        /*Numero en otras bases numericas */
        
        int numeroDecimal = 10; // tambien se puede definir con la palabra var
        System.out.println("numeroDecimal = " + numeroDecimal);
        
        int numeroOctal = 012; // tambien se puede definir con la palabra var
        System.out.println("numeroOctal = " + numeroOctal);
        
        int numeroBinario = 0b1010; // tambien se puede definir con la palabra var
        System.out.println("numeroBinario = " + numeroBinario);
        
        int numeroHexadecimal = 0xA; // tambien se puede definir con la palabra var
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
        
        /* TIPO PRIMITIVO BOOLEAN*/
        System.out.println("true tipo boolean " + Boolean.TRUE);
        System.out.println("false tipo boolean " + Boolean.FALSE);
        
        boolean booleanVar = true;
        if(booleanVar){
            System.out.println("el valor es verdadero");
        }else{
            System.out.println("el valor es falso");
        }
        
        var edadVar = 18;
        var adulto = edadVar >=18;
        System.out.println("adulto = " + adulto);
    }
}
