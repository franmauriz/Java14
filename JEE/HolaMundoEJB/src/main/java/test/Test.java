package test;

import beans.HolaMundoEJBRemote;
import javax.naming.*;

public class Test {
    public static void main(String[] args) {
        try{
            Context jndi =new InitialContext();
            HolaMundoEJBRemote holaMundoEjb = (HolaMundoEJBRemote) jndi.lookup("java:global/HolaMundoEJB-1.0/HolaMundoEJBImple");
            int resultado = holaMundoEjb.sumar(3, 10);
            System.out.println("resultado = " + resultado);
        }
        catch(NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
