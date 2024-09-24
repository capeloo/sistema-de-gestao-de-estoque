public class Cliente extends Usuario {
	private static int idCliente = 0;

	public Cliente(String nome, String email) {
		this.id = idCliente++;
		this.nome = nome;
		this.email = email;
	}

	@Override
	protected void getDados() {
		//TODO
	}
	
	public String toString() {
		return "É o cliente " + this.nome + " de e-mail " + this.email;
	}
	
	public String getNome() {
		return nome;
	}
}
