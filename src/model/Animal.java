package model;

import java.util.Date;

public class Animal {
	private int id;
	private int idClassificacao;
	private int idFicha;
	private String raca;
	private String dataNascimento;

	public Animal(int id, int idClassificacao, String raca, String dataNascimento) {
		this.id = id;
		this.idClassificacao = idClassificacao;
		this.raca = raca;
		this.dataNascimento = dataNascimento;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getClassificacao() {
		return idClassificacao;
	}
	public void setClassificacao(int idClassificacao) {
		this.idClassificacao = idClassificacao;
	}

	public int getFicha() {
		return idFicha;
	}
	public void setFicha(int idFicha) {
		this.idFicha = idFicha;
	} 
}
