package sistema.crud;

import java.util.List;

import sistema.model.Rota;

public interface CrudRota {
	
	public void addRota(List <Rota> rotas);
	public void removerRota(String cidadeOrigem, String cidadeDestino);
	public boolean buscarRota(String cidadeOrigem, String cidadeDestino);
	public void atualizarRota();
	
	
}
