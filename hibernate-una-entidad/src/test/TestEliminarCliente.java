package test;

import dao.HibernateUtil;
import negocio.ClienteABM;

public class TestEliminarCliente {
    public static void main(String[] args) {
        ClienteABM abm = new ClienteABM();
        try {
            abm.eliminar(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            HibernateUtil.getSessionFactory().close();
        }
    }
}
