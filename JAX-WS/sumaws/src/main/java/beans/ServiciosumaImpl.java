package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface="beans.ServiciosumarWs")
public class ServiciosumaImpl implements ServiciosumarWs{

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
    
    
}
