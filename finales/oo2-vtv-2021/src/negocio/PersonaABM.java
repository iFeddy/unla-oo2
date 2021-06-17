package negocio;

import dao.PersonaDao;
import datos.Contribuyente;
import datos.Inspector;

public class PersonaABM {

	PersonaDao dao = new PersonaDao();

	// ---------------------------------------------------  1) + traerContribuyente (int idPersona) : Contribuyente
	public Contribuyente traerContribuyente(int idPersona) {
		return dao.traerContribuyente(idPersona); 
		}
	
	// --------------------------------------------------- 2) + traerInspector (int idPersona) : Inspector
	public Inspector traerInspector(int idPersona) {
		return dao.traerInspector(idPersona);
	}


}
