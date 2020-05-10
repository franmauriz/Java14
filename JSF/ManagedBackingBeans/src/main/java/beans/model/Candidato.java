package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

// CDI
@Named
@RequestScoped //alcance
public class Candidato {
    String nombre ="introduce tu nombre";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
