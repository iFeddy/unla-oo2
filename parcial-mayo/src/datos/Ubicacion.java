package datos;

import java.time.LocalDate;

import negocio.PermisoABM;

public class Ubicacion extends Lugar {
    private double longitud;
    private double latitud;

    public Ubicacion() {
    }

    public Ubicacion(String lugar, double longitud, double latitud) {
        super(lugar);
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public Ubicacion(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }


    public double getLongitud() {
        return this.longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return this.latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    @Override
    public boolean ingresoHabilitado(int idPermiso, LocalDate dia) {
        //Trae la Instancia con el Permiso
        Permiso permiso = PermisoABM.getInstancia().traerPermiso(idPermiso);
        //Si es el mismo dia 
        return (dia.equals(permiso.getFecha()));
    }
    
    @Override
    public String toString() {
        return "{" +
            " lugar='" + super.toString() + "'" +
            " longitud='" + getLongitud() + "'" +
            ", latitud='" + getLatitud() + "'" +
            "}";
    }
   
}
