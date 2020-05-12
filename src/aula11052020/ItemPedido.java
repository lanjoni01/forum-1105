package aula11052020;

public class ItemPedido {
	private double quantidade;
	private double preco;
	private Produto produto;

	public ItemPedido(Produto produto, double quantidade, double preco) {

		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public double getQuantidade() {
		return this.quantidade;
	}

	public double getPreco() {
		return this.preco;
	}

	public Produto getProduto() {
		return this.produto;
	}

}
