package negocio;

import java.time.LocalDate;

import dao.LugarDao;
import datos.Localidad;

import datos.Ubicacion;

public class LugarABM {
    private static LugarABM instancia;
    private LugarDao dao = LugarDao.getInstancia();
		
	public static LugarABM getInstancia() {
		if(instancia == null) {
			instancia = new LugarABM();
		}
		return instancia;
	}

	public Ubicacion traerUbicacion(int id) {
		return dao.traerUbicacion(id);
	}

    public Localidad traerLocalidad(int id) {
        return dao.traerLocalidad(id);
    }

    //Como lo pidieron ellos, no se me ocurre como pasar el idLugar
    public boolean ingresoHabilitado(int idPermiso, LocalDate fecha) {
        return dao.ingresoHabilitado(idPermiso, fecha);
    }

    public boolean ingresoHabilitado(int idLugar, int idPermiso, LocalDate fecha) {
        return dao.ingresoHabilitado(idLugar, idPermiso, fecha);
    } 
}
