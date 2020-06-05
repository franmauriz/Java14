package test;

import domain.Persona;
import java.util.List;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

public class TestPersonaServiceRS {
    private static final String URL_BASE="http://localhost:8080/SGA-JEE-WEB/webservice/";
    private static Client cliente;
    private static WebTarget webTarget;
    private static Persona persona;
    private static List<Persona> personas;
    private static Invocation.Builder invocationBuilder;
    private static Response response;
    
    public static void main(String[] args) {
        cliente = ClientBuilder.newClient();
        
        // leer una persona GET
        webTarget = cliente.target(URL_BASE).path("/personas");
        
        //Proporcionamos in id de persona
        persona = webTarget.path("/1").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona recuperada: " + persona);
        
        //leer todas las personas
        personas = webTarget.request(MediaType.APPLICATION_XML).get(Response.class).readEntity(new GenericType<List<Persona>>(){});
        imprimirpersonas(personas);
        
        //agregar una persona POST
        
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Carlos");
        nuevaPersona.setApellido("Mauriz");
        nuevaPersona.setEmail("carlos3@mail.com");
        nuevaPersona.setTelefono("123456789");
        
        invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
        response = invocationBuilder.post(Entity.entity(nuevaPersona, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println(response.getStatus());
        //Recuperamos a la persona agragada
        Persona personaRecuperada = response.readEntity(Persona.class);
        System.out.println("personaRecuperada = " + personaRecuperada);
        
        //modificar persona agregada PUT
        Persona personaModificada = personaRecuperada;
        personaModificada.setApellido("Pereira");
        String pathId = "/" + personaModificada.getIdPersona();
        invocationBuilder = webTarget.path(pathId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.put(Entity.entity(personaModificada, MediaType.APPLICATION_XML));
        
        System.out.println("");
        System.out.println(response.getStatus());
        
        System.out.println("Persona modificada:" + response.readEntity(Persona.class));
        
        //eliminar una persona DELETE
        Persona personaEliminar = personaRecuperada;
        String pathEliminar = "/" + personaEliminar.getIdPersona();
        invocationBuilder = webTarget.path(pathEliminar).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.delete();
        
        System.out.println("");
        System.out.println(response.getStatus());
        System.out.println("Persona eliminada:" + personaEliminar);
        
        //leer todas las personas
        personas = webTarget.request(MediaType.APPLICATION_XML).get(Response.class).readEntity(new GenericType<List<Persona>>(){});
        imprimirpersonas(personas);
        
        
    }

    private static void imprimirpersonas(List<Persona> personas) {
        for(Persona p : personas){
            System.out.println("Persona:" + p);
        }
    }
}
