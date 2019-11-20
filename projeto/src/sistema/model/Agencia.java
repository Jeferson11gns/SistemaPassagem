package sistema.model;

import java.util.Arrays;

import sistema.model.pessoa.Funcionario;

public class Agencia {
	private String cnpj;
	private String nome;
	private Cidade local;
	private Funcionario[] funcionarios;
	
	// Constructors
	
	public Agencia() {}
	public Agencia(String cnpj, String nome, Cidade local, Funcionario[] funcionarios) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.local = local;
		this.funcionarios = funcionarios;
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
	
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public String toString() {
		return "Agencia [cnpj=" + cnpj + ", nome=" + nome + ", local=" + local + ", funcionarios="
				+ Arrays.toString(funcionarios) + "]";
	}
	
	
	// Methods

		
}
