package sistema.model.pessoa;

import java.util.Calendar;

public class Administrador extends Funcionario {
	
	public Administrador(Calendar dataAdmissao, double salario, String login, String senha) {
		super(dataAdmissao, salario, login, senha);
	}

	
	@Override
	public String toString() {
		return "Administrador [dataAdmissao=" + dataAdmissao + ", salario=" + salario + ", login=" + login + ", senha="
				+ senha + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", dataNasc=" + dataNasc
				+ ", getDataAdmissao()=" + getDataAdmissao() + ", getSalario()=" + getSalario() + ", getLogin()="
				+ getLogin() + ", getSenha()=" + getSenha() + ", toString()=" + super.toString() + ", getNome()="
				+ getNome() + ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail() + ", getDataNasc()="
				+ getDataNasc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
