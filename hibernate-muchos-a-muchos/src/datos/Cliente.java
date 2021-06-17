package datos;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

import funciones.Funciones;

public class Cliente {
    private long idCliente;
    private String apellido;
    private String nombre;
    private long dni;
    private LocalDate fechaDeNacimiento;
    private boolean baja;
    private Set<Evento> eventos;

    public Cliente() {
    }

    public Cliente(String apellido, String nombre, long dni, LocalDate fechaDeNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.baja = false;
    }

    public long getIdCliente() {
        return this.idCliente;
    }

    protected void setIdCliente(long idCliente) {
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

    public long getDni() {
        return this.dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public LocalDate getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public boolean isBaja() {
        return this.baja;
    }

    public boolean getBaja() {
        return this.baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public Set<Evento> getEventos() {
        return this.eventos;
    }

    public void setEventos(Set<Evento> eventos) {
        this.eventos = eventos;
    }

    public Cliente idCliente(long idCliente) {
        setIdCliente(idCliente);
        return this;
    }

    public Cliente apellido(String apellido) {
        setApellido(apellido);
        return this;
    }

    public Cliente nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Cliente dni(long dni) {
        setDni(dni);
        return this;
    }

    public Cliente fechaDeNacimiento(LocalDate fechaDeNacimiento) {
        setFechaDeNacimiento(fechaDeNacimiento);
        return this;
    }

    public Cliente baja(boolean baja) {
        setBaja(baja);
        return this;
    }

    public Cliente eventos(Set<Evento> eventos) {
        setEventos(eventos);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return idCliente == cliente.idCliente && Objects.equals(apellido, cliente.apellido) && Objects.equals(nombre, cliente.nombre) && dni == cliente.dni && Objects.equals(fechaDeNacimiento, cliente.fechaDeNacimiento) && baja == cliente.baja && Objects.equals(eventos, cliente.eventos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, apellido, nombre, dni, fechaDeNacimiento, baja, eventos);
    }

    public boolean agregar(Evento evento){
		return eventos.add(evento);
    }

	public boolean eliminar(Evento evento){
		return eventos.remove(evento);
	}

    @Override
    public String toString() {
        return "{" +
            " idCliente='" + getIdCliente() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", dni='" + getDni() + "'" +
            ", fechaDeNacimiento='" + Funciones.traerFechaCorta(getFechaDeNacimiento()) + "'" +
            ", baja='" + isBaja() + "'" +
            ", eventos='" + getEventos() + "'" +
            "}";
    }
}
