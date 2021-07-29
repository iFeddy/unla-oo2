package test;

import java.time.LocalDate;

import negocio.AlmacenABM;
import negocio.PedidoABM;
import negocio.ProductoABM;

public class TestParcial {
    public static void main(String[] args) {
        
        ProductoABM productoABM = new ProductoABM();
        AlmacenABM almacenABM = new AlmacenABM();
        PedidoABM pedidoABM = new PedidoABM();
        
        System.out.println("1) Traer producto codigo = 001");
        System.out.println("------------------------------");
        System.out.println(productoABM.traerProducto("001"));

        System.out.println("2) Traer Almacen para el producto codigo=001");
        System.out.println("------------------------------");
        System.out.println(almacenABM.traerAlmacen(productoABM.traerProducto("001")));

        System.out.println("3) Calcular los productos existentes en el Almacen para el producto codigo=001");
        System.out.println("------------------------------");
        System.out.println(almacenABM.traerAlmacen(productoABM.traerProducto("001")).cantProductosExistentes());

        System.out.println("4) Traer Pedido para el producto codigo=001");
        System.out.println("------------------------------");
        System.out.println(pedidoABM.traerPedido(productoABM.traerProducto("001")));

        System.exit(0);
    }
}
