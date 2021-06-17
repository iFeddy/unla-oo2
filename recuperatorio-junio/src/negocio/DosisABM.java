package negocio;

import java.time.LocalTime;
import java.util.List;

import dao.DosisDao;
import datos.Dosis;
import datos.Vacuna;

public class DosisABM {
    private static DosisABM instancia;	
	private DosisDao dao = DosisDao.getInstancia();
		
	public static DosisABM getInstancia() {
		if(instancia == null) {
			instancia = new DosisABM();
		}
		return instancia;
	}

	public List<Dosis> traerDosis(Vacuna vacuna) {
		return dao.traerDosis(vacuna);
	}

    public List<Dosis> traerDosis(LocalTime horaDesde, LocalTime horaHasta) {
        return dao.traerDosis(horaDesde, horaHasta);
    }

	public List<Dosis> traerDosis(LocalTime horaDesde, LocalTime horaHasta, boolean tieneComorbilidades) {
		return dao.traerDosis(horaDesde, horaHasta, tieneComorbilidades);
	}
    
    
}
