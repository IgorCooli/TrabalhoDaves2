package Funcionarios;

public class FuncionarioApoio extends Funcionario{
	
	private int tempoCasa;

	public FuncionarioApoio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTempoCasa() {
		return tempoCasa;
	}

	public void setTempoCasa(int tempoCasa) {
		this.tempoCasa = tempoCasa;
	}
	@Override
	public void calculaSalario() {
		if(tempoCasa>3 && tempoCasa<= 5) {
			setSalario(getSalario()*1.05);
		}
		else if(tempoCasa>5) {
			setSalario(getSalario()*1.1);
		}
	}

}
