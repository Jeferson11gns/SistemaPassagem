package sistema.model.pessoa;

import java.util.ArrayList;
import java.util.List;

import sistema.model.Passagem;

public class Passageiro extends Usuario{
	private List<Passagem> passagens;
	
	// Constructors
	
	public Passageiro() {}
	public Passageiro(List<Passagem> passagens) {
		super();
		this.passagens = new ArrayList<Passagem>();
	}
	
	// Getters and Setters
	
	public List<Passagem> getPassagens() {
		return passagens;
	}
	public void setPassagens(List<Passagem> passagens) {
		this.passagens = passagens;
	}
	
	
	@Override
	public String toString() {
		return "Passageiro [passagens=" + passagens + "]";
	}
	

	// Methods

}
