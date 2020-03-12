package arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {
        int [] edades;
        Persona [] personas;
    
        edades = new int[5];
        personas = new Persona[4];
        String colores[]={"Azul","Rojo","verde"};
        
        edades[0]=1;
        edades[1]=2;
        edades[2]=3;
        edades[3]=4;
        edades[4]=5;
        
        System.out.println("edades = " + edades[0]);
        System.out.println("edades = " + edades[1]);
        System.out.println("edades = " + edades[2]);
        System.out.println("edades = " + edades[3]);
        System.out.println("edades = " + edades[4]);
        
        personas[0]=new Persona("Fran");
        personas[1]=new Persona("Esther");
        personas[2]=new Persona("Dani");
        personas[3]=new Persona("Roberto");
        
        System.out.println("personas = " + personas[0].getNombre());
        System.out.println("personas = " + personas[1].getNombre());
        System.out.println("personas = " + personas[2].getNombre());
        System.out.println("personas = " + personas[3].getNombre());
        
        System.out.println("Colores = " + colores[0]);
        System.out.println("Colores = " + colores[1]);
        System.out.println("Colores = " + colores[2]);
        
        System.out.println("Recorriendo arreglo con Ciclo For:");
        for(int persona= 0; persona< personas.length;persona++ ){
            System.out.println("Persona "+ persona +" : " + personas[persona].getNombre());
        }
    }
}
