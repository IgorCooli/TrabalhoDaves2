package Funcionarios;

import java.util.ArrayList;

import Cenas.Cena;

public class Duble extends Funcionario{
	
	private double valorCena;
	private ArrayList<Cena> cenas;
	
	public Duble() {
		cenas = new ArrayList<Cena>();
	}

	@Override
	public double calculaSalario() {
		
		double salario = 0;
		salario = cenas.size()*valorCena;
		return salario;
		
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
