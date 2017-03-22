package model;

import java.util.ArrayList;

public class Ficha {
	private int id;
	private ArrayList<Vacincao> vacinacao;
	private ArrayList<Consulta> consulta;

	public Ficha(int id, ArrayList<Vacincao> vacinacao, ArrayList<Consulta> consulta) {
		this.id = id;
		this.vacinacao = vacinacao;
		this.consulta = consulta;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Vacincao> getVacinacao() {
		return vacinacao;
	}
	public void setVacinacao(ArrayList<Vacincao> vacinacao) {
		this.vacinacao = vacinacao;
	}

	public ArrayList<Consulta> getConsulta() {
		return consulta;
	}
	public void setConsulta(ArrayList<Consulta> consulta) {
		this.consulta = consulta;
	}
}
