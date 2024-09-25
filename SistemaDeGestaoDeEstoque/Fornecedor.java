
public class Fornecedor extends PJ {
	protected Integer ID;
	private  String cnpj;

	public Fornecedor(String razao_social, String cpnj){
		this.razao_social = razao_social;
		this.cpnj = cpnj;
	}
	
	@Override
	public void getDados() {
		return "Fornecedor: " + razao_social + ", CNPJ: " + cnpj;
	}

}
