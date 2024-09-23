
public class App {

	public static void main(String[] args) {
		Funcionario caio = new Funcionario(0, "Caio Capêlo", "caiocapelo@alu.ufc.br", null, null);
		Cliente matheus = new Cliente(0, "Matheus Alvino", "mateuzim@alu.ufc.br");
		
		System.out.println(caio.toString());
		System.out.println(matheus.toString());
	}

}
