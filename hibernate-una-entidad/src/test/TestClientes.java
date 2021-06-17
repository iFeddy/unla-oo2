package test;

import java.util.*;
import datos.Cliente;
import negocio.ClienteABM;
import dao.HibernateUtil;

public class TestClientes {
    public static void main(String[] args) {
        ClienteABM abm = new ClienteABM();
        List<Cliente> lstCliente = new ArrayList<Cliente>();
        lstCliente = abm.traer();
        for (int i = 0; i < lstCliente.size(); i++) {
            System.out.println(lstCliente.get(i));
        }
        HibernateUtil.getSessionFactory().close();
    }
}