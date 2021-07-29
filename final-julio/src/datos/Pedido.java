package datos;

import java.util.Set;

public class Pedido extends Stock {
    private int idPedido;
    private Set<NotaPedido> notasPedidos;

    public Pedido() {
    }

    public int getIdPedido() {
        return this.idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Set<NotaPedido> getNotasPedidos() {
        return this.notasPedidos;
    }

    public void setNotasPedidos(Set<NotaPedido> notasPedidos) {
        this.notasPedidos = notasPedidos;
    }


    @Override
    public String toString() {
        return "{" +
            " notasPedidos='" + getNotasPedidos() + "'" +
            "}";
    }

}
