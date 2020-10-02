package wb.poo;

public class AcaoCadastrarServico {
	public Lojas unidade;
	
	
	public AcaoCadastrarServico(Lojas unidade) {
		this.unidade = unidade;
		
	}
	
	
	public void cadastrarServico() {
		Controle controle = new Controle();
		
		int opcaoServico=20;
		 
		System.out.println("Informe o nome do cliente que deseja incluir serviço");
		String nomecliente = controle.texto().toUpperCase();
		
		if (unidade.clientes.size() != 0) {
		
		for (Cliente definicaocliente : unidade.clientes ) {
			if (definicaocliente.nome.equals(nomecliente)) {
				
				while(opcaoServico!=0) {
					Menu.menuServiços();
					opcaoServico = controle.opcao();
					Servicos consumo = new Servicos();
					
					switch(opcaoServico) {
					case 1:						
						consumo.nomeServico= "Manicure";
						definicaocliente.servicos.add(consumo);
						System.out.println("Serviço cadastrado com sucesso!");
					break;
					
					case 2:
						consumo.nomeServico= "Pedicure";
						definicaocliente.servicos.add(consumo);
						System.out.println("Serviço cadastrado com sucesso!");
					break;
					
					case 3:
						consumo.nomeServico= "Design de sombrancelha";
						definicaocliente.servicos.add(consumo);	
						System.out.println("Serviço cadastrado com sucesso!");
					break;
					
					case 4:
						consumo.nomeServico= "Corte de cabelo Feminino";
						definicaocliente.servicos.add(consumo);
						System.out.println("Serviço cadastrado com sucesso!");
					break;
					
					case 5:
						consumo.nomeServico= "Tintura";
						definicaocliente.servicos.add(consumo);
						System.out.println("Serviço cadastrado com sucesso!");
					break;
					
					case 6:
						consumo.nomeServico= "Remoção de rugas";
						definicaocliente.servicos.add(consumo);
						System.out.println("Serviço cadastrado com sucesso!");
					break;
					
					case 7:
						consumo.nomeServico= "Remoção de manchas de pele";
						definicaocliente.servicos.add(consumo);
						System.out.println("Serviço cadastrado com sucesso!");
					break;
					
					case 8:
						consumo.nomeServico= "Aplicação de botox";
						definicaocliente.servicos.add(consumo);
						System.out.println("Serviço cadastrado com sucesso!");
					break;
					
					case 9:
						consumo.nomeServico= "Tratamento de Emagrecimento";
						definicaocliente.servicos.add(consumo);
						System.out.println("Serviço cadastrado com sucesso!");
					break;
					
					case 10:
						consumo.nomeServico= "Redução de medidas";
						definicaocliente.servicos.add(consumo);
						System.out.println("Serviço cadastrado com sucesso!");
					break;
					
					case 11:
						consumo.nomeServico= "Corte de cabelo Masculino";
						definicaocliente.servicos.add(consumo);
						System.out.println("Serviço cadastrado com sucesso!");
					break;
					
					case 12:
						consumo.nomeServico= "Modelagem/corte de barba";
						definicaocliente.servicos.add(consumo);
						System.out.println("Serviço cadastrado com sucesso!");
					break;
					
					case 13:
						consumo.nomeServico= "Tratamento para queda de cabelo";
						definicaocliente.servicos.add(consumo);
						System.out.println("Serviço cadastrado com sucesso!");
						
					break;
					
					case 0:
					break;
				}
				}
			}
			
	
				else {
					System.out.println("Cliente não cadastrado");
				}

}
	}else {
		System.out.println("Sem cadastros de clientes");
	}
		
		
		
		
}
}