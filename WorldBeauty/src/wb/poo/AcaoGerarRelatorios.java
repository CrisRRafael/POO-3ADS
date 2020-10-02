package wb.poo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AcaoGerarRelatorios {
	public Lojas unidade;

	public AcaoGerarRelatorios(Lojas unidade) {
		this.unidade = unidade;
	}
	
	public void GerarRelatorios() {
		 
		int opcao=20;		
		Controle controle = new Controle();
		
		
			
			do {
				Menu.menuRelatorios();
				opcao = controle.opcao();								
				if (unidade.clientes.size() != 0) {
					Cliente cliente = new Cliente();
					int totalIdades =0;
					
				
									
					
					switch(opcao) {
					
					case 1:
						for(int i = 0; i < unidade.clientes.size(); i++){
							cliente = unidade.clientes.get(i);
							int idade = AcaoCalcularIdade.calcIdade(cliente.dataDeNascimento);
							totalIdades += idade;	}
						int mediaIdades = totalIdades/(unidade.clientes.size());
						System.out.println("A idade média dos clientes é de :" + mediaIdades+" anos.");
					break;
			
					case 2:
						int contadorClientes= 0;
						String definicaoGenero = "";
						System.out.println("Digite o gênero (F/M): ");
						definicaoGenero = controle.texto().toLowerCase();
						int idadeGenero= 0;
						for(int i = 0; i < unidade.clientes.size(); i++) {
							cliente = unidade.clientes.get(i);
							if(cliente.genero.toLowerCase().equals(definicaoGenero)) {
								int idade = AcaoCalcularIdade.calcIdade(cliente.dataDeNascimento);
								idadeGenero += idade;
								contadorClientes++;}
							if(contadorClientes != 0) {
								int total =idadeGenero / (unidade.clientes.size());
								System.out.println("A média de Idade para o genêro"+ definicaoGenero+ " é de :"+ total+ "anos");
								}
							else {
								System.out.println("Não possuem clientes do genêro."+definicaoGenero +"Cadastrados");
								
							}
						}
						break;
			
					case 3:
						
						/*List<String> lista2 = new ArrayList<>();
											for(i = 0; i < u.agenda.size(); i++) {
												c = u.agenda.get(i);
												lista2.addAll(c.servicosCli);*/
						List<String> myList = new ArrayList<String>();
				          /*	{
				        		add("Manicure");
				        		add("Pedicure");
				        		add("Design de sombrancelhas");
				        		add("Corte de cabelo Feminino");
				        		add("Tintura");
				        		add("Remoção de rugas");
				        		add("Manicure");
				        		add("Aplicação de botox.");
				        		add("Tratamento de Emagrecimento");
				        		add("Redução de medidas");
				        		add("Corte de cabelo Masculino");
				        		add("Manicure");
				        		add("Tintura");
				            }

				};*/
					if(unidade.clientes.size() !=0) {
						for(int i =0; i < unidade.clientes.size();i++) {
							cliente = unidade.clientes.get(i);
							String servico = cliente.servicos.toString();
							myList.add(servico);
							
							//listaServico.add(cliente);		
						//}
					//}
					
					Set<String> uniqueSet = new HashSet<String>(myList);  
				    for (String a : uniqueSet) {  
				        System.out.println(a + ": " + Collections.frequency(myList,a)); 
				    }
						}
					}
						
						break;
			
					case 4:
						System.out.println("opcao 4");
						break;
			
			
			}
				}
				else{
					System.out.println("Não há clientes cadastrados");
					
				}
			}while(opcao!=0);
			
			
			}
			}
	



