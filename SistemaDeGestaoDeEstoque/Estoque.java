import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Estoque {
	private Map<String, Produto> produtos;

	public Estoque () {
		this.produtos = new HashMap<>();
	}
	// Método estático para criar um estoque padrão
	public static Estoque criarEstoqueInicial(){
		Estoque estoque = new Estoque();
		Fornecedor fornecedor = new Fornecedor();
		estoque.adicionarProduto("Produto Padrão", 10.00, 100, fornecedor);
		return estoque;
	}

	public void adicionarProduto(Produto produto) {
		produtos.put(produto.getNome(), produto);
		System.out.println("Produto" + produto.getNome() + "adicionado com sucesso");
	}

	public Produto getProduto(String nome) {
		return produtos.get(nome);
	}

	public boolean verificarDisponibilidade(String nomeProduto, int quantidade) {
		Produto produto = produtos.get(nomeProduto);
		if(produto != null && produto.verificarEstoque(quantidade)) {
			System.out.println("Produto Disponivel");
			return true;
		}
		System.out.println("Produto Indisponivel");
		return false;
	}

	public void reduzirProdutoEstoque(String nomeProduto, int quantidade) {
		Produto produto = produtos.get(nomeProduto);
		if(produto != null) {
			produto.reduzirEstoque(quantidade);
			System.out.println("Estoque de " + nomeProduto + " reduzido em " + quantidade + " unidades.");
		}else {
			System.out.println("Produto " + nomeProduto + " não encontrado no estoque.");
		}
	}
}
