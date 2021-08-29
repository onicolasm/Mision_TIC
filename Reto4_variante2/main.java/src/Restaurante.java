
//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.util.ArrayList;

public class Restaurante {

    // Inserte acá los atributos
    private ArrayList<Pedido> pedidos;

    // Inserte acá el método constructor
    public Restaurante() {
        this.pedidos = new ArrayList<>();
    }

    // Inserte acá los SETTERS Y GETTERS
    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    // Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public void agregarPedidoLista(Pedido p) {

        if(!this.pedidos.contains(p)){
            this.pedidos.add(p);
        }
        
    }

    public void eliminarPedido(String nPedido) {
        Pedido aux;
        int sw=0;
        for (int i =0; i < this.pedidos.size();i++){
            aux=this.pedidos.get(i);
            if(aux.getnPedido().equals(nPedido)){
                this.pedidos.remove(i);
                sw=1;
                break;
            }else if(sw ==0){
                System.out.println("no person");

            }

        }
    }
    

    public double calcularGanancias() {
        double suma = 0;
        Pedido aux;
        for (int i=0;i<this.pedidos.size();i++) {
            aux=this.pedidos.get(i);
            suma += aux.getCostoPedido();
        }
        return suma;
    }

    public double promedioGananciasTotales() {
        return calcularGanancias() / this.pedidos.size();
    }

    public double desviacionEstandarGananciasTotales() {
        double suma = 0;
        double promedio = this.promedioGananciasTotales();
        //double varianza = 0;
        //double desviacion = 0;
        for (Pedido i : this.pedidos) {
            suma += Math.pow(i.getCostoPedido() - promedio, 2);
            //varianza = varianza + sum;
        }
        suma = suma / this.pedidos.size();
        suma = Math.sqrt(suma);


        //sum = sum /this.pedidos.size();
        //sum = Math.sqrt(sum);
        //varianza = varianza / (pedidos.size() - 1);
        //desviacion = Math.sqrt(varianza);
        //return desviacion;
        return suma;
    }

    public double retornarCostoPedido(String ID) {
        double x = 0;
        Pedido aux;
        for (int i=0;i<this.pedidos.size();i++) {
            aux=this.pedidos.get(i);
            if(aux.getnPedido().equals(ID)){
                x= aux.getCostoPedido();
            }
           // x = aux.getCostoPedido();
        }
        //for (Pedido i : this.pedidos) {
          //  if (i.getnPedido().equals(ID)) {
            //    x = i.getCostoPedido();
            //}
        //}
        return x;
    }
    


    @Override
    public String toString() {
        String datos = "{\n";
        for(Pedido l:this.pedidos ){
            datos+="nPeido: "+l.getnPedido()+", IDClient: "+
                    l.getIDCliente()+", costoPedido: "+
                    l.getCostoPedido()+", diaPedido: " + l.getDiaPedido()+", mesPedido: " + l.getMesPedido() + ", yearPedido: " + l.getYearPedido()+
                    ";\n";
        }
        datos+="}";
        return "Restaurante{" + "Pedido=" + datos + '}';
    }

}