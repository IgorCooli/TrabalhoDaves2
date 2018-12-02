package Investidores;

public class Investidor implements IPatrocinio{
	private String nome;
	private double quantia;
	private String cnpj;
	private OpcoesInvestidor tipo;
	
	public Investidor() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQuantia() {
		return quantia;
	}

	public void setQuantia(double quantia) {
		this.quantia = quantia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double valorPatrocinio() {
		double pat = getQuantia();
		return pat;
	}

	public OpcoesInvestidor getTipo() {
		return tipo;
	}

	public void setTipo(OpcoesInvestidor tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
