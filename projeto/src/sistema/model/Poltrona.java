package sistema.model;

import sistema.model.pessoa.Passageiro;

public class Poltrona {
	
	private int localizacao;
	private Passagem passagem;
	
	//ja ja tirar pq nem vai precisar
	private Passageiro passageiro;
	
	// Constructors
	
	public Poltrona() {}
	
	public Poltrona(int localizacao, Passageiro passageiro) {
		super();
		this.localizacao = localizacao;
		this.passageiro = passageiro;
	}
	
	// Getters and Setters
	
	public int getLocalizacao() {
		return localizacao;
	}
	
	public void setLocalizacao(int localizacao) {
		this.localizacao = localizacao;
	}
	
	public Passageiro getPassageiro() {
		return passageiro;
	}
	
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	
	public Passagem getPassagem() {
		return passagem;
	}

	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}
	
	public void mudaStatusPassagem(int localizacao) {
		if(this.localizacao == localizacao) {
			this.passagem.setValida(false);
			//System.out.println(passagem);
		}
		
	}
	
	@Override
	public String toString() {
		return "Poltrona [localizacao=" + localizacao + ", passageiro=" + passageiro + "]";
	}
	
	// Methods

	
}
