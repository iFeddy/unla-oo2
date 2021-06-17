package datos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import funciones.Funciones;

public class Evento {
    private long idEvento;
    private String evento;
    private LocalDate fecha;
    private LocalTime hora;
    private Set<Cliente> clientes;

    public Evento() {
    }

    public Evento(String evento, LocalDate fecha, LocalTime hora) {        
        this.evento = evento;
        this.fecha = fecha;
        this.hora = hora;
    }

    public long getIdEvento() {
        return this.idEvento;
    }

    protected void setIdEvento(long idEvento) {
        this.idEvento = idEvento;
    }

    public String getEvento() {
        return this.evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return this.hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Set<Cliente> getClientes() {
        return this.clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Evento idEvento(long idEvento) {
        setIdEvento(idEvento);
        return this;
    }

    public Evento evento(String evento) {
        setEvento(evento);
        return this;
    }

    public Evento fecha(LocalDate fecha) {
        setFecha(fecha);
        return this;
    }

    public Evento hora(LocalTime hora) {
        setHora(hora);
        return this;
    }

    public Evento clientes(Set<Cliente> clientes) {
        setClientes(clientes);
        return this;
    }

    public boolean equals(Evento evento) {
		return this.idEvento== evento.idEvento;
	}

	public boolean agregar(Cliente cliente) {
		return clientes.add(cliente);
	}

	public boolean eliminar(Cliente cliente) {
		return clientes.remove(cliente);
	}
    
    @Override
    public String toString() {
        return "{" +
            " idEvento='" + getIdEvento() + "'" +
            ", evento='" + getEvento() + "'" +
            ", fecha='" + Funciones.traerFechaCorta(getFecha()) + "'" +
            ", hora='" + Funciones.traerHora(getHora()) + "'" +
            ", clientes='" + getClientes() + "'" +
            "}";
    }

}
