package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Classificacao;
import model.Cliente;

public class Principal {
	public static void main(String[] args) {
		int escolha;
		Scanner s = new Scanner(System.in);
		
		ArrayList<Cliente> cli = new ArrayList<Cliente>();
		ArrayList<Classificacao> classi = new ArrayList<Classificacao>();
		
		NovoCliente novoCli = new NovoCliente();
		NovoAnimal novoAni = new NovoAnimal();
	    AdicionarClassificacao novaClassi = new AdicionarClassificacao();
		
	    classi = novaClassi.AdicionarClassificacao(classi);
		
		do{
			System.out.println("1 - Inserir Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Inserir Animal");
			System.out.println("4 - Inserir Animaais");
			System.out.println("5 - Consultas de Cliente");
			System.out.println("6 - Dinheiro gasto em Vacinas");
			System.out.println("99 - Sair");
			escolha = s.nextInt();
			s.nextLine();
			
			switch(escolha){
				case 1:
					cli = novoCli.NovoCliente(cli);
					break;
					
				case 2:
					new ListagemCliente(cli);
					break;
					
				case 3:
					cli = novoAni.NovoAnimal(cli, classi);
					break;
					
				case 4:
					new ListagemAnimal(cli);
					break;
					
				case 5:
					
					break;
					
				case 6:
					
					break;
					
				case 99:
					System.out.println("\n\nAdeus");
					break;
					
				default:
					System.out.println("\n\nEscolha Invalida");
					break;
	
			}
			
			System.out.print("\n\nPressione a tecla enter para continuar...");
			s.nextLine();
		}while(escolha != 99);
	}
}
