package sistema.crud;

import java.util.List;

import sistema.model.Cidade;


public interface crudCidade {
	
	public void addCidade(List <Cidade> cidades);
	public void listarCidades(List <Cidade> cidades);
	public void removerCidade(String nome);
	public void buscarCidade(String nome);

	
}
