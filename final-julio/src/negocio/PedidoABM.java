package negocio;

import dao.PedidoDao;
import datos.Pedido;
import datos.Producto;

public class PedidoABM {
    private static PedidoABM instancia;	
	private PedidoDao dao = PedidoDao.getInstancia();
		
	public static PedidoABM getInstancia() {
		if(instancia == null) {
			instancia = new PedidoABM();
		}
		return instancia;
	}

	public Pedido traerPedido(Producto producto) {
		return dao.traerPedido(producto);
	}    
}

