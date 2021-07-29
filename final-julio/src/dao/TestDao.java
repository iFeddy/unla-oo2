package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestDao {
    private static Session session;
	private Transaction tx;	
	private static TestDao instancia;

    public static TestDao getInstancia() {
        if (instancia == null) {
            instancia = new TestDao();
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
}
