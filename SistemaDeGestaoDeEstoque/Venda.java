import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	private int ID;
	private String data;
	private double valorTotal;
	private List<Produto> produtos;
	private Cliente cliente;
	private Filial filial;
	private Funcionario funcionario;
	private Estoque estoque;
	
	private static int idVenda = 1; 
	
	public Venda(String data, Cliente cliente, Filial filial, Funcionario funcionario, Estoque estoque) {
		this.ID = idVenda++; 
		this.data = data;
		this.cliente = cliente;
		this.filial = filial;
		this.funcionario = funcionario;
		this.estoque = estoque;
		this.produtos = new ArrayList<>();
		this.valorTotal = 0.0;
	}
	
	public void adicionarProduto(String nomeProduto, int quantidade) {
		if(estoque.verificarDisponibilidade(nomeProduto, quantidade)) {
			Produto produto = estoque.getProduto(nomeProduto);
			produtos.add(produto);
			valorTotal += produto.getPreco() * quantidade;
			estoque.reduzirProdutoEstoque(nomeProduto, quantidade);
		} else {
			System.out.println("Não há estoque suficiente para o produto: " + nomeProduto);
		}
	}
	
	public void finalizarVenda() {
		System.out.println("Venda finalizada para o cliente: " + cliente.getNome());
		System.out.println("Data: " + data);
		System.out.println("Valor total da venda: " + valorTotal);
		System.out.println("Produtos vendidos: ");
		for(Produto produto : produtos) {
			System.out.println("- " + produto.getNome());
		}
	}
	
	public double getValorTotal() {
		return valorTotal;
	}	
}
