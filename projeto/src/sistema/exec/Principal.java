package sistema.exec;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		//tudo feito aqui é para teste de como seria a tela incial
		
		Scanner in = new Scanner(System.in);
		
		boolean primeiraVez = false;
		
		if(!primeiraVez) {
			System.out.println("################################");
			System.out.println("###### Cadastro do adm #########");
			System.out.println("################################");
			System.out.print("Digite o nome: ");
			String nome = in.nextLine();
			
			System.out.print("Digite o email: ");
			String email = in.nextLine();
			
			System.out.print("Digite a senha: ");
			String senha = in.nextLine();
			
			primeiraVez = true;
		}
		
	}

}
