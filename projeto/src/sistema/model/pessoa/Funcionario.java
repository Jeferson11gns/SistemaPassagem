package sistema.model.pessoa;

import java.util.Calendar;

public class Funcionario extends Usuario {
	protected Calendar dataAdmissao;
	protected double salario;
	protected String login;
	protected String senha;
	
	// Constructors
	
	public Funcionario(Calendar dataAdmissao, double salario, String login, String senha) {
		super();
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
		this.login = login;
		this.senha = senha;
	}
		
	// Getters and Setters
	
	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Funcionario [dataAdmissao=" + dataAdmissao + ", salario=" + salario + ", login=" + login + ", senha="
				+ senha + "]";
	}

}
