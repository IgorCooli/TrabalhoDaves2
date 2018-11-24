package Producoes;
import java.util.ArrayList;
import Cenas.Fita;
import Funcionarios.Funcionario;
import Investidores.Investidor;

public class Producao {
	private String nome;
	private double valorVendaProducao;
	private ArrayList<Investidor> investidores;
	private ArrayList<Fita> fitas;
	private ArrayList<Funcionario> funcionarios;
	
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
	
}
