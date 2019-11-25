package sistema.crud;

import java.util.List;

import sistema.model.Cidade;


public interface CrudCidade {
	
	public void addCidade(List <Cidade> cidades);
	public void removerCidade(String nome, List <Cidade> cidades);
	public void buscarCidade(String nome, List <Cidade> cidades);
	public void atualizarCidade(List <Cidade> cidades);
	
}
