package Funcionarios;

public abstract class FuncionarioApoio extends Funcionario{
	
	private int tempoCasa;
	protected double salario;

	public FuncionarioApoio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getTempoCasa() {
		return tempoCasa;
	}

	public void setTempoCasa(int tempoCasa) {
		this.tempoCasa = tempoCasa;
	}
	@Override
	public double calculaSalario() {
		double salario = 0;
		if(tempoCasa>3 && tempoCasa<= 5) {
			salario = getSalario()*1.05;
		}
		else if(tempoCasa>5) {
			salario = getSalario()*1.1;
		}
		else {
			salario = getSalario();
		}
		return salario;
	}
	

}
