package sistema.model;

public class Onibus {
	private int codigoBus;
	private int[] poltronas;
	private Passageiro passageiros;
	
	// Constructors
	
	public Onibus () {}
	public Onibus(int codigoBus, int[] poltronas, Passageiro passageiros) {
		super();
		this.codigoBus = codigoBus;
		this.poltronas = poltronas;
		this.passageiros = passageiros;
	}
	
	// Getters and Setters
	
	public int getCodigoBus() {
		return codigoBus;
	}
	public void setCodigoBus(int codigoBus) {
		this.codigoBus = codigoBus;
	}
	public int[] getPoltronas() {
		return poltronas;
	}
	public void setPoltronas(int[] poltronas) {
		this.poltronas = poltronas;
	}
	public Passageiro getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(Passageiro passageiros) {
		this.passageiros = passageiros;
	}

	// Methods
	
	// public int poltronaDisponivel(){}
	
	public int qtdePoltronas() {
		return this.poltronas.length;
	}
	
}
