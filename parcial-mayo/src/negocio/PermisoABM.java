package negocio;

import dao.PermisoDao;
import datos.Permiso;

public class PermisoABM {
    private static PermisoABM instancia;	
	private PermisoDao dao = PermisoDao.getInstancia();
		
	public static PermisoABM getInstancia() {
		if(instancia == null) {
			instancia = new PermisoABM();
		}
		return instancia;
	}

    public Permiso traerPermiso(int id) {
        return dao.traer(id);
    }
}