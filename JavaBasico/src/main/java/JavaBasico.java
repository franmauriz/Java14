
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
        var resultado = "";
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
        if (resultado.equals("10")) {
            System.out.println("Has acertado el resultado es " + resultado);
        } else {
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

        int intVar = 5000;
        System.out.println("intVar = " + intVar);
        System.out.println("bits tipo int: " + Integer.SIZE);
        System.out.println("bytes tipo int:" + Integer.BYTES);
        System.out.println("valor minimo tipo int:" + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int:" + Integer.MAX_VALUE);

        long longVar = 9223372036854775807L;
        System.out.println("longVar = " + longVar);
        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long:" + Long.BYTES);
        System.out.println("valor minimo tipo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long:" + Long.MAX_VALUE);

        float floatVar = 100.0F;
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

        var numeroInt = 127234;
        System.out.println("numero = " + numeroInt);
        var numeroLong = 9223372036854775807L;
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
        if (booleanVar) {
            System.out.println("el valor es verdadero");
        } else {
            System.out.println("el valor es falso");
        }

        var edadVar = 18;
        var adulto = edadVar >= 18;
        System.out.println("adulto = " + adulto);

        /* CONVERSION DE TIPOS PRIMITIVOS */
        var edadConversion = Integer.parseInt("20");

        System.out.println("edadConversion = " + edadConversion);

        double valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);

        char c = "Hola".charAt(0); // chartAt nos devuelve el caracter segun la posicion indicada
        System.out.println("c = " + c);

        Scanner scannerDos = new Scanner(System.in);
        int edadScanner = Integer.parseInt(scannerDos.nextLine());
        System.out.println("edadScanner = " + edadScanner);

        char caracterScanner = scannerDos.nextLine().charAt(0);
        System.out.println("caracterScanner = " + caracterScanner);

        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);

        short s = 10;
        byte b = (byte) s;  //casting

        /* OPERADORES EN JAVA */
        int aa = 2, bb = 2;
        /* Suma */
        int resultados = aa + bb;
        System.out.println("resultados suma = " + resultados);
        System.out.println("resultados suma= " + (aa + bb));

        /* Resta */
        resultados = aa - bb;
        System.out.println("resultados resta= " + resultados);
        System.out.println("resultados resta= " + (aa - bb));

        /* multiplicacion */
        resultados = aa * bb;
        System.out.println("resultados multiplicacion = " + resultados);
        System.out.println("resultados multiplicacion= " + (aa * bb));

        /* division */
        var resultado2 = (float) aa / bb;
        System.out.println("resultados division= " + resultados);
        System.out.println("resultados division= " + (aa / bb));

        /* operador de modulo */
        resultados = aa % bb;
        System.out.println("resultados modulo= " + resultados);
        System.out.println("resultados modulo= " + (aa % bb));

        /* ¿Es par?*/
        resultados = aa % 2;
        if (resultados == 0) {
            System.out.println(aa + " es par");
        } else {
            System.out.println(aa + " no es par");
        }

        /* OPERADORES ASIGNACION */
        int f = 3, m = 2;
        int p = f;
        System.out.println("p = " + p);

        f += 1; // a = a +1;
        System.out.println("f = " + f);

        f += 10;
        System.out.println("f = " + f);

        f -= 2;
        System.out.println("f = " + f);

        // *= , /= , %=
        /* OPERADORES UNARIOS*/
        int o = 3;
        int i = -o;
        System.out.println("i = " + i);

        boolean d = true;
        boolean g = !d;
        System.out.println("g = " + g);

        int y = 3;
        int u = ++y;
        System.out.println("y = " + y);
        System.out.println("u = " + u);

        int j = 5;
        int w = j++;
        System.out.println("j = " + j);
        System.out.println("w = " + w);
        //decremento
        //predecremento
        /*  int j =2;   1
            int h = --j; 1
         */
        //postdecremento
        /*  int j =2; 1
            int h = j--; 2
         */

 /* OPERADORES DE IGUALDAD y CONDICIONALES*/
        int valorMinimo = 13, valorMaximo = 24;
        int dd = 20;

        boolean hj = 4 == 5;
        System.out.println("hj = " + hj);

        String cadena1 = "hola";
        String cadena2 = "adios";
        System.out.println(cadena1.equals(cadena2));

        boolean res = dd >= valorMinimo && dd <= valorMaximo; // && las dos espresiones tienen que ser verdaderas
        System.out.println("res = " + res);

        boolean vacaciones = false;
        boolean descanso = false;
        if (vacaciones || descanso) { // si cualquiera de los dos es verdadero se cumple la condicion
            System.out.println("El padre puede estar con la familia");
        } else {
            System.out.println("El padre esta ocupado");
        }

        /* OPERADOR TERNARIO */
        boolean mayor = (dd > valorMaximo) ? true : false;
        System.out.println("mayor = " + mayor);

        /* PRECEDENCIA OPERADORES*/
        var rr = 4 + 5 * 6 / 2; // orden: 1º (5*6) 2º (5*6)/2 3º 4+((5*6)/2) =>
        System.out.println("rr = " + rr); // orden: 1º 30 2º 15 3º 19
        var condicion = true;
        if (condicion) {
            System.out.println("verdadero");
        } else {
            System.out.println("falso");
        }

        var numeros = 1;

        if (numeros == 1) {
            System.out.println("numero uno");
        } else if (numeros == 2) {
            System.out.println("numero dos");
        } else if (numeros == 3) {
        } else {
            System.out.println("valor desconocido");
        }
        var textoNumero = "";

        switch (numeros) {   // byte,short,int,char,String
            case 1:
                textoNumero = "numero uno";
                break;
            case 2:
                textoNumero = "numero dos";
                break;
            default:
                textoNumero = "numero desconocido";

        }
        System.out.println("textoNumero = " + textoNumero);
        
        /* ITERACIONES */
        int contadorCiclo=0;
        
        while(contadorCiclo <10){
            System.out.println("contadorCiclo = " + contadorCiclo);
            contadorCiclo++;
        }
        contadorCiclo=0;
        while(contadorCiclo <10){
            if(contadorCiclo % 2 == 0){
                System.out.println("contadorCiclo = " + contadorCiclo);
            }
            contadorCiclo++;
        }
        contadorCiclo=0;
        while(contadorCiclo<10){
            if(contadorCiclo % 2 != 0){
                continue;
            }
            System.out.println("contadorCiclo = " + contadorCiclo);
            contadorCiclo++;
        }
        contadorCiclo=0;
        while(contadorCiclo <10){
            if(contadorCiclo % 2 == 0){
                System.out.println("contadorCiclo = " + contadorCiclo);
                break;
            }
            contadorCiclo++;
        }
        contadorCiclo=0;
        do{
            System.out.println("contadorCiclo = " + contadorCiclo);
            contadorCiclo++;
        }while(contadorCiclo<10);
        
        for(contadorCiclo=0;contadorCiclo<10;contadorCiclo++){
            System.out.println("contadorCiclo = " + contadorCiclo);
        }
        
    }
}
