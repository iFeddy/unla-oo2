package datos;

import java.time.*;

public class Dosis {
    private int idDosis;
    private String vacunatorio;
    private LocalDate fecha;
    private LocalTime hora;
    private Vacuna vacuna;
    private Persona persona; 

    public Dosis() {
    }

    public Dosis(int idDosis, String vacunatorio, LocalDate fecha, LocalTime hora, Vacuna vacuna, Persona persona) {
        this.idDosis = idDosis;
        this.vacunatorio = vacunatorio;
        this.fecha = fecha;
        this.hora = hora;
        this.vacuna = vacuna;
        this.persona = persona;
    }

    public int getIdDosis() {
        return this.idDosis;
    }

    public void setIdDosis(int idDosis) {
        this.idDosis = idDosis;
    }

    public String getVacunatorio() {
        return this.vacunatorio;
    }

    public void setVacunatorio(String vacunatorio) {
        this.vacunatorio = vacunatorio;
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

    public Vacuna getVacuna() {
        return this.vacuna;
    }

    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }

    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "{" +
            " idDosis='" + getIdDosis() + "'" +
            ", vacunatorio='" + getVacunatorio() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", hora='" + getHora() + "'" +
            ", vacuna='" + getVacuna() + "'" +
            ", persona='" + getPersona() + "'" +
            "}";
    }

}
