package test;

import datos.Cliente;
import negocio.ClienteABM;
import negocio.ContactoABM;

public class TestAgregarContacto {
    public static void main(String[] args) {
        ClienteABM abmCliente = new ClienteABM();
        long idCliente = 4;
        Cliente cliente = abmCliente.traer(idCliente);
        System.out.println(cliente);
        ContactoABM abmContacto = new ContactoABM();
        abmContacto.agregar("prueba@unla.edu.ar", "11-1111-1111", "011-1111-1111", cliente);
        System.exit(0);
    }

}
