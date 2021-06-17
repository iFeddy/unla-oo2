package test;

import java.time.LocalDate;
import negocio.ClienteABM;

public class TestAgregarCliente {
    public static void main(String[] args) {
        String apellido = "Perez";
        String nombre = "Federico";
        int documento = 35000000;
        LocalDate fechaDeNacimiento = LocalDate.now();
        ClienteABM abm = new ClienteABM();
        long ultimoIdCliente = abm.agregar(apellido, nombre, documento, fechaDeNacimiento);
        System.out.println(ultimoIdCliente);	
    }

}
