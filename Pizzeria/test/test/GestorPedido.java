package test;

import java.util.LinkedList;



public class GestorPedido {

  private LinkedList<Pedido> pedidos;	
  private static GestorPedido soyElGestor;
	
	public GestorPedido() {
		
	}
	
	public GestorPedido(LinkedList<Pedido> linkedList) {
		
		pedidos = new LinkedList<Pedido>();
	}

	public static GestorPedido getInstancia() {
		if(soyElGestor == null) {
			soyElGestor = new GestorPedido();
		}
		return soyElGestor;
	}
	

	public void crearPedido(Pedido factoryPedido) {
	
		this.pedidos.add(factoryPedido);
		
	}

	public LinkedList<Pedido> getColeccionPedidos() {
		return pedidos;
	}

}
