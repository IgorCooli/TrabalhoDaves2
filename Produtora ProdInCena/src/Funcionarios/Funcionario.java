package Funcionarios;

public class Funcionario {

	private String nome;
	private String cpf;
	private int tempoCasa;
	private double salario;
	
	public Funcionario () {
		
	}
	
	
	
	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTempoCasa() {
		return tempoCasa;
	}

	public void setTempoCasa(int tempoCasa) {
		this.tempoCasa = tempoCasa;
	}
	
	
	
}
