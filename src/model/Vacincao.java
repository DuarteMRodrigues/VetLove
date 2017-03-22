package model;

import java.util.Date;

public class Vacincao {
	private int id;
	private String nome;
	private double preco;
	private Date dataVacina;

	public Vacincao(int id, String nome, double preco, Date dataVacina) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.dataVacina = dataVacina;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getDataVacina() {
		return dataVacina;
	}
	public void setDataVacina(Date dataVacina) {
		this.dataVacina = dataVacina;
	}
}
