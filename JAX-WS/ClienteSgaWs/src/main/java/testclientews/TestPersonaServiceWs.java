package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceSw;
import java.util.List;

public class TestPersonaServiceWs {
    public static void main(String[] args) {
        PersonaServiceSw personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        
        System.out.println("Ejecutando servicio listar personas ws");
        
        List<Persona> personas = personaService.listarPersonas();
        
        for(Persona p: personas){
            System.out.println("ID: " + p.getIdPersona() + ", Nombre: " + p.getNombre() + ", Apellido: "
            + p.getApellido() + ", Email: " + p.getEmail() + ", Telefono: " + p.getTelefono());
        }
        
        System.out.println("Fin servicio listar personas ws");
    }
}
