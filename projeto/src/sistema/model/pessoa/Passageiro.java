package sistema.model.pessoa;

import java.util.ArrayList;
import java.util.List;

import sistema.crud.CrudPassageiro;
import sistema.model.Passagem;

public class Passageiro extends Usuario implements CrudPassageiro {
	
	private List<Passagem> passagens;
	
	// Constructors
	
	public Passageiro() {
		this.passagens = new ArrayList<Passagem>();
	}
	
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

	@Override
	public void addPassageiro(List<Passageiro> passageiros) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerPassageiro(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarPassageiro(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPassageiro() {
		// TODO Auto-generated method stub
		
	}
	
	// Methods
	

}
