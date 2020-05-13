package beans.helper;

import beans.model.Provincia;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;


@Named
@RequestScoped
public class ProvinciaHelper {
    
    public List<Provincia> getProvincia(){
        List<Provincia> provincias= new ArrayList<>();
        
        int provinciaId=1;
        Provincia provincia= new Provincia(provinciaId++,"Sevilla",410927);
        
        provincias.add(provincia);
        
        provincia= new Provincia(provinciaId++,"Coruña",110710);
        provincias.add(provincia);
        
        return provincias;
        
    }
    
    public int getProvinciaIdPorNombre(String nombreProvincia){
        int idProvincia = 0;
        List<Provincia> provincias = this.getProvincia();
        
        for(Provincia provincia : provincias){
            if(nombreProvincia.equals(provincia.getNombreProvincia())){
                idProvincia = provincia.getIdProvincia();
                break;
            }
        }
        return idProvincia;
    }
    
    public int getProvinciaIdPorCodigoPostal(int codigoPostal){
        int idprovincia=0;
        List<Provincia> provincias = this.getProvincia();
        
        for(Provincia provincia : provincias){
            if(codigoPostal == provincia.getCodigoPostal()){
                idprovincia= provincia.getIdProvincia();
                break;
            }
        }
        return idprovincia;
    }
    
    public List<SelectItem> getSelectItems(){
        List<SelectItem> selectItems = new ArrayList<>();
        List<Provincia> provincias = this.getProvincia();
        for(Provincia provincia: provincias){
            SelectItem selectItem = new SelectItem(provincia.getIdProvincia(),
            provincia.getNombreProvincia());
            selectItems.add(selectItem);
        }
        return selectItems;
    }
    
}
