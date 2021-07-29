package datos;

public class Producto {
    private int idProducto;
    private String codigo;
    private String producto;
    private double precio;


    public Producto() {
    }

    public Producto(int idProducto, String codigo, String producto, double precio) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.producto = producto;
        this.precio = precio;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return this.producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" +
            " idProducto='" + getIdProducto() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", producto='" + getProducto() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }
}
