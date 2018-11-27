import Funcionarios.Manutencao;
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
		Manutencao ma = new Manutencao();
		f.addFuncionario(ma);
		ma.setTempoCasa(3);
		ma.calculaSalario();
		System.out.println(ma.getSalario());
		System.out.println(f.fohaPagamento());
	}
}
