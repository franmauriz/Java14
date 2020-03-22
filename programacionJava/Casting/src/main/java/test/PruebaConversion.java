package test;

import conversionobjetos.Empleado;
import conversionobjetos.Escritor;
import conversionobjetos.TipoEscritura;

public class PruebaConversion {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("juan",5000,TipoEscritura.CLASICO);
        System.out.println(empleado.obtenerDetalle());
        Escritor escritor = (Escritor) empleado;
        System.out.println("");
        System.out.println(escritor.getTipoEscrituraEnTexto());
        
        System.out.println(((Escritor) empleado).getTipoEscrituraEnTexto());
    }
}
