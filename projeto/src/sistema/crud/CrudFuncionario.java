package sistema.crud;

import java.util.List;

import sistema.model.pessoa.Funcionario;

public interface CrudFuncionario {
	
	public void addFuncionario(List <Funcionario> funcionarios);
	public void listarFuncionarios(List <Funcionario> funcionarios);
	public void removerFuncionario(String cpf);
	public void buscarFuncionario(String cpf);
	
}
