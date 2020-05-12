package aula11052020;

public class AppSistema {

	public static void main(String[] args) {
		Produto produtoPrimeiro = new Produto("heineken");
		Produto produtoSegundo = new Produto("chips");
		Pedido pedidoPrimeiro = new Pedido(1);
		
		ItemPedido item1 = new ItemPedido(produtoPrimeiro,10,5.99);
		ItemPedido item2 = new ItemPedido(produtoSegundo,4,2.99);
		
		pedidoPrimeiro.adicionarItem(item1);
		pedidoPrimeiro.adicionarItem(item2);
		
		for(int i=0; i< pedidoPrimeiro.getItensPedido().size(); i+=1) {
			System.out.println("Produto: "+pedidoPrimeiro.getItensPedido().get(i).getProduto()+
					           "\nQuantidade: " +pedidoPrimeiro.getItensPedido().get(i).getQuantidade()+
					           "\nPreço: "+pedidoPrimeiro.getItensPedido().get(i).getPreco());
		}
		

		}

	}

