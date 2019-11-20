package sistema.model.pessoa;

import java.util.Calendar;

import sistema.model.Passagem;

public class Passageiro extends Usuario{
	private Passagem passagem;
	
	// Constructors
	
	public Passageiro() {}
	public Passageiro(String nome, String cpf, String email, Calendar dataNasc, Passagem passagem) {
		super(nome, cpf, email, dataNasc);
		this.passagem = passagem;
	}
	
	// Getters and Setters
	
	public Passagem getPassagem() {
		return passagem;
	}
	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}
	
	
	@Override
	public String toString() {
		return "Passageiro [passagem=" + passagem + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email
				+ ", dataNasc=" + dataNasc + "]";
	}

	// Methods

}
