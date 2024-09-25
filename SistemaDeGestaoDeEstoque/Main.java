public class Main {

	public static void main(String[] args) {
		Cliente Alejandro = new Cliente("Bruno Alejandro", "brunim_ale@gmail.com");
		Filial Parquelândia = new Filial();
		Fornecedor Amazon = new Fornecedor();
		Funcionario Matuê = new Funcionario("Matheus Brasileiro", "matheuzim420@gmail.com", 2000.00, "Caixa");
		Estoque estoque = new Estoque();

		Produto farinha = new Produto("Farinha Dona Benta", 8.00, 10, Amazon);
		Produto feijao = new Produto("Feijão Carioca", 10.00, 6, Amazon);

		estoque.adicionarProduto(farinha);
		estoque.adicionarProduto(feijao);

		Venda venda = new Venda("24/09/2024", Alejandro, Parquelândia, Matuê, estoque);
		venda.adicionarProduto("Farinha Dona Benta", 2);
		venda.adicionarProduto("Feijão Carioca", 3);

		venda.finalizarVenda();
		System.out.println("Valor total: " + venda.getValorTotal());

	}
}
