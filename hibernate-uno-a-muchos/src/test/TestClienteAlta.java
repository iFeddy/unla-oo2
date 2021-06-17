package test;

import java.time.LocalDate;

import negocio.ClienteABM;

public class TestClienteAlta {
    public static void main(String[] args) {
        ClienteABM cAbm = new ClienteABM();

        int id = cAbm.agregar("apellido", "nombre", 400000, LocalDate.now());
        System.out.print("Se creo el user con ID:" + id);
        
        System.exit(0);
    }
}
