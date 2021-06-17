package negocio;

import java.time.LocalDate;

import dao.ClienteDao;
import datos.Cliente;
import datos.Contacto;

public class ClienteABM {
    ClienteDao dao = new ClienteDao();

    public Cliente traer(long idCliente) {
        Cliente c = dao.traer(idCliente);
        return c;
    }

    //Agregar Clase Cliente
    public int agregar(Cliente cliente){
        return dao.agregar(cliente);
    }

    //Agregar sin Contacto
    public int agregar(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento) {
        Cliente c = new Cliente(apellido, nombre, dni, fechaDeNacimiento);
        return dao.agregar(c);
    }

    //Agregar con Contacto
    public int agregar(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento, Contacto contacto ) {
        Cliente c = new Cliente(apellido, nombre, dni, fechaDeNacimiento, contacto);
        return dao.agregar(c);
    }

    public void modificar(Cliente c) {
        dao.actualizar(c);
    }

    public void eliminar(long idCliente) {
        Cliente c = dao.traer(idCliente);
        dao.eliminar(c);
    }
}
