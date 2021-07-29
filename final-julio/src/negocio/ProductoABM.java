package negocio;

import dao.ProductoDao;
import datos.Producto;

public class ProductoABM {
    private static ProductoABM instancia;	
	private ProductoDao dao = ProductoDao.getInstancia();
		
	public static ProductoABM getInstancia() {
		if(instancia == null) {
			instancia = new ProductoABM();
		}
		return instancia;
	}

    public Producto traerProducto(String codigo) {
        return dao.traerProducto(codigo);
    }    
}

