package sistema.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sistema.crud.CrudRota;
import sistema.model.pessoa.Funcionario;



public class Rota implements CrudRota {
	
	Scanner in = new Scanner(System.in);
	
	protected Onibus onibus;
	protected Cidade origem;
	protected Cidade destino;
	protected String tempoViagem;
	protected String horario;
	protected double preco;
	
	private List<Rota> rotas;
	
	// Constructors
	
	public Rota() {
		this.rotas = new ArrayList<Rota>();
	}
	
	public Rota(Onibus onibus, Cidade origem, Cidade destino, String tempoViagem, String horario, double preco) {
		super();
		this.onibus = onibus;
		this.origem = origem;
		this.destino = destino;
		this.tempoViagem = tempoViagem;
		this.horario = horario;
		this.preco = preco;
	}

	// Getters and Setters
	
	public Onibus getOnibus() {
		return onibus;
	}

	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}

	public Cidade getOrigem() {
		return origem;
	}

	public void setOrigem(Cidade origem) {
		this.origem = origem;
	}

	public Cidade getDestino() {
		return destino;
	}

	public void setDestino(Cidade destino) {
		this.destino = destino;
	}

	public String getTempoViagem() {
		return tempoViagem;
	}

	public void setTempoViagem(String tempoViagem) {
		this.tempoViagem = tempoViagem;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Rota [onibus=" + onibus + ", origem=" + origem + ", destino=" + destino + ", tempoViagem=" + tempoViagem
				+ ", horario=" + horario + ", preco=" + preco + "]";
	}

	@Override
	public void addRota(List<Rota> rotas) {
		
		this.rotas = rotas;
		
		//add coisas proprias da rota
		System.out.println("Digite o horario");
		this.rotas.get(rotas.size()-1).setHorario(in.nextLine());
		
		System.out.println("Digite o preco");
		this.rotas.get(rotas.size()-1).setPreco(Double.parseDouble(in.nextLine()));
		
		System.out.println("Digite o tempo de viagem");
		this.rotas.get(rotas.size()-1).setTempoViagem(in.nextLine());
		
		//System.out.println("");
	}

	@Override
	public void removerRota(String cidadeOrigem, String cidadeDestino) {
		
		int controle = 1;
		
		for(Rota x: this.rotas) {
			if(x.getOrigem().getNome().equals(cidadeOrigem) && x.getDestino().getNome().equals(cidadeDestino)) {
				this.rotas.remove(x);
				System.out.println("A rota foi removido com sucesso");
				return;
			}else {
				controle = 0;
			}
		}
			
		if(controle == 0) {
			System.out.println("A rota nao pode ser removido");
		}
		
	}

	@Override
	public boolean buscarRota(String cidadeOrigem, String cidadeDestino) {
		
		int controle = 0;
		
		for(Rota x: this.rotas) {
			if(x.getOrigem().getNome().equals(cidadeOrigem) && x.getDestino().getNome().equals(cidadeDestino)) {
				System.out.println(x);
				controle = 1;
			}else if(controle != 1){
				controle = 0;
			}
		}
			
		if(controle == 0) {
			System.out.println("A rota nao foi Encontrada");
			return false;
		} else {
			return true;
		}
		
		
	}

	@Override
	public void atualizarRota() {
		// TODO Auto-generated method stub
		
	}
	
	// Methods
	
	
}
