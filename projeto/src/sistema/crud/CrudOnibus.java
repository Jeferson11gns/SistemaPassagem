package sistema.crud;

import java.util.List;

import sistema.model.Onibus;

public interface CrudOnibus {

	public void addOnibus(List <Onibus> onibus);
	public void removerOnibus(int codigoBus, List<Onibus> onibus);
	public void buscarOnibus(int codigoBus, List<Onibus> onibus);
	public void atualizarOnibus(List<Onibus> onibus);
	
	
}
