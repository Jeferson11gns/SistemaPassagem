package sistema.model;

import java.util.ArrayList;
import java.util.List;

import sistema.model.pessoa.Funcionario;

public class Agencia {
	
	private String cnpj;
	private String nome;
	private Cidade local;
	private List<Funcionario> funcionarios;
	
	// Constructors
	
	public Agencia() {
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public Agencia(String cnpj, String nome, Cidade local, List<Funcionario> funcionarios) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.local = local;
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	// Getters and Setters
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cidade getLocal() {
		return local;
	}
	
	public void setLocal(Cidade local) {
		this.local = local;
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public String toString() {
		return "Agencia [cnpj=" + cnpj + ",\n nome=" + nome + ",\n local=" + local + ",\n funcionarios=" + funcionarios + "]";
	}
	
	// Methods
		
}
