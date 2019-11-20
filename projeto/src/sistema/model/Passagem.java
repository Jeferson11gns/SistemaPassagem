package sistema.model;

import sistema.model.pessoa.Passageiro;

public class Passagem {
	private int localizador;
	private Rota rota;
	private Passageiro passageiro;
	private boolean valida;
	
	// Constructors
	
	public Passagem() {}
	public Passagem(int localizador, Rota rota, Passageiro passageiro, boolean valida) {
		super();
		this.localizador = localizador;
		this.rota = rota;
		this.passageiro = passageiro;
		this.valida = valida;
	}
	
	// Getters and Setters
	
	public int getLocalizador() {
		return localizador;
	}
	public void setLocalizador(int localizador) {
		this.localizador = localizador;
	}
	public Rota getRota() {
		return rota;
	}
	public void setRota(Rota rota) {
		this.rota = rota;
	}
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	public boolean isValida() {
		return valida;
	}
	public void setValida(boolean valida) {
		this.valida = valida;
	}	
	
	@Override
	public String toString() {
		return "Passagem [localizador=" + localizador + ", rota=" + rota + ", passageiro=" + passageiro + ", valida="
				+ valida + "]";
	}
	
	// Methods

}
