package dao;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Pedido;
import datos.Producto;

public class PedidoDao {
    private static Session session;
	private Transaction tx;	
	private static PedidoDao instancia;

    public static PedidoDao getInstancia() {
        if (instancia == null) {
            instancia = new PedidoDao();
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

    public Pedido traerPedido(Producto producto) {
        Pedido objeto = null;
        try {
            iniciaOperacion();
			objeto = (Pedido) session.createQuery("from Stock s inner join fetch s.producto p where p.codigo=" + producto.getCodigo()).uniqueResult();
            Hibernate.initialize(objeto.getNotasPedidos());
        } finally {
            session.close();
        }
        return objeto;
    }
}
