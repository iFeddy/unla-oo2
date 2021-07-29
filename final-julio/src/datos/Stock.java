package datos;

public class Stock {
    private int idStock;
    private Producto producto;

    public Stock() {
    }

    public Stock(int idStock, Producto producto) {
        this.idStock = idStock;
        this.producto = producto;
    }

    public int getIdStock() {
        return this.idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "{" +
            " idStock='" + getIdStock() + "'" +
            ", producto='" + getProducto() + "'" +
            "}";
    }

}
