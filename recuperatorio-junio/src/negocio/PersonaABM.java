package negocio;

import java.util.List;

import dao.PersonaDao;
import datos.Persona;

public class PersonaABM {
    private static PersonaABM instancia;	
	private PersonaDao dao = PersonaDao.getInstancia();
		
	public static PersonaABM getInstancia() {
		if(instancia == null) {
			instancia = new PersonaABM();
		}
		return instancia;
	}

	public List<Persona> traerPersona(int edadDesde, int edadHasta) {
		return dao.traerPersona(edadDesde, edadHasta);
	}    
    
}
