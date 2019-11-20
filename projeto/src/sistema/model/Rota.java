package sistema.model;

import java.util.Calendar;

public class Rota {
	
	protected Onibus onibus;
	protected Cidade origem;
	protected Cidade destino;
	protected String tempoViagem;
	protected Calendar horario;
	protected double preco;
	
	public Rota() {}
	
	public Rota(Onibus onibus, Cidade origem, Cidade destino, String tempoViagem, Calendar horario, double preco) {
		super();
		this.onibus = onibus;
		this.origem = origem;
		this.destino = destino;
		this.tempoViagem = tempoViagem;
		this.horario = horario;
		this.preco = preco;
	}

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

	public Calendar getHorario() {
		return horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
