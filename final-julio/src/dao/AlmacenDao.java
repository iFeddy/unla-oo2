package dao;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Almacen;
import datos.Producto;

public class AlmacenDao {
    private static Session session;
	private Transaction tx;	
	private static AlmacenDao instancia;

    public static AlmacenDao getInstancia() {
        if (instancia == null) {
            instancia = new AlmacenDao();
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

    public Almacen traerAlmacen(Producto producto) {
        Almacen objeto = null;
        try {
            iniciaOperacion();
			objeto = (Almacen) session.createQuery("from Stock s inner join fetch s.producto p where p.codigo=" + producto.getCodigo()).uniqueResult();
            Hibernate.initialize(objeto.getLotes());
        } finally {
            session.close();
        }
        return objeto;
    }

	

}
