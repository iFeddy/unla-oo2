package negocio;

import dao.VacunaDao;
import datos.Vacuna;

public class VacunaABM {
    private static VacunaABM instancia;	
	private VacunaDao dao = VacunaDao.getInstancia();
		
	public static VacunaABM getInstancia() {
		if(instancia == null) {
			instancia = new VacunaABM();
		}
		return instancia;
	}

    public Vacuna traerVacuna(Long codigo) {
        return dao.traerVacuna(codigo);
    }
    
}
