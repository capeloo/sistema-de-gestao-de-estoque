public class Filial extends PJ {
	protected Integer ID;
	protected String endereco;

	public Filial(String razao_social, String endereco){
		this.razao_social = razao_social;
		this.endereco = endereco;
	}

	@Override
	public void getDados() {
		return "Filial: " + razao_social + ", Endereço: " + endereco;
	}

}
