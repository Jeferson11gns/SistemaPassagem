package sistema.model.pessoa;

import java.util.Calendar;

public class Administrador extends Funcionario {
	
	// Constructors
	
	public Administrador() {
		super();
	}
	
	public Administrador(String nome, String cpf, String email, Calendar dataNasc, Calendar dataAdmissao,
			double salario, String login, String senha) {
		super(nome, cpf, email, dataNasc, dataAdmissao, salario, login, senha);
	}
	
	@Override
	public String toString() {
		return "Administrador [dataAdmissao=" + super.getDataAdmissao() + ",\n salario=" + salario + ",\n login=" + login + ",\n senha="
				+ senha + ",\n nome=" + nome + ",\n cpf=" + cpf + ",\n email=" + email + ",\n dataNasc=" + super.getDataNasc() + "]";
	}
	
	// Methods
	
}
