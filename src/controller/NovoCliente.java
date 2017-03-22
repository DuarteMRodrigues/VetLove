package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class NovoCliente {
	public ArrayList<Cliente> NovoCliente(ArrayList<Cliente> clientes){
		String nome;
		String morada;
		String email;
		int telefone;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nInsira o nome do Cliente: ");
		nome = s.nextLine();
		
		System.out.print("\nInsira a morada do Cliente: ");
		morada = s.nextLine();
		
		System.out.print("\nInsira o email do Cliente: ");
		email = s.nextLine();
		
		System.out.print("\nInsira o telefone do Cliente: ");
		telefone = s.nextInt();
		
		Cliente cli = new Cliente(clientes.size(), telefone, nome, morada, email);
		clientes.add(cli);
		
		return clientes;
	}
}
