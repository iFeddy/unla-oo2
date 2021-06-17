package datos;

public class Rodado {
    private int idRodado;
    private String dominio;
    private String vehiculo;

    public Rodado() {
    }

    public Rodado(int idRodado, String dominio, String vehiculo) {
        this.idRodado = idRodado;
        this.dominio = dominio;
        this.vehiculo = vehiculo;
    }

    public int getIdRodado() {
        return this.idRodado;
    }

    public void setIdRodado(int idRodado) {
        this.idRodado = idRodado;
    }

    public String getDominio() {
        return this.dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getVehiculo() {
        return this.vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "{" + " idRodado='" + getIdRodado() + "'" + ", dominio='" + getDominio() + "'" + ", vehiculo='"
                + getVehiculo() + "'" + "}";
    }

}
