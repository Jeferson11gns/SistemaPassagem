package sistema.model;

import java.util.List;
import java.util.Scanner;

import sistema.crud.CrudCidade;

public class Cidade implements CrudCidade {
	
	Scanner in = new Scanner(System.in);
	
	
	private String nome;
	private String estado;
	
	
	// Constructor
	
	public Cidade() {
	}
	
	public Cidade(String nome, String estado) {
		super();
		this.nome = nome;
		this.estado = estado;
	}
	
	// Getters and Setters
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	// Methods

	@Override
	public void addCidade(List<Cidade> cidades) {
		
		System.out.println("Digite o nome da cidade: ");
		cidades.get(cidades.size()-1).setNome(in.nextLine());
		
		System.out.println("Fica em qual estado: ");
		cidades.get(cidades.size()-1).setEstado(in.nextLine());
		
	}

	@Override
	public void removerCidade(String nome, List <Cidade> cidades) {
		
		int controle = 1;
		
		for(Cidade x: cidades) {
			if(x.getNome().equals(nome)) {
				cidades.remove(x);
				System.out.println("A cidade: " + this.nome + " foi removido com sucesso");
				return;
			}else {
				controle = 0;
			}
		}
			
		if(controle == 0) {
			System.out.println("A cidade nao pode ser removido");
		}
		
		
	}

	@Override
	public void buscarCidade(String nome, List <Cidade> cidades) {
		
		int controle = 1;
		
		for(Cidade x: cidades) {
			if(x.getNome().equals(nome)) {
				System.out.println(x);
				return;
			}else {
				controle = 0;
			}
		}
			
		if(controle == 0) {
			System.out.println("A cidade nao pode ser encontrada");
		}
	}

	@Override
	public void atualizarCidade(List <Cidade> cidades) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Cidade [ nome=" + nome + ",\n estado=" + estado + "]";
	}
	
	
	
}
