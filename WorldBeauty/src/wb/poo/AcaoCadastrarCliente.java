package wb.poo;

public class AcaoCadastrarCliente {
	public Lojas unidade;

	public AcaoCadastrarCliente(Lojas unidade) {
		this.unidade = unidade;
	}	
	
	public void cadastrarCliente() {
		Controle controle =new Controle();
		Cliente cliente = new Cliente();
		System.out.println("Digite o nome do cliente: ");
		cliente.nome = controle.texto().toUpperCase();
		System.out.println("Digite o número do telefone: ");
		cliente.telefone = controle.texto();
		System.out.println("Digite a data de nascimento: DD/MM/AAAA ");
		cliente.dataDeNascimento = controle.texto();
		System.out.println("Digite o Genêro: F/M ");
		cliente.genero = controle.texto().toUpperCase();
		while (!(cliente.genero.equals("M") || cliente.genero.equals("F"))) {
			System.out.println("\nGênero deverá ser M ou F");
			System.out.print("Digite o genero (M/F): ");
			cliente.genero = controle.texto().toUpperCase();
		}
		unidade.clientes.add(cliente);
	}
	

}
