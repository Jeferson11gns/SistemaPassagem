package sistema.crud;

import java.util.List;

import sistema.model.pessoa.Funcionario;

public interface CrudFuncionario {
	
	public void addFuncionario(List <Funcionario> funcionarios);
	public void removerFuncionario( String cpf, List<Funcionario> func);
	public void buscarFuncionario(String cpf, List<Funcionario> func);
	public void atualizarFuncionario(String cpf, List<Funcionario> func);
	
}
