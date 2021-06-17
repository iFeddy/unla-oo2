package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Persona;

public class PersonaDao {
	private static Session session;
	private Transaction tx;
	private static PersonaDao instancia;

	public static PersonaDao getInstancia() {
		if (instancia == null) {
			instancia = new PersonaDao();
		}
		return instancia;
	}

	protected void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	protected void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	@SuppressWarnings("unchecked")
	public List<Persona> traerPersona(int edadDesde, int edadHasta) {
		List<Persona> personas = null;
		List<Persona> listado = new ArrayList<Persona>();
		LocalDate hoy = LocalDate.now();
		try {
			iniciaOperacion();
			personas = session.createQuery("from Persona p order by p.idPersona asc").list();
			for (Persona persona : personas) {
				int edad = persona.calcularEdad(hoy);
				if (edad > edadDesde && edad < edadHasta) {
					listado.add(persona);
				}			
			}
		} finally {
			session.close();
		}
		return listado;
	}
}
