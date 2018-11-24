import java.util.ArrayList;

import Producoes.Producao;

public class ProdInCena {
	private ArrayList<Producao> producoes;

	public ProdInCena() {
		producoes = new ArrayList<Producao>();
	}

	public ArrayList<Producao> getProducoes() {
		return producoes;
	}

	public void setProducoes(ArrayList<Producao> producoes) {
		this.producoes = producoes;
	}
	
	public void addProducao(Producao producao) {
		producoes.add(producao);
	}
	
	public void removeProducao(int position) {
		producoes.remove(position);
	}
	
	
	
}
