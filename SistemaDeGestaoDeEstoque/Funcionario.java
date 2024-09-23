public class Funcionario extends Usuario {
	private Double salario;
	private String cargo;
	public static Integer totalFuncionarios;
	
	public Funcionario(Integer ID, String nome, String email, Double salario, String cargo) {
		this.ID = ID;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
		this.cargo = cargo;
	}

	@Override
	protected void getDados() {}
	
	public static void setTotalFuncionarios(Integer totalFuncionarios) {
		Funcionario.totalFuncionarios = totalFuncionarios;
	};
	
	public String toString() {
		return "É o funcionario " + this.nome + " de e-mail " + this.email;
	}
}
