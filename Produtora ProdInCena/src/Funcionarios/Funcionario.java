package Funcionarios;

public abstract class Funcionario {
	private String nome;
	private int idade;
	protected double salario;
	
	public Funcionario() {}

	
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public abstract void calculaSalario();
	
}
