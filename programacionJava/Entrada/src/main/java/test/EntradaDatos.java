package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EntradaDatos {
    public static void main(String[] args) {
        String captura;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader btrInput = new BufferedReader(input);
        
        try {
            System.out.print("Escribe un dato: ");
            captura = btrInput.readLine();
            System.out.println("Dato introducido= " + captura);
        } catch (IOException ex) {
            Logger.getLogger(EntradaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
