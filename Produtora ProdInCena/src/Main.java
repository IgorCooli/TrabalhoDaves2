import Funcionarios.CameraMan;
import Funcionarios.Funcionario;
import Investidores.EmpresaPrivada;
import Investidores.Investidor;
import Producoes.Filme;
import Producoes.Producao;

public class Main {
	public static void main(String args[]) {
		Producao f = new Filme();
		Funcionario cm = new CameraMan();
		cm.setTempoCasa(4);
		System.out.println(cm.getSalario());
		
	}
}
