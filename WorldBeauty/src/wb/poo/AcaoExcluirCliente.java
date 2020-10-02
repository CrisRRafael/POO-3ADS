package wb.poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AcaoExcluirCliente {
	
	Lojas unidade;
	public List<Cliente> clientes = new ArrayList<>(); 
	

	public AcaoExcluirCliente(Lojas unidade) {
		this.unidade = unidade;
		clientes = unidade.clientes;
	}
	
	public void excluirCliente() { 
		
//		Iterator<Cliente> i = clientes.iterator();
		
		Controle controle = new Controle();
		
		System.out.println("Digite o Nome do cliente que deseja excluir: ");
		String cliExcluir = controle.texto().toUpperCase();
		
//		while (i.hasNext()) {
//            Cliente atual = i.next();
//            if (atual.getNome().equals(cliExcluir)) {   
//                i.remove();
//                System.out.println("Cliente excluído");
//                
//            }
//		}
		
		for (Cliente astopho : clientes) {
			if (astopho.getNome().equals(cliExcluir)) {   
               clientes.remove(astopho);
               System.out.println("Cliente excluido");
               break;
			}
		}
		
		
		System.out.println("Rodou até aqui");

	}

}
