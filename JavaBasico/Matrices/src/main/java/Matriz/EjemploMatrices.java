package Matriz;

public class EjemploMatrices {
    public static void main(String[] args) {
        int [][] edades;
        Persona [][] personas;
        
        edades= new int[2][2];
        personas = new Persona[2][2];
        
        edades[0][0]=1;
        edades[0][1]=2;
        edades[1][0]=3;
        edades[1][1]=4;
        
        System.out.println("edades = " + edades[0][0]);
        System.out.println("edades = " + edades[0][1]);
        System.out.println("edades = " + edades[1][0]);
        System.out.println("edades = " + edades[1][1]);
        
        personas[0][0]=new Persona("Fran");
        personas[0][1]=new Persona("Esther");
        personas[1][0]=new Persona("Dani");
        personas[1][1]=new Persona("Roberto");
        
        System.out.println("persona = " + personas[0][0].getNombre());
        System.out.println("persona = " + personas[0][1].getNombre());
        System.out.println("persona = " + personas[1][0].getNombre());
        System.out.println("persona = " + personas[1][1].getNombre());
        
//        for(int columna=0;colunma< personas){
//            
//        }
    }
    
}
