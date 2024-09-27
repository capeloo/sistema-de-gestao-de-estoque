import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoque {
	private Map<String, Produto> produtos;
	
	public Estoque () {
		this.produtos = new HashMap<>();
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.put(produto.getNome(), produto);
	}

	public Produto getProduto(String nome) {
		return produtos.get(nome);
	}
	
	public boolean verificarDisponibilidade(String nomeProduto, int quantidade) {
		Produto produto = produtos.get(nomeProduto);
		if(produto != null && produto.verificarEstoque(quantidade)) {
			return true;
		}
		return false;
	}
	
	public void reduzirProdutoEstoque(String nomeProduto, int quantidade) {
		Produto produto = produtos.get(nomeProduto);
		if(produto != null) {
			produto.reduzirEstoque(quantidade);
		}
	}
}
