package datos;

import java.time.LocalDate;

public class Vacuna {
    private int idVacuna;
    private Long codigo;
    private String laboratorio;
    private LocalDate fechaElaboracion;

    public Vacuna() {
    }

    public Vacuna(int idVacuna, Long codigo, String laboratorio, LocalDate fechaElaboracion) {
        this.idVacuna = idVacuna;
        this.codigo = codigo;
        this.laboratorio = laboratorio;
        this.fechaElaboracion = fechaElaboracion;
    }

    public int getIdVacuna() {
        return this.idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getLaboratorio() {
        return this.laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFechaElaboracion() {
        return this.fechaElaboracion;
    }

    public void setFechaElaboracion(LocalDate fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    @Override
    public String toString() {
        return "{" +
            " idVacuna='" + getIdVacuna() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", laboratorio='" + getLaboratorio() + "'" +
            ", fechaElaboracion='" + getFechaElaboracion() + "'" +
            "}";
    }
    
}
