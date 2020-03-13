package mauriz.fran.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=10;
    
    public Orden(){
        this.idOrden=++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < MAX_COMPUTADORAS){
            computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Se ha sobrepasado el número maximo de computadoras: " + MAX_COMPUTADORAS);
        }
    }
    
    public double calcularTotal(){
        double total=0;
        for(int i=0;i<this.contadorComputadoras;i++){
            Monitor monitor = this.computadoras[i].getMonitor();
            Raton raton = this.computadoras[i].getRaton();
            Teclado teclado = this.computadoras[i].getTeclado();
            total += raton.getPrecio() + monitor.getPrecio() + teclado.getPrecio();            
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("-----------------------------------------------");
        double total = this.calcularTotal();
        System.out.println("Detalle del pedido:");
        for(int i=0;i<this.contadorComputadoras;i++){
            Computadora computadora = this.computadoras[i];
            System.out.println("Computadora:");
            System.out.println(computadora.getNombre());
            System.out.println("_____Monitor:");
            System.out.println("_____________Marca =" + computadora.getMonitor().getMarca());
            System.out.println("_____________Tamaño = " + computadora.getMonitor().getTamano());
            System.out.println("_____________Precio = " + computadora.getMonitor().getPrecio());
            System.out.println("_____Teclado:");
            System.out.println("_____________Marca = " + computadora.getTeclado().getMarca());
            System.out.println("_____________Tipo Entrada = "+computadora.getTeclado().getTipoEntrada());
            System.out.println("_____________Precio = " + computadora.getTeclado().getPrecio());
            System.out.println("_____Raton:");
            System.out.println("_____________Marca = " + computadora.getRaton().getMarca());
            System.out.println("_____________Tipo Entrada = " + computadora.getRaton().getTipoEntrada());
            System.out.println("_____________Precio = " + computadora.getRaton().getPrecio());
            System.out.println("-----------------------------------------------");
            System.out.println("Total pedido: " + total);
            System.out.println("-----------------------------------------------");
            System.out.println("");
            
        }
    }
}
