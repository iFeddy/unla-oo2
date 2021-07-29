package datos;

import java.time.LocalDate;

public class NotaPedido {
    private int idNotaPedido;
    private LocalDate fecha;
    private int cantidad;
    private Cliente cliente;
    private boolean entregado;

    public NotaPedido() {
    }

    public NotaPedido(LocalDate fecha, int cantidad, Cliente cliente, boolean entregado) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.entregado = entregado;
    }

    public int getIdNotaPedido() {
        return this.idNotaPedido;
    }

    protected void setIdNotaPedido(int idNotaPedido) {
        this.idNotaPedido = idNotaPedido;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEntregado() {
        return this.entregado;
    }

    public boolean getEntregado() {
        return this.entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
   

    @Override
    public String toString() {
        return "{" +
            " fecha='" + getFecha() + "'" +
            ", cantidad='" + getCantidad() + "'" +
            ", cliente='" + getCliente() + "'" +
            ", entregado='" + isEntregado() + "'" +
            "}";
    }


}
