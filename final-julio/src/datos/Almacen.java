package datos;

import java.util.Set;

public class Almacen extends Stock {
    private int idAlmacen;
    private int cantDeseable;
    private int cantMinima;
    public Set<Lote> lotes;

    public Almacen() {
        super();
    }

    public Almacen(int cantDeseable, int cantMinima) {
        super();
        this.cantDeseable = cantDeseable;
        this.cantMinima = cantMinima;
    }

    public int getIdAlmacen() {
        return this.idAlmacen;
    }

    protected void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public int getCantDeseable() {
        return this.cantDeseable;
    }

    public void setCantDeseable(int cantDeseable) {
        this.cantDeseable = cantDeseable;
    }

    public int getCantMinima() {
        return this.cantMinima;
    }

    public void setCantMinima(int cantMinima) {
        this.cantMinima = cantMinima;
    }

    public Set<Lote> getLotes() {
        return this.lotes;
    }

    public void setLotes(Set<Lote> lotes) {
        this.lotes = lotes;
    }

    public int cantProductosExistentes() {  
        int cant = 0;
        for (Lote lote : this.lotes) {
            cant += lote.getCantExistente();
        }
        return cant;
    }

    @Override
    public String toString() {       
        return "{" +
            " stock='" + super.toString() + "'" +
            " lotes='" + this.lotes.toString() + "'" +
            " cantDeseable='" + getCantDeseable() + "'" +
            ", cantMinima='" + getCantMinima() + "'" +
            "}";
    }

}
