package sistema.model;

import java.util.Arrays;

public class Onibus {
	
	private int codigoBus;
	private Poltrona[] poltronas;
	private int qtdePoltronas;
	
	// Constructors
	
	public Onibus() {}
	
	public Onibus(int codigoBus, Poltrona[] poltronas, int qtdePoltronas) {
		super();
		this.codigoBus = codigoBus;
		this.poltronas = poltronas;
		this.qtdePoltronas = qtdePoltronas;
	}
	
	// Getters and Setters
	
	public int getCodigoBus() {
		return codigoBus;
	}
	
	public void setCodigoBus(int codigoBus) {
		this.codigoBus = codigoBus;
	}
	
	public Poltrona[] getPoltronas() {
		return poltronas;
	}
	
	public void setPoltronas(Poltrona[] poltronas) {
		this.poltronas = poltronas;
	}
	
	public int getQtdePoltronas() {
		return qtdePoltronas;
	}
	
	public void setQtdePoltronas(int qtdePoltronas) {
		this.qtdePoltronas = qtdePoltronas;
	}
	
	
	@Override
	public String toString() {
		return "Onibus [codigoBus=" + codigoBus + ", poltronas=" + Arrays.toString(poltronas) + ", qtdePoltronas="
				+ qtdePoltronas + "]";
	}
	
	
	
	// Methods
	
}
