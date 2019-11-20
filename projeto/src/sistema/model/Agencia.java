package sistema.model;

public class Agencia {
	private String cnpj;
	private String nome;
	private Cidade local;
	
	// Constructors
	
	public Agencia() {}
	public Agencia(String cnpj, String nome, Cidade local) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.local = local;
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
	
	
	@Override
	public String toString() {
		return "Agencia [cnpj=" + cnpj + ", nome=" + nome + ", local=" + local + "]";
	}
	
	// Methods

		
}
