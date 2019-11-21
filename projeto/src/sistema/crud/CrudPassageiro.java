package sistema.crud;

import java.util.List;

import sistema.model.pessoa.Passageiro;

public interface CrudPassageiro {
	
	public void addPassageiro(List <Passageiro> passageiros);
	public void removerPassageiro(String cpf);
	public void buscarPassageiro(String cpf);
	public void atualizarPassageiro();
	
}
