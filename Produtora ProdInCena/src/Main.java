import Funcionarios.Funcionario;
import Funcionarios.Maquiador;
import Producoes.Filme;
import Producoes.Producao;

public class Main {
	public static void main(String args[]) {
		Producao f = new Filme();
		Maquiador m = new Maquiador();
		f.addFuncionario(m);
		m.setTempoCasa(5);
		m.calculaSalario();
		System.out.println(m.getSalario());
	}
}
