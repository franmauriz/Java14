package test;

import datos.*;

public class Interfaces {
    public static void main(String[] args) {
        AcessoDatos datos = new AccesoOracle();
        System.out.println("Oracle");
        datos.insertar();
        datos.listar();
        
        datos = new AccesoMySql();
        System.out.println("MySql");
        datos.insertar();
        datos.listar();
                
    }
}
