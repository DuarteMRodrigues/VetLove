package controller;

import java.util.ArrayList;

import model.Classificacao;

public class AdicionarClassificacao {
	public ArrayList<Classificacao> AdicionarClassificacao(ArrayList<Classificacao> classi){
		
		Classificacao cla = new Classificacao();
		cla.setId(classi.size());
		cla.setNome("Gato");
		classi.add(cla);
		
		return classi;
	}
}
