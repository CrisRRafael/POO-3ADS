package wb.poo;

import java.util.List;
import java.util.Map;
//import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Cliente implements Comparable<Cliente> {
	
	public String nome;
	public String telefone;
	public String dataDeNascimento;
	public String genero;
	public List<Servicos> servicos = new ArrayList<>();
	
	public Map<String, Integer> serv = new HashMap<>();
	
	public String getNome() {
		return nome;
	}
	
	
	@Override
	public String toString() {
		String delimitador = "%%%%%%%%%%%%%%%%%%%%%%%%";
		String info = "Nome: " + nome + "\nTelefone: " + telefone + "\nData de Nascimento: " 
		+ dataDeNascimento + "\nG�nero: " + genero;
		return "\n" + delimitador + "\n" + info + "\n" + delimitador + "\n";
			}


	@Override
	public int compareTo(Cliente other) {	
		
		return nome.compareTo(other.nome);
	}
	}


	


