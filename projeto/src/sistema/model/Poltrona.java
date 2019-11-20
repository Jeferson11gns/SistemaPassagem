package sistema.model;

import sistema.model.pessoa.Passageiro;

public class Poltrona {
	private int localizacao;
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
	
	
	@Override
	public String toString() {
		return "Poltrona [localizacao=" + localizacao + ", passageiro=" + passageiro + "]";
	}
	
	// Methods

}
