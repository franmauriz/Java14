package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {
        PersonaJDBC personaJDBC = new PersonaJDBC();
        List<Persona> personas = personaJDBC.select();

//        Persona persona1 = new Persona();
//        persona1.setNombre("Daniel");
//        persona1.setApellido("mauriz");
//        persona1.setEmail("daniel@server.com");
//        persona1.setTelefono("123678");
//        
//        personaJDBC.insert(persona1);
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            System.out.println("Email: " + persona.getEmail());
            System.out.println("Telefono: " + persona.getTelefono());
            System.out.println("");
        }

//        Persona persona = new Persona();
//        persona.setNombre("Roberto");
//        persona.setApellido("mauriz");
//        persona.setEmail("roberto@server.com");
//        persona.setTelefono("345234");
//        persona.setId_persona(1);
//        
//        personaJDBC.update(persona);
        
        Persona persona = new Persona();
        persona.setId_persona(2);
        personaJDBC.delete(persona);
        
    }

}
