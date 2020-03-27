package claseobje;

public class ClassObject {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado("Fran",300.40);
        Empleado empleado2= new Empleado("Fran",300.40);
                     
        compararObjetos(empleado1,empleado2);
        
    }

    private static void compararObjetos(Empleado empleado1, Empleado empleado2) {
        System.out.println("empleado1 = " + empleado1);
        System.out.println("empleado2 = " + empleado2);
        
        //por rferencia
        if(empleado1==empleado2){
            System.out.println("Los objetos tienen la misma referencia de memoria");
        }else{
            System.out.println("Los objetos tienen diferente referencia de memoria");
        }
        
        //metodo equals
        
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        }else{
            System.out.println("Los objetos no tienen el mismo contenido");
        }
        
        if(empleado1.hashCode()==empleado2.hashCode()){
            System.out.println("Los objetos tienen el mismo hashcode");
        }else{
            System.out.println("Los objetos no tienen el mismo hashcode");
        }
        
    }
}
