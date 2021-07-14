package dao;

import java.time.LocalTime;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Dosis;
import datos.Vacuna;

public class DosisDao {
	private static Session session;
	private Transaction tx;
	private static DosisDao instancia;

	public static DosisDao getInstancia() {
		if (instancia == null) {
			instancia = new DosisDao();
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
	public List<Dosis> traerDosis(Vacuna vacuna) {
		List<Dosis> objeto = null;
		try {
			iniciaOperacion();
			objeto = session.createQuery("from Dosis d where d.vacuna =" + vacuna.getIdVacuna()).list();
			for (Dosis d : objeto) {
				Hibernate.initialize(d.getPersona());
				Hibernate.initialize(d.getVacuna());
			}
		} finally {
			session.close();
		}
		return objeto;
	}

	@SuppressWarnings("unchecked")
	public List<Dosis> traerDosis(LocalTime horaDesde, LocalTime horaHasta) {
		List<Dosis> objeto = null;
		try {
			iniciaOperacion();
			objeto = session
					.createQuery("from Dosis d where d.hora BETWEEN '" + horaDesde + "' AND '" + horaHasta + "'")
					.list();
			for (Dosis d : objeto) {
				Hibernate.initialize(d.getPersona());
				Hibernate.initialize(d.getVacuna());
			}
		} finally {
			session.close();
		}
		return objeto;
	}

	//Observacion de Romina: Quiere que use el mismo metodo que los casos de usos anteriores para no repetir la query (?)
	//Ni idea para mi son querys distintas, habira que poner una bandera en string "all", "true", "false" para comorbilidades
	//Pero dejaria de ser con los parametros que piden.
	@SuppressWarnings("unchecked")
	public List<Dosis> traerDosis(LocalTime horaDesde, LocalTime horaHasta, boolean tieneComorbilidades) {
		List<Dosis> objeto = null;
		try {
			iniciaOperacion();
			objeto = session.createQuery("from Dosis d inner join fetch d.persona p where d.hora BETWEEN '" + horaDesde
					+ "' AND '" + horaHasta + "' AND p.tieneComorbilidad = " + tieneComorbilidades).list();
			for (Dosis d : objeto) {
				Hibernate.initialize(d.getPersona());
				Hibernate.initialize(d.getVacuna());
			}
		} finally {
			session.close();
		}
		return objeto;
	}
}
