package Funcionarios;

import java.util.ArrayList;

import Cenas.Cena;

public class Ator extends Funcionario{
	private double valorCena;
	private ArrayList<Cena> cenas;
	
	public Ator() {
		cenas = new ArrayList<Cena>();
	}

	@Override
	public void calculaSalario() {
		
		setSalario(cenas.size()*valorCena);
		
	}

	public double getValorCena() {
		return valorCena;
	}

	public void setValorCena(double valorCena) {
		this.valorCena = valorCena;
	}

	public ArrayList<Cena> getCenas() {
		return cenas;
	}

	public void setCenas(ArrayList<Cena> cenas) {
		this.cenas = cenas;
	}
	
	public void addCena(Cena cena) {
		cenas.add(cena);
	}
	public void removeCena(int position) {
		cenas.remove(position);
	}
	
}
