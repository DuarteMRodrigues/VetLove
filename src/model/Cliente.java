package model;

import java.util.ArrayList;

public class Cliente {
	private int id;
	private int telefone;
	private String nome;
	private String morada;
	private String email;
	private ArrayList<Animal> animal;
	
	public Cliente(int id, int telefone, String nome, String morada, String email) {
		this.id = id;
		this.telefone = telefone;
		this.nome = nome;
		this.morada = morada;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Animal> getAnimal() {
		return animal;
	}
	public void setAnimal(ArrayList<Animal> animal) {
		this.animal.addAll(animal);
	}
}
