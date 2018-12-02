import java.util.Scanner;

import Cenas.Cena;
import Cenas.Fita;
import Despesas.Despesa;
import Funcionarios.Ator;
import Funcionarios.CameraMan;
import Funcionarios.Diretor;
import Funcionarios.Duble;
import Funcionarios.Faxineiro;
import Funcionarios.Manutencao;
import Funcionarios.Maquiador;
import Funcionarios.Produtor;
import Investidores.Investidor;
import Investidores.OpcoesInvestidor;
import Producoes.Filme;
import Producoes.Novela;
import Producoes.Propaganda;
import Producoes.Serie;
import Producoes.Show;

public class Main {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		ProdInCena pic = new ProdInCena();
		int c = 0;
		int menu = 0;
		while(menu==0) {
			int m1 = 0;
			System.out.println("##### Produtora ProdInCena #####");
			System.out.println("#### Cadastre uma produção: ");
			System.out.println("### Selecione o tipo de produção: ");
			System.out.println("1) Filme");
			System.out.println("2) Novela");
			System.out.println("3) Propaganda");
			System.out.println("4) Série");
			System.out.println("5) Show");
			System.out.println("6) Sair");
			m1 = input.nextInt();
			
			if(m1==1) {
				Filme p = new Filme();
				menu=1;
				pic.addProducao(p);
			}
			else if(m1==2) {
				Novela p = new Novela();
				menu=1;
				pic.addProducao(p);
			}
			else if(m1==3) {
				Propaganda p = new Propaganda();
				menu=1;
				pic.addProducao(p);
			}
			else if(m1==4) {
				Serie p = new Serie();
				menu=1;
				pic.addProducao(p);
			}
			else if(m1==5) {
				Show p = new Show();
				menu=1;
				pic.addProducao(p);
			}
			else if(m1==6) {
				menu=1;
			}
			else{
				System.out.println("Digite uma opção válida!");
			}
			System.out.println("## Digite o valor de venda da produção: ");
			pic.getProducoes().get(c).setValorVendaProducao(input.nextDouble());
		}
		
