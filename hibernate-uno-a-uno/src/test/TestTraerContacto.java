package test;

import datos.Cliente;
import datos.Contacto;
import negocio.ClienteABM;

public class TestTraerContacto {
    public static void main(String[] args) {
        ClienteABM abmCliente = new ClienteABM();
        Cliente c = abmCliente.traer(1);
        Contacto con = c.getContacto();
        System.out.println(con);
    }
}
