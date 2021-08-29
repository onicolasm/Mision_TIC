//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
public class Pedido {

    // Inserte acá los atributos
    private String nPedido;
    private String IDCliente;
    private double costoPedido;
    private int diaPedido;
    private int mesPedido;
    private int yearPedido;

    // Inserte acá el método constructor

    public Pedido(String nPedido, String IDCliente, double costoPedido, int diaPedido, int mesPedido, int yearPedido){
        this.nPedido = nPedido;
        this.IDCliente = IDCliente;
        this.costoPedido = costoPedido;
        this.diaPedido = diaPedido;
        this.mesPedido = mesPedido;
        this.yearPedido = yearPedido;
    }

    // Inserte acá los SETTERS Y GETTERS

    public String getnPedido() {
        return this.nPedido;
    }

    public void setnPedido(String nPedido) {
        this.nPedido = nPedido;
    }

    public String getIDCliente() {
        return this.IDCliente;
    }

    public void setIDCliente(String IDClient) {
        this.IDCliente = IDCliente;
    }

    public double getCostoPedido() {
        return this.costoPedido;
    }

    public void setCostoPedido(double costoPedido) {
        this.costoPedido = costoPedido;
    }

    public int getDiaPedido() {
        return this.diaPedido;
    }

    public void setDiaPedido(int diaPedido) {

        if (diaPedido >= 0 && diaPedido <= 31) {
            this.diaPedido = diaPedido;
        }
    }

    public int getMesPedido() {
        return this.mesPedido;
    }

    public void setMesPedido(int mesPedido) {
        //if (mesPedido >= 1 && mesPedido <= 12) {
            this.mesPedido = mesPedido;
        //}
    }

    public int getYearPedido() {
        return this.yearPedido;
    }

    public void setYearPedido(int yearPedido) {
       // if (yearPedido >= 1900 && yearPedido <= 3000) {
            this.yearPedido = yearPedido;
        //}
    }
}