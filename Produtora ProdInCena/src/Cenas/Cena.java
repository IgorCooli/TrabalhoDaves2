package Cenas;

import java.util.ArrayList;

public class Cena {
	
	private ArrayList<Fita> fitas; 
	private double duracao;
	private int qntTakes;
	private int takeEscolhido;
	
	public Cena() {fitas = new ArrayList<>();}

	

	public ArrayList<Fita> getFitas() {
		return fitas;
	}



	public void setFitas(ArrayList<Fita> fitas) {
		this.fitas = fitas;
	}



	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public int getQntTakes() {
		return qntTakes;
	}

	public void setQntTakes(int qntTakes) {
		this.qntTakes = qntTakes;
	}

	public int getTakeEscolhido() {
		return takeEscolhido;
	}

	public void setTakeEscolhido(int takeEscolhido) {
		this.takeEscolhido = takeEscolhido;
	}
	
	public void addFita(Fita fita) {
		fitas.add(fita);
	}
	public void removeFita(int position) {
		fitas.remove(position);
	}

}
