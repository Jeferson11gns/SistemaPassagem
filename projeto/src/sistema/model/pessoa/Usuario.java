package sistema.model.pessoa;

import java.util.Calendar;

public class Usuario {
	
	protected String nome;
	protected String cpf;
	protected String email;
	protected Calendar dataNasc;
	
	// Constructors
	
	public Usuario() {}
	public Usuario(String nome, String cpf, String email, Calendar dataNasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
	}
	
	// Getters and Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataNasc() {
		return dataNasc;
	}

	public void setDataAdmissa(Calendar dataAdmissa) {
		this.dataNasc = dataAdmissa;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", dataNasc=" + dataNasc + "]";
	}
	
	// Methods
	
}
