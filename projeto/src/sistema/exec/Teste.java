package sistema.exec;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import sistema.model.Agencia;
import sistema.model.Cidade;
import sistema.model.Onibus;
import sistema.model.Passagem;
import sistema.model.Poltrona;
import sistema.model.Rota;
import sistema.model.pessoa.Administrador;
import sistema.model.pessoa.Funcionario;
import sistema.model.pessoa.Passageiro;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Cidade> listaCidades = new ArrayList<Cidade>();
		List<Onibus> listaOnibus = new ArrayList<Onibus>();
		List<Passagem> listaPassagens = new ArrayList<Passagem>();
		List<Rota> listaRotas = new ArrayList<Rota>();
		//List<Administrador> listaAdministradores = new ArrayList<Administrador>();
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		List<Passageiro> listaPassageiros = new ArrayList<Passageiro>();
		
		// Poltronas default
		Poltrona[] pol20 = new Poltrona[20];
		Poltrona[] pol30 = new Poltrona[30];
		
		// Onibus default
		listaOnibus.add(new Onibus(0001, pol20, 20));
		listaOnibus.add(new Onibus(0002, pol30, 30));
		
		// Cidades default
		listaCidades.add(new Cidade("Fortaleza", "Ceará"));
		listaCidades.add(new Cidade("Quixadá", "Ceará"));
		
		// Rota default
		
		listaRotas.add(new Rota(listaOnibus.get(1), listaCidades.get(0),
								listaCidades.get(1), "3h30", "14h", 27.39));
		
		System.out.println("Passageiro já cadastrado?");
		System.out.println("1 - Sim \n2 - Não");
		int control = Integer.parseInt(ler.nextLine());
		
		if(control == 1) {
			listaPassageiros.add(new Passageiro());	
			listaPassageiros.get(listaPassageiros.size()-1).addPassageiro(listaPassageiros);
		}
		
		listaPassageiros.add(new Passageiro());
		listaPassageiros.get(listaPassageiros.size()-1).addPassageiro(listaPassageiros);
		listaPassagens.add(new Passagem());
		
		//listaCidades.get(listaCidades.size()-1).addCidade(listaCidades);
		
		// VENDER PASSAGEM
		
		
		//addCidade(listaCidades);
		//addCidade(listaCidades);
		//addCidade(listaCidades);
		
		//buscarCidade(listaCidades, "Fortaleza");
		
		//for(Cidade i: listaCidades) System.out.println(i);
		//System.out.println(listaCidades);
		
	}
	
	public static Calendar setData(int ano, int mes, int dia) {
		Calendar data = Calendar.getInstance();
		data.set(Calendar.YEAR, ano);
		data.set(Calendar.MONTH, mes);
		data.set(Calendar.DAY_OF_MONTH, dia);
		return data;
	}
	
	public static void addCidade(List<Cidade> c) {
		Scanner ler = new Scanner(System.in);
		c.add(new Cidade());
		//System.out.println("Digite o código");
		//c.get(c.size()-1).setCodigo(Integer.parseInt(ler.nextLine()));
		System.out.println("Digite o nome");
		c.get(c.size()-1).setNome(ler.nextLine());
		System.out.println("Digite o Estado");
		c.get(c.size()-1).setEstado(ler.nextLine());	
		
	}
	
	public static void buscarCidade(List<Cidade> listaCidades, String nome) {
		for(Cidade i: listaCidades) {
			if(i.getNome().equals(nome)) {
				System.out.println(i);
				return;
			} else {
				System.out.println("Cidade nao encontrada");
			}
		}
	}

}

/*
Cidade c1 = new Cidade(0001, "Fortaleza", "Ceara");
Cidade c2 = new Cidade(0002, "Quixada", "Ceara");

//Passageiro person = new Passageiro("Emanuel", "000", "manelmr", setData(1992, 03, 01), pass);
Passageiro person = new Passageiro();
Poltrona[] p1 = new Poltrona[1];
p1[0] = new Poltrona();
p1[0].setLocalizacao(11);
p1[0].setPassageiro(person);
Onibus bus = new Onibus();
bus.setCodigoBus(0001);
bus.setPoltronas(p1);
Rota r = new Rota();
Passagem pass = new Passagem(0001, r, person, true);

//System.out.println(bus);

Administrador admin = new Administrador();

admin.setDataAdmissao(01, 04, 2013);
admin.setDataNasc(01, 03, 1992);

System.out.println(admin);
*/