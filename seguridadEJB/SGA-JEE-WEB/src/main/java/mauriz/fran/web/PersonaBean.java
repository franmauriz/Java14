package mauriz.fran.web;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import mauriz.fran.dominio.Persona;
import mauriz.fran.servicio.PersonaService;
import org.primefaces.event.RowEditEvent;


@Named("personaBean")
@RequestScoped
public class PersonaBean {
    @Inject
    private PersonaService personaService;
    
    private Persona personaSeleccionada;
    
    List<Persona> personas;
    
    public PersonaBean(){
        
    }
    
    @PostConstruct
    public void inicializar(){
        this.personas=personaService.listarPersonas();
        this.personaSeleccionada= new Persona();
    }
    
    public void editListener(RowEditEvent event){
        Persona persona = (Persona) event.getObject();
        personaService.modificarPersona(persona);
    }

    public Persona getPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    public void agregarPersona(){
        this.personaService.registrarPersona(this.personaSeleccionada);
        this.personas.add(this.personaSeleccionada);
        this.personaSeleccionada = null;
    }
    
    public void eliminarPersona(){
        this.personaService.eliminarPersona(this.personaSeleccionada);
        this.personas.remove(this.personaSeleccionada);
        this.personaSeleccionada = null;
    }
    
    public void reiniciarPersonaSeleccionada(){
        this.personaSeleccionada = new Persona();
    }

   
    
    
}
