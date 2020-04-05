
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ManejoColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        //repetido
        miLista.add(3);
        
        //imprimir(miLista);
        
        Set miLista2= new HashSet();
        miLista2.add(1);
        miLista2.add(2);
        miLista2.add(3);
        miLista2.add(3);
        //imprimir(miLista2);
        
        Map miLista3 = new HashMap();
        miLista3.put("valor1", "juan");
        miLista3.put("valor2", "fran");
        miLista3.put("valor3", "esther");
        miLista3.put("valor3", "esther");
        imprimir(miLista3.keySet());
        imprimir(miLista3.values());
    }
    
    
    private static void imprimir(Collection lista){
        for(Object item:lista){
            System.out.println("Elemento: " + item);
        }
    }
}
