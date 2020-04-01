/*
 * Ejemplo de clase de funciones con paso de argumentos variables
 */
package test;

/**
 *
 * @author absol
 * @version 1
 */
public class EjemploArgumentosVariables {

    public static void main(String[] args) {
        /**
         * Ejemplo de funcion donde se le pasa un numero de argumentos variables
         */

        imprimirNumeros(1, 2, 3, 4, 5, 6, 7, 8, 9);
        imprimirNumeros(1, 2, 3, 4);
        imprimirVariosArgumentos("fran",true,10,11,12,13,14);
    }
    
    private static void imprimirVariosArgumentos(String nombre, boolean logica, int... numeros){
        System.out.println("nombre = " + nombre);
        System.out.println("logica = " + logica);
        for(int numero : numeros){
            System.out.println("numero = " + numero);
        }
        
    }
    
    private static void imprimirNumeros(int... numeros) {
        for(int numero : numeros){
            System.out.println("numero = " + numero); 
        }
    }
    
}
