package datos;

import java.time.LocalDate;

import funciones.Funciones;

public class Persona {
    private int idPersona;
    private Long documento;
    private LocalDate fechaNacimiento;
    private boolean tieneComorbilidad;

    public Persona() {
    }

    public Persona(int idPersona, Long documento, LocalDate fechaNacimiento, boolean tieneComorbilidad) {
        this.idPersona = idPersona;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.tieneComorbilidad = tieneComorbilidad;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Long getDocumento() {
        return this.documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isTieneComorbilidad() {
        return this.tieneComorbilidad;
    }

    public boolean getTieneComorbilidad() {
        return this.tieneComorbilidad;
    }

    public void setTieneComorbilidad(boolean tieneComorbilidad) {
        this.tieneComorbilidad = tieneComorbilidad;
    }

    public int calcularEdad(LocalDate hoy){
        return Funciones.calcularEdad(this.fechaNacimiento, hoy);
    }

    @Override
    public String toString() {
        return "{" +
            " idPersona='" + getIdPersona() + "'" +
            ", documento='" + getDocumento() + "'" +
            ", fechaNacimiento='" + getFechaNacimiento() + "'" +
            ", tieneComorbilidad='" + isTieneComorbilidad() + "'" +
            "}";
    }


}
