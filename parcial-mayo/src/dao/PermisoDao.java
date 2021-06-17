package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Permiso;

public class PermisoDao {
    private static Session session;
	private Transaction tx;
    private static PermisoDao instancia;

    public static PermisoDao getInstancia() {
        if (instancia == null) {
            instancia = new PermisoDao();
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
   
    public Permiso traer(int id) throws HibernateException {
        Permiso objeto = null;
        try {
            iniciaOperacion();
            objeto = (Permiso) session.get(Permiso.class, id);            
        } finally {
            session.close();
        }
        return objeto;
    }
}
