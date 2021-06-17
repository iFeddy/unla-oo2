package test;

import negocio.ClienteABM;
import negocio.EventoABM;

public class TestAgregarEventoACliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ClienteABM clienteABM = ClienteABM.getInstancia();
			EventoABM eventoABM = EventoABM.getInstancia();
			
			
			clienteABM.agregarEvento(eventoABM.traerEvento(3), clienteABM.traerCliente(3));
			
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
