package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import model.Animal;
import model.Classificacao;
import model.Cliente;

public class NovoAnimal {
	public ArrayList<Cliente> NovoAnimal(ArrayList<Cliente> clientes, ArrayList<Classificacao> classi){
		int id, escolheCla;
		String raca, dataNascimento;
		ArrayList<Animal> animal = new ArrayList<Animal>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nInsira o id do Cliente: ");
		id = s.nextInt();
		s.nextLine();
		
		System.out.print("\nEscolha a classificacao do animal: ");
		for(int i = 0; i < classi.size(); i++){
			System.out.print("\n" + (i+1) + " - " + classi.get(i).getNome());
		}
		escolheCla = s.nextInt();
		s.nextLine();
		
		escolheCla -= 1;
		
		System.out.print("\n\nInsira a Raça do animal: ");
		raca = s.nextLine();
		
		System.out.print("\n\nInsira a Data de Nascimento do animal: ");
		dataNascimento = s.nextLine();
		
		Animal ani = new Animal(id, escolheCla, raca, dataNascimento);
		animal.add(ani);
		
		clientes.get(id).setAnimal(animal);
		
		return clientes;
	}
}
