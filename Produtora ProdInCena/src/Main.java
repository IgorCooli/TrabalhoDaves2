import Funcionarios.CameraMan;
import Funcionarios.FuncionarioApoio;

public class Main {
	public static void main(String args[]) {
		FuncionarioApoio cm = new CameraMan();
		cm.calculaSalario();
		cm.setTempoCasa(4);
		System.out.println(cm.calculaSalario());
	}
}
