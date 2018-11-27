package Funcionarios;

public class CameraMan extends FuncionarioApoio {

	
	public double salario;
	
	public CameraMan() {
		super();
		this.salario = 3000;
	}
	
	@Override
	public void calculaSalario() {
		
		if(getTempoCasa() > 3 && getTempoCasa() < 5){
			 salario = salario * 1.01;
			 setSalario(salario);
		}
		else if(getTempoCasa() >= 5){
			salario = salario * 1.05;
			setSalario(salario);
		}
		
		
		
		
	}

}