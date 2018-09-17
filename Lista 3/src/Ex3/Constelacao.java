package Ex3;

import java.util.List;

public class Constelacao {

	public List<Estrela> constelacaoEstrela;
	public String nome;
	private Estrela estrela;

	public void adicionar(Estrela e) {
		this.constelacaoEstrela.add(e);
	}

	public Double maxTempConstelacao() {
		if (this.constelacaoEstrela.isEmpty())
			return new Double(0);

		double maxTemp = 0;
		List<Estrela> constelacaoEstrela2 = this.constelacaoEstrela;
		for (int i = 0; i < constelacaoEstrela2.size(); i++) {
			estrela = constelacaoEstrela2.get(i);
			if (Estrela.getTemperatura() > maxTemp)
				maxTemp = Estrela.getTemperatura();
		}
		return maxTemp;
	}

	public String getNome() {
		return this.nome;
	}

	public void infoEstrelas() {
		if (this.constelacaoEstrela.isEmpty())
			return;
		for (Estrela estrela : constelacaoEstrela)
			System.out.println();
	}

	public Constelacao(List<Estrela> constelacaoEstrela, String nome) {
		super();
		this.constelacaoEstrela = constelacaoEstrela;
		this.nome = nome;
	}
}