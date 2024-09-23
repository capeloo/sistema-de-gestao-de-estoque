public class Cliente extends Usuario {

	public Cliente(Integer ID, String nome, String email) {
		this.ID = ID;
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
}
