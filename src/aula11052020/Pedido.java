package aula11052020;

import java.util.ArrayList;

public class Pedido {
	private int numero;
	private ArrayList<ItemPedido> itensPedido = new ArrayList<ItemPedido>();

	public Pedido(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void adicionarItem(ItemPedido itensPedido) {
		this.itensPedido.add(itensPedido);
	}

	public ArrayList<ItemPedido> getItensPedido() {
		return this.itensPedido;
	}
}