package sistema.model.pessoa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import sistema.crud.CrudFuncionario;

public class Funcionario extends Usuario implements CrudFuncionario {
	
	Scanner in = new Scanner(System.in);
	
	protected Calendar dataAdmissao;
	protected double salario;
	protected String login;
	protected String senha;
	
	private List<Funcionario> funcionarios;
	
	// Constructors

	public Funcionario () {
		super();
		this.dataAdmissao = Calendar.getInstance();
		this.funcionarios = new ArrayList<Funcionario>();
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
	@Override
	public void addFuncionario(List<Funcionario> funcionarios) {
		//funcionarios.add(new Funcionario());
		
		this.funcionarios = funcionarios;
		
		System.out.println("Digite o nome do Funcionario");
		this.funcionarios.get(funcionarios.size()-1).setNome(in.nextLine());
		
		System.out.println("Digite o cpf do Funcionario");
		this.funcionarios.get(funcionarios.size()-1).setCpf(in.nextLine());
		
		System.out.println("Digite o email Funcionario");
		this.funcionarios.get(funcionarios.size()-1).setEmail(in.nextLine());
		
		System.out.println("Digite a data de nascimento do Funcionario: ");
		String auxiliar[] = in.nextLine().split("/");
		
        this.funcionarios.get(funcionarios.size()-1).setDataNasc(Integer.parseInt(auxiliar[0]), 
        														Integer.parseInt(auxiliar[1]),
        														Integer.parseInt(auxiliar[2]));
        
        System.out.println("Digite o salario do funcionario");
        this.funcionarios.get(funcionarios.size()-1).setSalario(Double.parseDouble(in.nextLine()));
        
	}
	
	@Override
	public void removerFuncionario(String cpf) {
		
		int controle = 1;
		
		for(Funcionario x: this.funcionarios) {
			if(x.getCpf().equals(cpf)) {
				this.funcionarios.remove(x);
				System.out.println("o Funcionario" + this.nome + "com o CPF" +this.cpf + "foi removido com sucesso");
				return;
			}else {
				controle = 0;
			}
		}
			
		if(controle == 0) {
			System.out.println("Funcionario nao pode ser removido");
		}
		
		
	}
	
	@Override
	public void buscarFuncionario( String cpf) {
		
		int controle = 1;
		
		for(Funcionario x: this.funcionarios) {
			if(x.getCpf().equals(cpf)) {
				System.out.println(x);
				return;
			}else {
				controle = 0;
			}
			
			if(controle == 0) {
				System.out.println("Funcionario nao encontrados");
			}
			
		}
		
	}
	
	@Override
	public void atualizarFuncionario(String cpf) {
		
		int controle = 1;
		
		for(Funcionario x: this.funcionarios) {
			if(x.getCpf().equals(cpf)) {

				System.out.println("Digiteo novo salario: ");
				x.setSalario(Double.parseDouble(in.nextLine()));
				
				return;
			} else {
				controle = 0;
			}
			
			if(controle == 0) {
				System.out.println("Funcionario nao encontrados");
			}
			
		}
		
	}
	

}
