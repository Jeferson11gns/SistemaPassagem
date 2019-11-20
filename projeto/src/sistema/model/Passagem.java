package sistema.model;

public class Passagem extends Rota {
	private int localizador;
	private Passageiro cliente;
	private boolean valida;
	
	
	
	// Getters and Setters
	
	public int getLocalizador() {
		return localizador;
	}
	public void setLocalizador(int localizador) {
		this.localizador = localizador;
	}
	public Passageiro getCliente() {
		return cliente;
	}
	public void setCliente(Passageiro cliente) {
		this.cliente = cliente;
	}
	public boolean isValida() {
		return valida;
	}
	public void setValida(boolean valida) {
		this.valida = valida;
	}
	
	
	// Methods

}
