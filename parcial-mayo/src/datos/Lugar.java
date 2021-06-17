package datos;

import java.time.LocalDate;

public abstract class Lugar {
    protected int idLugar;
    protected String lugar;
    public abstract boolean ingresoHabilitado(int idPermiso, LocalDate dia);

    public Lugar() {
    }

    public Lugar(String lugar) {
        this.lugar = lugar;
    }

    public int getIdLugar() {
        return this.idLugar;
    }

    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "{" +
            " idLugar='" + getIdLugar() + "'" +
            ", lugar='" + getLugar() + "'" +
            "}";
    }

}