		int menu1=0;
		while(menu1==0) {
			int m2 = 0;
			menuPrincipal();
			m2 = input.nextInt();
			if(m2==1) {
				int m3=0;
				while(!(m3==9)) {
					menuCadastroFuncionario();
					m3= input.nextInt();
					if(m3==1) {
						Ator f = new Ator();
						System.out.println("# Digite salário por cena:");
						f.setValorCena(input.nextDouble());
						System.out.println("# Digite o nome: ");
						f.setNome(input.nextLine());
						f.setNome(input.nextLine());
						System.out.println("# Digite a idade: ");
						f.setIdade(input.nextInt());
						pic.getProducoes().get(c).addFuncionario(f);
					}
					else if(m3==2) {
						Duble f = new Duble();
						System.out.println("# Digite salário por cena: ");
						f.setValorCena(input.nextDouble());
						System.out.println("# Digite o nome: ");
						f.setNome(input.nextLine());
						f.setNome(input.nextLine());
						System.out.println("# Digite a idade: ");
						f.setIdade(input.nextInt());
						pic.getProducoes().get(c).addFuncionario(f);
					}
					else if(m3==3) {
						CameraMan f = new CameraMan();
						System.out.println("# Digite o tempo de casa: ");
						f.setTempoCasa(input.nextInt());
						System.out.println("# Digite o nome: ");
						f.setNome(input.nextLine());
						f.setNome(input.nextLine());
						System.out.println("# Digite a idade: ");
						f.setIdade(input.nextInt());
						pic.getProducoes().get(c).addFuncionario(f);
					}
					else if(m3==4) {
						Diretor f = new Diretor();
						System.out.println("# Digite o tempo de casa: ");
						f.setTempoCasa(input.nextInt());
						System.out.println("# Digite o nome: ");
						f.setNome(input.nextLine());
						f.setNome(input.nextLine());
						System.out.println("# Digite a idade: ");
						f.setIdade(input.nextInt());
						pic.getProducoes().get(c).addFuncionario(f);
					}
					else if(m3==5) {
						Faxineiro f = new Faxineiro();
						System.out.println("# Digite o tempo de casa: ");
						f.setTempoCasa(input.nextInt());
						System.out.println("# Digite o nome: ");
						f.setNome(input.nextLine());
						f.setNome(input.nextLine());
						System.out.println("# Digite a idade: ");
						f.setIdade(input.nextInt());
						pic.getProducoes().get(c).addFuncionario(f);
					}
					else if(m3==6) {
						Manutencao f = new Manutencao();
						System.out.println("# Digite o tempo de casa: ");
						f.setTempoCasa(input.nextInt());
						System.out.println("# Digite o nome: ");
						f.setNome(input.nextLine());
						f.setNome(input.nextLine());
						System.out.println("# Digite a idade: ");
						f.setIdade(input.nextInt());
						pic.getProducoes().get(c).addFuncionario(f);
					}
					else if(m3==7) {
						Maquiador f = new Maquiador();
						System.out.println("# Digite o tempo de casa: ");
						f.setTempoCasa(input.nextInt());
						System.out.println("# Digite o nome: ");
						f.setNome(input.nextLine());
						f.setNome(input.nextLine());
						System.out.println("# Digite a idade: ");
						f.setIdade(input.nextInt());
						pic.getProducoes().get(c).addFuncionario(f);
					}
					else if(m3==8) {
						Produtor f = new Produtor();
						System.out.println("# Digite o tempo de casa: ");
						f.setTempoCasa(input.nextInt());
						System.out.println("# Digite o nome: ");
						f.setNome(input.nextLine());
						f.setNome(input.nextLine());
						System.out.println("# Digite a idade: ");
						f.setIdade(input.nextInt());
						pic.getProducoes().get(c).addFuncionario(f);
					}
					
				}
				
			}
			
			if(m2==2) {
				int menuInvest = 0;
				Investidor invest = new Investidor();
				pic.getProducoes().get(c).addInvestidor(invest);
				System.out.println("# Tipo de investidor: ");
				System.out.println("1) Empresa Pública");
				System.out.println("2) Empresa Privada");
				if(pic.getProducoes().get(c) instanceof Filme || pic.getProducoes().get(c) instanceof Show) {
					System.out.println("3) Lei de incentivo");
				}
				menuInvest = input.nextInt();
				if(menuInvest == 1) {
					invest.setTipo(OpcoesInvestidor.PUBLICO);
					System.out.println("# Digite o nome do investidor: ");
					invest.setNome(input.nextLine());
					invest.setNome(input.nextLine());
					System.out.println("# Digite o cnpj do investidor: ");
					invest.setCnpj(input.nextLine());
					System.out.println("# Digite a quantia:");
					invest.setQuantia(input.nextDouble());
				}
				else if(menuInvest == 2) {
					invest.setTipo(OpcoesInvestidor.PRIVADO);
					System.out.println("# Digite o nome do investidor: ");
					invest.setNome(input.nextLine());
					invest.setNome(input.nextLine());
					System.out.println("# Digite o cnpj do investidor: ");
					invest.setCnpj(input.nextLine());
					System.out.println("# Digite a quantia:");
					invest.setQuantia(input.nextDouble());
				}
				else if(menuInvest == 3) {
					invest.setTipo(OpcoesInvestidor.LEIINCENTIVO);
					System.out.println("# Digite o nome do investidor: ");
					invest.setNome(input.nextLine());
					invest.setNome(input.nextLine());
					System.out.println("# Digite a quantia:");
					invest.setQuantia(input.nextDouble());
				}
			}
			if(m2==3) {
				Despesa d = new Despesa();
				pic.getProducoes().get(c).addDespesa(d);
				System.out.println("# Digite a descrição da despesa: ");
				d.setDescricao(input.nextLine());
				d.setDescricao(input.nextLine());
				System.out.println("# Digite o valor da despesa: ");
				d.setValor(input.nextDouble());
			}
			if(m2==4) {
				int qf = 0;
				Cena cena = new Cena();
				pic.getProducoes().get(c).addCena(cena);
				System.out.println("# Digite a duração da cena(minutos): ");
				cena.setDuracao(input.nextDouble());
				System.out.println("# Digite a quantidade de takes: ");
				cena.setQntTakes(input.nextInt());
				System.out.println("# Digite o take escolhido: ");
				cena.setTakeEscolhido(input.nextInt());
				System.out.println("#Quantas fitas deseja guardar a cena?");
				qf = input.nextInt();
				for(int i = 0 ; i<qf ; i++) {
					Fita f = new Fita();
					double capacidade = 0;
					System.out.println("# Capacidade da fita número " + (i+1) + " (minutos): ");
					capacidade = input.nextDouble();
					while(capacidade<cena.getDuracao()) {
						System.out.println("Espaço insuficiente para gravar a cena, "
								+ "escolher fita com capacidade superior à " + cena.getDuracao() + " minutos!");
						System.out.println("# Digite a capacidade da nova fita: ");
						capacidade = input.nextDouble();
					}
					f.setCapacidade(capacidade);
					cena.addFita(f);
				}
				System.out.println("# Seleciones os atores e os dublês: ");
				int m4 = 0;
				while(m4==0) {
					int opt = 0;
					System.out.println("1) Ator");
					System.out.println("2) Dublê");
					System.out.println("3) Sair");
					opt = input.nextInt();
					if(opt == 1) {
						String nome = "";
						for(int i = 0 ; i<pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
							if(pic.getProducoes().get(c).getFuncionarios().get(i) instanceof Ator) {
								System.out.println(pic.getProducoes().get(c).getFuncionarios().get(i).getNome());
							}
						}
						System.out.println("# Digite o nome do ator: ");
						nome = input.nextLine();
						nome = input.nextLine();
						for(int i = 0 ; i<pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
							if(pic.getProducoes().get(c).getFuncionarios().get(i).getNome().equals(nome)) {
								((Ator) pic.getProducoes().get(c).getFuncionarios().get(i)).addCena(cena);
							}
						}
					}
					if(opt == 2) {
						String nome = "";
						for(int i = 0 ; i<pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
							if(pic.getProducoes().get(c).getFuncionarios().get(i) instanceof Duble) {
								System.out.println(pic.getProducoes().get(c).getFuncionarios().get(i).getNome());
							}
						}
						System.out.println("# Digite o nome do dublê: ");
						nome = input.nextLine();
						nome = input.nextLine();
						for(int i = 0 ; i<pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
							if(pic.getProducoes().get(c).getFuncionarios().get(i).getNome().equals(nome)) {
								((Duble) pic.getProducoes().get(c).getFuncionarios().get(i)).addCena(cena);
							}
						}
					}
					else{
						m4 = 1;
					}
				}
				
			}
			if(m2==5) {
				System.out.println("# Folha de pagamentos: ");
				System.out.println("");
				double folha = 0;
				for(int i = 0; i< pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
					folha += pic.getProducoes().get(c).getFuncionarios().get(i).calculaSalario();
					System.out.println("Nome: " + pic.getProducoes().get(c).getFuncionarios().get(i).getNome()+
							"/ Valor à ser pago: " + pic.getProducoes().get(c).getFuncionarios().get(i).calculaSalario());
				}
				System.out.println("Valor total à ser pago aos colaboradores: R$" + folha);
			}
			if(m2==6) {
				int qf = 0;
				double duracao = 0;
				for(int i = 0 ; i<pic.getProducoes().get(c).getCenas().size() ; i++) {
					qf += pic.getProducoes().get(c).getCenas().get(i).getFitas().size();
					duracao += pic.getProducoes().get(c).getCenas().get(i).getDuracao();
				}
				System.out.println("Total de cenas: " + pic.getProducoes().get(c).getCenas().size());
				System.out.println("Quantidade de fitas: " + qf);
				System.out.println("Duração total da produção: " + duracao);
				System.out.println("#### CAST ####");
				System.out.println("");
				System.out.println("### Direção: ");
				for(int i = 0 ; i<pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
					if(pic.getProducoes().get(c).getFuncionarios().get(i) instanceof Ator) {
						System.out.println(pic.getProducoes().get(c).getFuncionarios().get(i).getNome());
					}
				}
				System.out.println("### Atores/Atrizes: ");
				for(int i = 0 ; i<pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
					if(pic.getProducoes().get(c).getFuncionarios().get(i) instanceof Ator) {
						System.out.println(pic.getProducoes().get(c).getFuncionarios().get(i).getNome());
					}
				}
				System.out.println("### Dublês: ");
				for(int i = 0 ; i<pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
					if(pic.getProducoes().get(c).getFuncionarios().get(i) instanceof Duble) {
						System.out.println(pic.getProducoes().get(c).getFuncionarios().get(i).getNome());
					}
				}
				System.out.println("### Camera Men: ");
				for(int i = 0 ; i<pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
					if(pic.getProducoes().get(c).getFuncionarios().get(i) instanceof CameraMan) {
						System.out.println(pic.getProducoes().get(c).getFuncionarios().get(i).getNome());
					}
				}
				System.out.println("### Produção: ");
				for(int i = 0 ; i<pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
					if(pic.getProducoes().get(c).getFuncionarios().get(i) instanceof Produtor) {
						System.out.println(pic.getProducoes().get(c).getFuncionarios().get(i).getNome());
					}
				}
				System.out.println("### Maquiagem: ");
				for(int i = 0 ; i<pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
					if(pic.getProducoes().get(c).getFuncionarios().get(i) instanceof Maquiador) {
						System.out.println(pic.getProducoes().get(c).getFuncionarios().get(i).getNome());
					}
				}
				System.out.println("### Manutenção: ");
				for(int i = 0 ; i<pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
					if(pic.getProducoes().get(c).getFuncionarios().get(i) instanceof Manutencao) {
						System.out.println(pic.getProducoes().get(c).getFuncionarios().get(i).getNome());
					}
				}
				System.out.println("### Serviços gerais: ");
				for(int i = 0 ; i<pic.getProducoes().get(c).getFuncionarios().size() ; i++) {
					if(pic.getProducoes().get(c).getFuncionarios().get(i) instanceof Faxineiro) {
						System.out.println(pic.getProducoes().get(c).getFuncionarios().get(i).getNome());
					}
				}
				System.out.println("");
			}
			if(m2==7) {
				System.out.println("Receita: R$" + (pic.getProducoes().get(c).receitaInvestidores() + pic.getProducoes().get(c).getValorVendaProducao()));
				System.out.println("Gastos: R$" + pic.getProducoes().get(c).gastoTotal());
				System.out.println("Faturamento: R$" + pic.getProducoes().get(c).faturamento());
			}
			if(m2==8) {
				menu1 = 1;
			}
		}
		
	}
	
	public static void menuPrincipal() {
		System.out.println("### Menu Principal ###");
		System.out.println("1) Cadastrar funcionários");
		System.out.println("2) Cadastrar investidores");
		System.out.println("3) Incluir despesas");
		System.out.println("4) Incluir cenas");
		System.out.println("5) Relatório folha de pagamento");
		System.out.println("6) Relatório produção");
		System.out.println("7) Relatório Receita-Gastos");
		System.out.println("8) Encerrar produção"); /*Incrementar "c" da produção*/
	}
	public static void menuCadastroFuncionario() {
		System.out.println("## Cadastro Funcionário ##");
		System.out.println("1) Ator");
		System.out.println("2) Duble");
		System.out.println("3) Camera Man");
		System.out.println("4) Diretor");
		System.out.println("5) Faxineiro");
		System.out.println("6) Manutenção");
		System.out.println("7) Maquiador");
		System.out.println("8) Produtor");
		System.out.println("9) Encerrar Cadastro");
	}
	
}
