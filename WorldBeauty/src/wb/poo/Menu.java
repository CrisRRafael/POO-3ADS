package wb.poo;

public class Menu {
	public static void menuPrincipal() {
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("  Digite a opções desejada");
		System.out.println(" 1. Cadastrar cliente ");
		System.out.println(" 2. Editar cadastro do cliente");
		System.out.println(" 3. Excluir cadastro do cliente");
		System.out.println(" 4. Listar clientes");
		System.out.println(" 5. Cadastrar serviço");
		System.out.println(" 6. Relatórios");
		System.out.println(" 7. Serializar");
		System.out.println(" 0. Para sair");
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}

	public static void menuInicial() {
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("Informe o codigo da Unidade deseja");
		System.out.println("1 - Matriz ");
		System.out.println("2 - Filial ");
		System.out.println("0 - Sair ");
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%");		
	}

	public static void menuEditar() {
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("Digite a op��o desejada");
		System.out.println("1. Alterar nome do cliente");
		System.out.println("2. Alterar telefone do cliente");
		System.out.println("3. Alterar Data de Nascimento do cliente");
		System.out.println("4. Alterar gen�ro do cliente");
		System.out.println("0. Voltar ao menu principal");
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}
	
	public static void menuListar() {
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("  Digite a op��o desejada");
		System.out.println(" 1. Listar todos os  cliente. ");
		System.out.println(" 2. Listar clientes por gen�ro(F/M).");
		System.out.println(" 3. Listar servi�os de um determinado cliente.");
		System.out.println(" 0. Voltar ao Menu Principal.");
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}
	
	
	public static void menuServicos() {
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("  Digite a op��o do servi�o desejado");
		System.out.println(" 1. Manicure . ");
		System.out.println(" 2. Pedicure.");
		System.out.println(" 3. Design de sombrancelhas.");
		System.out.println(" 4. Corte de cabelo Feminino.");
		System.out.println(" 5. Tintura.");
		System.out.println(" 6. Remo��o de rugas.");
		System.out.println(" 7. Remo��o de manchas de pele.");
		System.out.println(" 8. Aplica��o de botox.");
		System.out.println(" 9. Tratamento de Emagrecimento .");
		System.out.println(" 10. Redu��o de medidas.");
		System.out.println(" 11. Corte de cabelo Masculino.");
		System.out.println(" 12. Modelagem/corte de barba.");
		System.out.println(" 13. Tratamento para queda de cabelo.");
		System.out.println(" 0 . Voltar Menu Principal.");
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			
	}
	
	public static void menuRelatorios() {
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("  Digite a op��o de relatorio desejado");
		System.out.println(" 1. Idade m�dia de todo o p�blico");
		System.out.println(" 2. Idade m�dia do p�blico por g�nero.");
		System.out.println(" 3. Servi�o mais procurado para todo o p�blico.");
		System.out.println(" 4. Servi�o mais procurado por gen�ro.");
		System.out.println(" 0. Voltar Menu Principal. ");
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}
	
	
	
}
