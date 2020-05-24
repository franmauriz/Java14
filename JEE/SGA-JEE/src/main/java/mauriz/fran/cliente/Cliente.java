package mauriz.fran.cliente;

import java.util.List;
import javax.naming.*;
import mauriz.fran.dominio.Persona;
import mauriz.fran.servicio.PersonaServiceRemote;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Iniciando Llamada al EJB desde el Cliente\n");
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/SGA-JEE-1.0/PersonaServiceImpl");
            List<Persona> personas = personaService.listarPersonas();
            for(Persona persona: personas){
                System.out.println(persona);
            }
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
