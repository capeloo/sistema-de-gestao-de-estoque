import java.util.ArrayList;
import java.util.List;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	private List<Categoria> categorias;
	private Fornecedor fornecedor;
	
	private static int IdProduto = 1;
	
	public Produto (String nome, double preco, int quantidadeEstoque, Fornecedor fornecedor) {
		this.id = IdProduto++;
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categorias = new ArrayList<>();
		this.fornecedor = fornecedor;
	}

	// Método estático para criar um produto genérico
	public static Produto criarProdutoGenerico() {
		return new Produto("Produto Genérico", 5.00, 50, new Fornecedor());
	}
	public void adicionarCategoria(Categoria categoria) {
		categorias.add(categoria);
	}
	
	public List<Categoria> getCategorias(){
		return categorias;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int get_id() {
		return id;
	}
	
	public void reduzirEstoque(int quantidade) {
		if(quantidade <= quantidadeEstoque) {
			this.quantidadeEstoque -= quantidade;
			System.out.println("Estoque de " + nome + " atualizado. Quantidade restante: " + quantidadeEstoque);

		} else {
			System.out.println("Estoque insuficiente para " + nome);
		}
	}
	public boolean verificarEstoque(int quantidade) {
		return quantidade <= quantidadeEstoque;
	}
}
