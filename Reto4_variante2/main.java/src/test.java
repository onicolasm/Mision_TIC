

public class test extends Restaurante{
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

       
    
        Pedido p1 = new Pedido("A1","72023394",70000.0,31,3,2020);
        Pedido p2 = new Pedido("A21","1037681391",67000.0,23,4,2020);
        Pedido p3 = new Pedido("A32","33277591",20000.0,24,5,2020);
        Pedido p4 = new Pedido("B1","1032678245",40000.0,7,1,2021);
        
        restaurante.agregarPedidoLista(p1);
        restaurante.agregarPedidoLista(p2);
        restaurante.agregarPedidoLista(p3);
        restaurante.eliminarPedido("A3456789");
        restaurante.agregarPedidoLista(p4);
        restaurante.eliminarPedido("A21");


        System.out.println(restaurante.toString());

    

        System.out.println(restaurante.calcularGanancias());
        System.out.println(restaurante.promedioGananciasTotales());
        System.out.println(restaurante.desviacionEstandarGananciasTotales());
        System.out.println(restaurante.retornarCostoPedido("A32"));
        System.out.println("x");

       

    } 
}
