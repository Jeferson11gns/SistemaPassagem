package sistema.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import sistema.crud.CrudOnibus;

public class Onibus implements CrudOnibus {
	

	Scanner in = new Scanner(System.in);
	
	private int codigoBus;
	private Poltrona[] poltronas;
	private int qtdePoltronas;
	
	private List<Onibus> onibus; 
	
	// Constructors
	
	public Onibus() {
		onibus = new ArrayList<Onibus>();
	}
	
	public Onibus(int codigoBus, Poltrona[] poltronas, int qtdePoltronas) {
		super();
		this.codigoBus = codigoBus;
		this.poltronas = poltronas;
		this.qtdePoltronas = qtdePoltronas;
	}
	
	// Getters and Setters
	
	public int getCodigoBus() {
		return codigoBus;
	}
	
	public void setCodigoBus(int codigoBus) {
		this.codigoBus = codigoBus;
	}
	
	public Poltrona[] getPoltronas() {
		return poltronas;
	}
	
	public void setPoltronas(Poltrona[] poltronas) {
		this.poltronas = poltronas;
	}
	
	public int getQtdePoltronas() {
		return qtdePoltronas;
	}
	
	public void setQtdePoltronas(int qtdePoltronas) {
		this.qtdePoltronas = qtdePoltronas;
	}
		
	public void preencherPoltronas() {
		for(int i = 0; i < this.qtdePoltronas; i++) {
			poltronas[i] = new Poltrona();
	
			poltronas[i].setLocalizacao(0000+i);
		}
	}

	@Override
	public String toString() {
		return "Onibus [codigoBus=" + codigoBus + ", poltronas=" + Arrays.toString(poltronas) + ", qtdePoltronas="
				+ qtdePoltronas + "]";
	}

	@Override
	public void addOnibus(List<Onibus> onibus) {
		this.onibus = onibus;
		
		System.out.println("Digite o codigo fo onibus");
		this.onibus.get(onibus.size()-1).setCodigoBus(Integer.parseInt(in.nextLine()));
		
		System.out.println("Digite a quantidade de poltronas");
		this.onibus.get(onibus.size()-1).setQtdePoltronas(Integer.parseInt(in.nextLine()));
		
		//this.onibus.get(onibus.size()-1).preencherPoltronas();
		
		
	}

	@Override
	public void removerOnibus(int codigoBus) {
int controle = 1;
		
		for(Onibus x: this.onibus) {
			if(x.getCodigoBus() == codigoBus) {
				this.onibus.remove(x);
				System.out.println("O onibus com o codigo: "+ x.getCodigoBus() + " foi removido");
				return;
			}else {
				controle = 0;
			}
		}
			
		if(controle == 0) {
			System.out.println("O onibus nao pode ser encontrada");
		}
		
	}

	@Override
	public void buscarOnibus(int codigoBus) {
		int controle = 1;
		
		for(Onibus x: this.onibus) {
			if(x.getCodigoBus() == codigoBus) {
				System.out.println(x);
				return;
			}else {
				controle = 0;
			}
		}
			
		if(controle == 0) {
			System.out.println("O onibus nao pode ser encontrada");
		}
		
	}

	@Override
	public void atualizarOnibus() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	// Methods
	
}
