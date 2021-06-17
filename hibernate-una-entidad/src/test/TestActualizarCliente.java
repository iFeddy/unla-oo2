package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestActualizarCliente {
    public static void main(String[] args) {
        ClienteABM abm = new ClienteABM();
        long id = 3;
        // traer el obj a modificar
        Cliente c = abm.traer(id); //metodo con long
        System.out.println("Cliente a Modificar -->" + c);
        // modificar por set los atributos
        
        c.setDni(35000000);
        
        try {
            abm.modificar(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 

        int dni = 35000000;
        Cliente cModif = abm.traer(dni); //metodo con int
        System.out.println("Cliente Modificado -->" + cModif);
    }
}
