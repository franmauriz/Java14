package datos;

public class AccesoMySql implements AcessoDatos {
    @Override
    public void insertar(){
        System.out.println("Insertar desde MySql");
    }
    
    @Override
    public void listar(){
        System.out.println("Listar desde MySql");
    }
}
