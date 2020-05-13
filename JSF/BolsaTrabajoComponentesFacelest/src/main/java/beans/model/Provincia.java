package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class Provincia {
    private int idProvincia;
    private String nombreProvincia;
    private int codigoPostal;
    
    public Provincia(int idProvincia,String nombreProvincia,int codigoPostal){
        this.idProvincia=idProvincia;
        this.nombreProvincia=nombreProvincia;
        this.codigoPostal= codigoPostal;
    }
    
    public Provincia(){
        
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    
}
