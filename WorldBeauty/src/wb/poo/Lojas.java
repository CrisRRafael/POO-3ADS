package wb.poo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Lojas implements Serializable {
	
	public int codigoDaLoja;
	public String nomeDaLoja;	
	public List<Cliente> clientes = new ArrayList<>();
	

}
