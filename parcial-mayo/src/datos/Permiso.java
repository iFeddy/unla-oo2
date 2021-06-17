package datos;

import java.time.LocalDate;
import java.util.Set;

public class Permiso {
    private int idPermiso;  
    private Persona persona;
    private LocalDate fecha;
    private int cantDias;
    private Rodado rodado;
    private Set<Lugar> desdeHasta;
    
    public Permiso() {
    }

    public Permiso(int idPermiso, Persona persona, LocalDate fecha, int cantDias, Rodado rodado, Set<Lugar> desdeHasta) {
        this.idPermiso = idPermiso;
        this.persona = persona;
        this.fecha = fecha;
        this.cantDias = cantDias;
        this.rodado = rodado;
        this.desdeHasta = desdeHasta;
    }

    public int getIdPermiso() {
        return this.idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantDias() {
        return this.cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public Rodado getRodado() {
        return this.rodado;
    }

    public void setRodado(Rodado rodado) {
        this.rodado = rodado;
    }

    public Set<Lugar> getDesdeHasta() {
        return this.desdeHasta;
    }

    public void setDesdeHasta(Set<Lugar> desdeHasta) {
        this.desdeHasta = desdeHasta;
    }

    @Override
    public String toString() {
        return "{" +
            " idPermiso='" + getIdPermiso() + "'" +
            ", persona='" + getPersona() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", desdeHasta='" + getDesdeHasta() + "'" +
            ", cantDias='" + getCantDias() + "'" +
            ", rodado='" + getRodado() + "'" +            
            "}";
    }
}
