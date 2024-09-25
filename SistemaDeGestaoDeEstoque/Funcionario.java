public class Funcionario extends Usuario {
	private Double salario;
	private String cargo;
	private static int totalFuncionarios;
	private static int idFuncionario = 0;
	
	public Funcionario(String nome, String email, Double salario, String cargo) {
		this.id = idFuncionario++;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
		this.cargo = cargo;
	}

	@Override
	protected void getDados() {


	}
	
	public static void setTotalFuncionarios(Integer totalFuncionarios) {
		Funcionario.totalFuncionarios = totalFuncionarios;
	};
	
	public String toString() {
		return "É o funcionario " + this.nome + " de e-mail " + this.email;
	}
}
