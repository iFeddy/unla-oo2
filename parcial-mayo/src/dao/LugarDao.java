package dao;

import java.time.LocalDate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Localidad;
import datos.Lugar;

import datos.Ubicacion;

public class LugarDao {
    private static Session session;
	private Transaction tx;	
	private static LugarDao instancia;

    public static LugarDao getInstancia() {
        if (instancia == null) {
            instancia = new LugarDao();
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

    // idLugar, lugar, longitud y latitud

    public Ubicacion traerUbicacion(int id) {
		Ubicacion objeto = null;
		try {
			iniciaOperacion();
			objeto = (Ubicacion) session.get(Ubicacion.class, id); //sin query		
			
		} finally {
			session.close();
		}
		return objeto;
	}

	public Localidad traerLocalidad(int id) {
		Localidad objeto = null;
		try {
			iniciaOperacion();
			objeto = (Localidad) session.createQuery("from Localidad a where a.idLugar =" + id).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}

    public boolean ingresoHabilitado(int idPermiso, LocalDate fecha) {
		Lugar objeto = null;		
		try {
			iniciaOperacion();
			objeto = (Lugar) session.get(Lugar.class, idPermiso); //donde meter el id=lugar 1?
		} finally {
			session.close();
		}
		return objeto.ingresoHabilitado(idPermiso, fecha);
    }

	//Con Lugar
    public boolean ingresoHabilitado(int idLugar, int idPermiso, LocalDate fecha) {
        	Lugar objeto = null;		
		try {
			iniciaOperacion();
			objeto = (Lugar) session.get(Lugar.class, idLugar);
		} finally {
			session.close();
		}
		return objeto.ingresoHabilitado(idPermiso, fecha);
    }
}
