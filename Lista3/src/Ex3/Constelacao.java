package Ex3;

import java.util.ArrayList;

public class Constelacao {
	private String nome;
	ArrayList<Estrela> estrelas;

	public String getNome() {
		return nome;
	}

	public Constelacao() {
		this.nome = nome;
		this.estrelas = new ArrayList<Estrela>();
	}

	public void adicionarEstrela(Estrela e) {
		if (e != null && !estrelas.contains(e)) {
			estrelas.add(e);
		} else {
			System.out.println("Erro");
		}
	}

	public void infoEstrelas() {
		for (Estrela estrela : estrelas) {
			estrela.mostrar();
		}
	}

	public double maiorTemp() {
		double aux = estrelas.get(0).getTemperatura();
		for (Estrela estrela : estrelas) {
			aux = Math.max(aux, estrela.getTemperatura());
		}
		System.out.println("Maior temperatura: " + aux);
		return aux;
	}

	public double tempConstelacao() {
		double vtotal = 0;
		for (Estrela estrela : estrelas) {
			vtotal += estrela.getTemperatura();
		}
		System.out.println("A soma das temperaturas é:" + vtotal);
		return vtotal;
	}
}
