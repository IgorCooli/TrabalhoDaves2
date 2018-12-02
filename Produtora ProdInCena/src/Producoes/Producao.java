package Producoes;
import java.util.ArrayList;

import Cenas.Cena;
import Despesas.Despesa;
import Funcionarios.Funcionario;
import Investidores.Investidor;

public class Producao {
	private String nome;
	private double valorVendaProducao;
	private ArrayList<Investidor> investidores;
	private ArrayList<Cena> cenas;
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Despesa> despesas;
	
	
	public Producao() {
		investidores = new ArrayList<Investidor>();
		cenas = new ArrayList<Cena>();
		funcionarios = new ArrayList<Funcionario>();
		despesas = new ArrayList<Despesa>();
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



	public ArrayList<Cena> getCenas() {
		return cenas;
	}



	public void setCenas(ArrayList<Cena> cenas) {
		this.cenas = cenas;
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
	
	public void addCena(Cena cena) {
		cenas.add(cena);
	}
	public void removeCena (int position) {
		cenas.remove(position);
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
			receita += investidores.get(i).valorPatrocinio();
		}
		return receita;
	}
	
	public double folhaPagamento() {
		double folha = 0;
		for(int i=0 ; i<funcionarios.size() ; i++) {
			folha += funcionarios.get(i).calculaSalario();
		}
		return folha;
	}
	
	public double despesasExtras() {
		double de = 0;
		for(int i=0 ; i<despesas.size() ; i++) {
			de += despesas.get(i).getValor();
		}
		return de;
	}
	
	public double gastoTotal() {
		return (folhaPagamento() + despesasExtras());
	}
	
	public double faturamento() {
		return (receitaInvestidores()-gastoTotal());
	}
	
}
