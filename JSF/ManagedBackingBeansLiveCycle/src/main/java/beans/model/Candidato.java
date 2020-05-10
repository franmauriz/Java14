package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// CDI
@Named
@RequestScoped //alcance
public class Candidato {
    String nombre ="introduce tu nombre";
    Logger log= LogManager.getRootLogger();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        log.info("Modificando el nombre del candidato: " + this.nombre);
    }
    
    
}
