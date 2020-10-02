package wb.poo;

import java.util.List;
//import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Comparable<Cliente> {
	public String nome;
		public String telefone;
	public String dataDeNascimento;
	public String genero;
	public List<Servicos> servicos = new ArrayList<>();
	
	
	public String getNome() {
		return nome;
	}
	
	
	@Override
	public String toString() {
		String delimitador = "%%%%%%%%%%%%%%%%%%%%%%%%";
		String info = "Nome: " + nome + "\nTelefone: " + telefone + "\nData de Nascimento: " 
		+ dataDeNascimento + "\nGênero: " + genero;
		return "\n" + delimitador + "\n" + info + "\n" + delimitador + "\n";
			}


	@Override
	public int compareTo(Cliente other) {	
		
		return nome.compareTo(other.nome);
	}
	}
	


