package datos;

import java.time.LocalDate;

import negocio.PermisoABM;

public class Localidad extends Lugar {
    private String codPostal;
    private boolean cumplirCuarentena;

    public Localidad() {
    }

    public Localidad(String lugar, String codPostal, boolean cumplirCuarentena) {
        super(lugar);
        this.codPostal = codPostal;
        this.cumplirCuarentena = cumplirCuarentena;
    }

    public Localidad(String codPostal, boolean cumplirCuarentena) {
        this.codPostal = codPostal;
        this.cumplirCuarentena = cumplirCuarentena;
    }

    public String getCodPostal() {
        return this.codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public boolean isCumplirCuarentena() {
        return this.cumplirCuarentena;
    }

    public boolean getCumplirCuarentena() {
        return this.cumplirCuarentena;
    }

    public void setCumplirCuarentena(boolean cumplirCuarentena) {
        this.cumplirCuarentena = cumplirCuarentena;
    }

    @Override
    public boolean ingresoHabilitado(int idPermiso, LocalDate dia) {
        //Trae la Instancia con el Permiso
        Permiso permiso = PermisoABM.getInstancia().traerPermiso(idPermiso);
        //Fecha de Vencimiento = permiso.fecha.Año , permiso.fecha.mes, permiso.fecha.dia) + (plusDays) la cantidad de dias
        LocalDate fechaVto = LocalDate
                .of(permiso.getFecha().getYear(), permiso.getFecha().getMonth(), permiso.getFecha().getDayOfMonth())
                .plusDays(permiso.getCantDias());
        //Si dia = permiso.fecha true
        //O dia es el dia siguiente de fecha (Esto chequea que el permiso no sea anterior a dia)
        //Y si (Ademas)
        //dia = fechaVto (es verdadero si es el mismo dia de vencimiento o antes)
        //O dia esta antes del vencimiento
        return (dia.equals(permiso.getFecha()) || dia.isAfter(permiso.getFecha())) &&
                (dia.equals(fechaVto) || dia.isBefore(fechaVto));
    }

    @Override
    public String toString() {
        return "{" + " lugar=" + super.toString() + "'" + " codPostal='" + getCodPostal() + "'"
                + ", cumplirCuarentena='" + isCumplirCuarentena() + "'" + "}";
    }

}
