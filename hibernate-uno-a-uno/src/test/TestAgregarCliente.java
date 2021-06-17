package test;

import java.time.LocalDate;

import datos.Cliente;
import negocio.ClienteABM;

public class TestAgregarCliente {
    public static void main(String[] args) {
        ClienteABM abmCliente = new ClienteABM();    
        LocalDate fechaDeNacimiento = LocalDate.of(2015, 4, 25); 
        Cliente cliente = new Cliente("Ana", "Jaramillo", 40000000, fechaDeNacimiento); 
        abmCliente.agregar(cliente);  
        System.out.println(cliente);     
        System.exit(0); //Sino se queda colgado hibernate
    }
}
