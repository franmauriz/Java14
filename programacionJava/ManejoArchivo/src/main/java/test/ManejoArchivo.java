package test;

import acciones.Archivo;
import java.util.Scanner;

public class ManejoArchivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String contenido;
        
        String nombreArchivo = "/home/ptl28sev000/Documentos/gitlab/java13/programacionJava/ManejoArchivo/archivos/archivojava.txt";
        //Archivo.crearArchivo(nombreArchivo);
        
        //System.out.println("Escribe contenido en el archivo:");
        //contenido = scan.nextLine();
        //Archivo.escribirArchivo(nombreArchivo, contenido);        
        Archivo.leerArchivo(nombreArchivo);
        System.out.println("");
        Archivo.anexarArchivo(nombreArchivo);
        Archivo.leerArchivo(nombreArchivo);
        
    }
}
