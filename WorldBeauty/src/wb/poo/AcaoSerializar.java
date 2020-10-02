package wb.poo;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AcaoSerializar {
	

	public List<Cliente> clientes = new ArrayList<>();

	public void save() throws Exception {
		String caminho = "/home/henrique/cadastros.txt";

		FileOutputStream canal = new FileOutputStream(caminho);
		ObjectOutputStream escritor = new ObjectOutputStream(canal);
		
		escritor.writeObject(clientes);
		escritor.close();
		
		System.out.println("Cadastros de clientes salvo com sucesso!");
		
	}
	
}
