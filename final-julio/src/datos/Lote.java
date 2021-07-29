package datos;

import java.time.LocalDate;

public class Lote {
    private int idLote;
    private LocalDate fecha;
    private int cantInicial;
    private int cantExistente;

    public Lote() {
    }

    public Lote(int idLote, LocalDate fecha, int cantInicial, int cantExistente) {
        this.idLote = idLote;
        this.fecha = fecha;
        this.cantInicial = cantInicial;
        this.cantExistente = cantExistente;
    }

    public int getIdLote() {
        return this.idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantInicial() {
        return this.cantInicial;
    }

    public void setCantInicial(int cantInicial) {
        this.cantInicial = cantInicial;
    }

    public int getCantExistente() {
        return this.cantExistente;
    }

    public void setCantExistente(int cantExistente) {
        this.cantExistente = cantExistente;
    }

    @Override
    public String toString() {
        return "{" +
            " idLote='" + getIdLote() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", cantInicial='" + getCantInicial() + "'" +
            ", cantExistente='" + getCantExistente() + "'" +
            "}";
    }

}
