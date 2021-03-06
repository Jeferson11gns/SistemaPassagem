package sistema.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sistema.model.Cidade;
import sistema.model.Onibus;
import sistema.model.Passagem;
import sistema.model.Poltrona;
import sistema.model.Rota;
import sistema.model.pessoa.Administrador;
import sistema.model.pessoa.Funcionario;
import sistema.model.pessoa.Passageiro;

public class Principal {
	
	public static void main(String[] args) {
		//tudo feito aqui é para teste de como seria a tela incial
		
		Scanner in = new Scanner(System.in);
		
		
		//Objetos padroes
		
		
		
		
		//fim
		
		List<Passageiro> listaPassageiros = new ArrayList<Passageiro>();
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		
		List<Cidade> listaCidades = new ArrayList<Cidade>();
		List<Onibus> listaOnibus = new ArrayList<Onibus>();
		List<Passagem> listaPassagens = new ArrayList<Passagem>();
		List<Rota> listaRotas = new ArrayList<Rota>();
		
		Administrador adm = new Administrador();
		adm.setNome("anderson");
		adm.setCpf("000.000.000-00");
		adm.setLogin("admin");
		adm.setSenha("admin");
		Funcionario func = new Funcionario();
		func.setNome("Joaozinho");
		func.setCpf("000.001.000-11");
		//func.addFuncionario(func);
		listaFuncionarios.add(func);
	
		
		
		int opcaoMenu;
		int opcaoAdm;
		int menuFunc;
		String opmenu;
		
		boolean entrouFunc = true;
		boolean entrouAdm = false;
		boolean fimDoPrograma = false;
	
		do {
			
			System.out.println("################################");
			System.out.println("######       Menu      #########");
			System.out.println("################################");
			System.out.println("1- Entrar como Adminstrador\n" +
								"2- Entrar como Funcionario\n"+ 
								"3- Fechar programa");
			try {
				opcaoMenu = Integer.parseInt(in.nextLine());
			}
			catch(NumberFormatException e) {
				opcaoMenu = 4;
			}
		
			if(opcaoMenu == 1) { 
				
				 do{
					
					 System.out.println("\n################################");
						System.out.println("######  Administrador  #########");
						System.out.println("################################\n");
					
					System.out.print("Login: ");
					String user = in.nextLine();
					
					System.out.print("Senha: ");
					String senha = in.nextLine();
					
					if(user.equals(adm.getLogin()) && senha.equals(adm.getSenha())) {
						entrouAdm = true;
					} else {
						System.out.println("Senha ou Login incorretos.");
					}
					
				 } while(!entrouAdm);	
					
				 while(entrouAdm) {
						
						
					System.out.println("\n################################");
					System.out.println("######  Administrador  #########");
					System.out.println("################################\n");
					
					System.out.println("######  Relacionado ao Funcionario  #########\n");
					System.out.println("1 - Adicionar Funcionario\n" +
							"2 - Remover Funcionario\n"+
							"3 - Listar Funcionarios\n"+ 
							"4 - Atualizar Funcionario\n\n");
							
					System.out.println("######  Relacionado a Rota  #########\n");
							
					System.out.println("5 - Adicionar rota\n" +
							"6 - Remover rota\n" +
							"7 - Ver Lista de Rotas\n" +
							"8 - Voltar para o Menu Inicial");
					try {
						opcaoAdm = Integer.parseInt(in.nextLine());
					}
					catch(NumberFormatException e) {
						opcaoAdm = 9;
					}
					
					
					if(opcaoAdm == 1) {
						
						listaFuncionarios.add(new Funcionario());
						listaFuncionarios.get(listaFuncionarios.size()-1).addFuncionario(listaFuncionarios);
						
					} else if(opcaoAdm == 2) {
						System.out.println("Digite o cpf do Funcionário que deseja remover:");
						String cpf = in.nextLine();
						
						listaFuncionarios.get(listaFuncionarios.size()-1).removerFuncionario(cpf, listaFuncionarios);
						System.out.println("Pressione qualquer tecla para continuar");
						opmenu = in.nextLine();
						
						
					} else if(opcaoAdm == 3) {
						
						for(Funcionario x: listaFuncionarios) {
							System.out.println(x);
						}
						System.out.println("Pressione qualquer tecla para continuar");
						opmenu = in.nextLine();
					} else if(opcaoAdm == 4) {
						
						System.out.println("Digite o cpf do Funcionário que deseja atualizar: ");
						String cpf = in.nextLine();
						
						listaFuncionarios.get(listaFuncionarios.size()-1).atualizarFuncionario(cpf, listaFuncionarios);
						
					} else if(opcaoAdm == 5) {
						
						listaRotas.add(new Rota());
						
						
						System.out.println("Digite a Cidade de Origem");
						listaCidades.add(new Cidade());
						listaCidades.get(listaCidades.size()-1).addCidade(listaCidades);
						
						//colocando os objetos de cidade de origem na rota
						listaRotas.get(listaRotas.size()-1).setOrigem(listaCidades.get(listaCidades.size()-1));
						
						
						System.out.println("Digite a Cidade de Destino");
						listaCidades.add(new Cidade());
						listaCidades.get(listaCidades.size()-1).addCidade(listaCidades);
						
						//colocando os objetos de cidade de destino na rota
						listaRotas.get(listaRotas.size()-1).setDestino(listaCidades.get(listaCidades.size()-1));

						
						listaRotas.get(listaRotas.size()-1).addRota(listaRotas);
						

						
						listaOnibus.add(new Onibus());
						listaOnibus.get(listaOnibus.size()-1).addOnibus(listaOnibus);
						
						
						
						//criar passagem equivalente cada poltrona
						for(int i = 0; i < listaOnibus.get(listaOnibus.size()-1).getQtdePoltronas(); i++) {
							listaPassagens.add(new Passagem());
						}
						
						
						//preencher poltronas
						listaOnibus.get(listaOnibus.size()-1).preencherPoltronas(listaPassagens);
						
						
						//colocando o onibus na rota
						listaRotas.get(listaRotas.size()-1).setOnibus(listaOnibus.get(listaOnibus.size()-1));
						
						
						//preendchendo a passagem
						listaPassagens.get(listaPassagens.size()-1).setRota(listaRotas.get(listaRotas.size()-1));
					
						
					} else if(opcaoAdm == 6) {
						
						System.out.println("Digite a Cidade de Origem da Rota a ser removida: ");
						String cidadeOrigem = in.nextLine();
						
						System.out.println("Digite a Cidade de Destino da Rota a ser removida: ");
						String cidadeDestino = in.nextLine();
						
						listaRotas.get(listaRotas.size()-1).removerRota(cidadeOrigem, cidadeDestino, listaRotas);
						
					} else if(opcaoAdm == 7) {
						
						for(Rota x: listaRotas) {
							System.out.println(x);
						}
						System.out.println("Pressione qualquer tecla para continuar");
						opmenu = in.nextLine();
						
					} else if(opcaoAdm == 8) {
						entrouAdm = false;
						
						
					} else {
						System.out.println("Opção inválida, selecione uma opção válida");
					}
					
					
							
				} 
			
				
				
			} else if(opcaoMenu == 2) {
				
				do {
					System.out.println("\n################################");
					System.out.println("######  Funcionário     #########");
					System.out.println("################################\n");
					System.out.println("1 - Vender Passagem\n" +
										"2 - Voltar ao menu inicial");
					try {
						menuFunc = Integer.parseInt(in.nextLine());
					} catch(NumberFormatException e) {
						menuFunc = 3;
					}
					
					if(menuFunc == 1) {
					
						System.out.println("##################################");
						System.out.println("###### Vender Passagem ##########");
						System.out.println("##################################");
						
						
						System.out.print("Cidade de Origem: ");
						String cidadeOrigem = in.nextLine();
						
						System.out.print("Cidade de Destino: ");
						String cidadeDestino = in.nextLine();
						
						if(listaRotas.isEmpty()) {
							System.out.println("Rota nao existe");
							System.out.println("Pressione qualquer tecla para continuar...");
							String qualquer = in.nextLine();
							continue;
						}
						
						boolean foiCerto = listaRotas.get(listaRotas.size()-1).buscarRota(cidadeOrigem, cidadeDestino, listaRotas);
						
						String horario;
						if(foiCerto) {
							System.out.print("Digite o horário de partida: ");
							horario = in.nextLine(); 
						}else {
							System.out.println("Entre de novo e Digite uma rota valida");
							String a = in.nextLine();
							continue;
						}
						
						//arrumar para nao deixar nenhum codigo de onibus ser o
						int idOnibus = 0;
						Rota contr = new Rota();
						
						int controleHora = 1;
						for(Rota x: listaRotas) {
							if(x.getHorario().equals(horario)) {
								idOnibus = x.getOnibus().getCodigoBus();
								contr = x;
								controleHora = 0;
							}
						}
							
							if(controleHora == 1) {
								System.out.println("Horario Invalido");
								System.out.println("Pressione qualquer tecla para continuar...");
								String qualquer = in.nextLine();
								continue;
							}
					
						

						boolean taVazia = contr.getOnibus().poltronasVazias(idOnibus, listaOnibus);
						
						if(taVazia) {
							
							System.out.println("##################################");
							System.out.println("###### Dados do Passageiro ##########");
							System.out.println("##################################");
							
							System.out.println("Digite o número da Poltrona: ");
							int cadeira = Integer.parseInt(in.nextLine());
							

							Poltrona teste = contr.getOnibus().pegarPoltrona(cadeira);
							if(teste == null) {
								System.out.println("Cadeira invalida");
								continue;
							}
							teste.mudaStatus(cadeira);
							

							
							listaPassageiros.add(new Passageiro());
							listaPassagens.add(new Passagem());
							
							listaPassageiros.get(listaPassageiros.size()-1).addPassageiro(listaPassageiros);
							
							//adcionar passageiro a passagem
							listaPassagens.get(listaPassagens.size()-1).setPassageiro(listaPassageiros.get(listaPassageiros.size()-1));
							listaPassagens.get(listaPassagens.size()-1).setValida(true);	

						
							//System.out.println("-->" + listaPassagens.get(listaPassagens.size()-1));
						}	
					
					} else if(menuFunc == 2) {
						entrouFunc = false;
					} else {
						System.out.println("Opção inválida, digite uma opção válida");
					}
					
				} while (entrouFunc);	
		
			
			} else if(opcaoMenu == 3) {
				fimDoPrograma = true;

			} else {
				System.out.println("Opção inválida, digite uma opção válida");
			}
		

		
		}while(!fimDoPrograma); 
			
		

	
	
	
	
	
	
	}

}
