package Funcionarios;

public abstract class FuncionarioApoio extends Funcionario {
	
	public double salario;

	public FuncionarioApoio() {
		super();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public abstract double calculaSalario();
	
}
