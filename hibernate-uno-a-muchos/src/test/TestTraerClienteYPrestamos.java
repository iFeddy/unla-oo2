package test;

import negocio.ClienteABM;

import java.util.Set;

import datos.Cliente;
import datos.Prestamo;

public class TestTraerClienteYPrestamos {
    public static void main(String[] args) {
        long idCliente = 2;
        ClienteABM cliAbm = new ClienteABM();
        Cliente c = cliAbm.traerClienteYPrestamos(idCliente);
        System.out.println("\n---> Traer Cliente y Prestamos idCliente=" + idCliente);
        System.out.println("\n" + c);
        // implementar Si este cliente no tiene prestamos otorgados imprima el mensaje
        Set<Prestamo> cPrestamos = c.getPrestamos();
        if (cPrestamos.isEmpty()) {
            System.out.println("\n---> No Tiene Prestamos");
        } else {
            for (Prestamo p : c.getPrestamos())
                System.out.println("\n" + p);
        }

        System.exit(0);
    }
}
