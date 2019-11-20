package sistema.model.pessoa;

import java.util.Calendar;

public class Funcionario extends Usuario {
	protected Calendar dataAdmissao;
	protected double salario;
	protected String login;
	protected String senha;
	
	// Constructors

	public Funcionario () {
		super();
		this.dataAdmissao = Calendar.getInstance();
	}
	public Funcionario(String nome, String cpf, String email, Calendar dataNasc, Calendar dataAdmissao, double salario,
			String login, String senha) {
		super(nome, cpf, email, dataNasc);
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
		this.login = login;
		this.senha = senha;
	}
	
		
	// Getters and Setters
	
	public String getDataAdmissao() {
		String d = dataAdmissao.get(Calendar.DAY_OF_MONTH) + "/" + 
				dataAdmissao.get(Calendar.MONTH) + "/" + 
				dataAdmissao.get(Calendar.YEAR);
		return d;
	}

	public void setDataAdmissao(int dia, int mes, int ano) {
		dataAdmissao.set(Calendar.DAY_OF_MONTH, dia);
		dataAdmissao.set(Calendar.MONTH, mes);
		dataAdmissao.set(Calendar.YEAR, ano);	
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
		return "Funcionario [dataAdmissao=" + this.getDataAdmissao() + ", salario=" + salario + ", login=" + login + ", senha="
				+ senha + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", dataNasc=" + super.getDataNasc() + "]";
	}


	// Methods
	

}
