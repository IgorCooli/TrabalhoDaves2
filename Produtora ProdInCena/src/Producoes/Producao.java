package Producoes;
import java.util.ArrayList;

import Cenas.Fita;
import Despesas.Despesa;
import Funcionarios.Funcionario;
import Funcionarios.FuncionarioApoio;
import Investidores.Investidor;

public class Producao {
	private String nome;
	private double valorVendaProducao;
	private ArrayList<Investidor> investidores;
	private ArrayList<Fita> fitas;
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Despesa> despesas;
	
	public Producao() {
		investidores = new ArrayList<Investidor>();
		fitas = new ArrayList<Fita>();
		funcionarios = new ArrayList<Funcionario>();
	}

	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getValorVendaProducao() {
		return valorVendaProducao;
	}



	public void setValorVendaProducao(double valorVendaProducao) {
		this.valorVendaProducao = valorVendaProducao;
	}



	public ArrayList<Investidor> getInvestidores() {
		return investidores;
	}



	public void setInvestidores(ArrayList<Investidor> investidores) {
		this.investidores = investidores;
	}



	public ArrayList<Fita> getFitas() {
		return fitas;
	}



	public void setFitas(ArrayList<Fita> fitas) {
		this.fitas = fitas;
	}



	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}



	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}



	public ArrayList<Despesa> getDespesas() {
		return despesas;
	}



	public void setDespesas(ArrayList<Despesa> despesas) {
		this.despesas = despesas;
	}



	public void addInvestidor(Investidor investidor) {
		investidores.add(investidor);
	}
	public void removeInvestidor(int position) {
		investidores.remove(position);
	}
	
	public void addFita(Fita fita) {
		fitas.add(fita);
	}
	public void removeFita(int position) {
		fitas.remove(position);
	}
	
	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	public void removeFuncionario(int position) {
		funcionarios.remove(position);
	}
	
	public void addDespesa(Despesa despesa) {
		despesas.add(despesa);
	}
	public void removeDespesa(int position) {
		despesas.remove(position);
	}
	
	public double receitaInvestidores() {
		double receita = 0;
		for(int i=0 ; i<investidores.size() ; i++) {
			receita += investidores.get(i).getQuantia();
		}
		return receita;
	}
	
	
}
