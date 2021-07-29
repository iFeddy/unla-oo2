package negocio;

import dao.AlmacenDao;
import datos.Almacen;
import datos.Producto;

public class AlmacenABM {
    private static AlmacenABM instancia;	
	private AlmacenDao dao = AlmacenDao.getInstancia();
		
	public static AlmacenABM getInstancia() {
		if(instancia == null) {
			instancia = new AlmacenABM();
		}
		return instancia;
	}

	public Almacen traerAlmacen(Producto producto) {
		return dao.traerAlmacen(producto);
	}    
}

