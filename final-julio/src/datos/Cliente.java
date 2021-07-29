package datos;

public class Cliente {
    private int idCliente;
    private String apellido;
    private String nombre;
    private String email;

    public Cliente() {
    }

    public Cliente(int idCliente, String apellido, String nombre, String email) {
        this.idCliente = idCliente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
            " idCliente='" + getIdCliente() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }


}
