package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class ListagemAnimal {

	public ListagemAnimal(ArrayList<Cliente> cli){
		int id;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nInsira o id do Cliente: ");
		id = s.nextInt();
		
		for(int i = 0; i < cli.get(id).getAnimal().size(); i++){
			System.out.print("\nID: " +cli.get(id).getAnimal().get(i).getId());
			System.out.print("\nID: " +cli.get(id).getAnimal().get(i).getRaca());
			System.out.print("\nID: " +cli.get(id).getAnimal().get(i).getDataNascimento());
		}
	}
}
