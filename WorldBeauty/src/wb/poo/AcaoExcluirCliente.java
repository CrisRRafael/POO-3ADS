package wb.poo;

public class AcaoExcluirCliente {
	
	Lojas unidade;

	public AcaoExcluirCliente(Lojas unidade) {
		this.unidade = unidade;
	}
	
	public void excluirCliente() {
		Controle controle = new Controle();
		
		System.out.println("Digite o Nome do cliente que deseja excluir: ");
		String cliExcluir = controle.texto().toUpperCase();
		
		if (unidade.clientes.size() != 0) {
		
		for (Cliente definicaoCliente : unidade.clientes) {
			if (definicaoCliente.nome.equals(cliExcluir)) {
				unidade.clientes.remove(definicaoCliente);
				System.out.println(cliExcluir + " foi removido!");
		
	}else {
		System.out.println("Cliente não cadastrado");
	}

}
}else {
	System.out.println("Sem cadastros de cliente");
}
}
	
}
