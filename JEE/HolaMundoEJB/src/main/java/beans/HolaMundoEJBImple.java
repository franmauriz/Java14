package beans;

import javax.ejb.Stateless;

@Stateless
public class HolaMundoEJBImple implements HolaMundoEJBRemote{

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
    
}
