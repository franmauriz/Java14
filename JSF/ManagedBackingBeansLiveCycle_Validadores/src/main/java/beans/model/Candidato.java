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
    String apellido;
    String sueldo;
    
    Logger log= LogManager.getRootLogger();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        log.info("Modificando el nombre del candidato: " + this.nombre);
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        log.info("Modificamos el apellido: " + this.apellido);
    }

    public String getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
        log.info("Modificamos el sueldo: " + this.sueldo);
    }
    
    
    
    
}
