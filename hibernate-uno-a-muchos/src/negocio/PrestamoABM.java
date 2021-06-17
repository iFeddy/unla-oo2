package negocio;

import dao.PrestamoDao;
import java.time.LocalDate;
import java.util.List;
import datos.Cliente;
import datos.Prestamo;

public class PrestamoABM {
    private PrestamoDao dao = new PrestamoDao();

    public Prestamo traerPrestamo(long idPrestamo) throws Exception{
        // Implementar: si el no existe el prestamo lanzar la excepción
        Prestamo p = dao.traer(idPrestamo);
        if(p == null) throw new Exception("El id de Prestamo no Existe");
        return p;
    }

    public List<Prestamo> traerPrestamo(Cliente c) throws Exception {
        List<Prestamo> prestamos = dao.traer(c);
        if(prestamos.size() == 0) throw new Exception("No tiene prestamos"); 
        //No deberia ser Excepcion, si no tiene prestamos no es un error
        return dao.traer(c);
    }

    /*
     * Pendiente implementar Alta, Modificar
     */

    public int agregar(LocalDate fecha, double monto, double intereses, int cantCuotas, Cliente cliente) {
        Prestamo p = new Prestamo(fecha, monto, intereses, cantCuotas, cliente);
        return dao.agregar(p);
    }

    public void modificar(Prestamo c) {
        dao.actualizar(c);
    }

}