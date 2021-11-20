package br.com.eduardo.cadastro.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.eduardo.cadastro.CadastroPessoal;


public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Scanner confirma = new Scanner(System.in);
		CadastroPessoal cadastro = new CadastroPessoal(null, null);
		System.out.println("Entre com os dados para cadastro.");
		System.out.print("**************************************\n");
		String s = "N";
		String resposta = " ";

		while (true) {
			if (s.equals(resposta)) {
				System.out.println("Data entry finished!...");
				break;
			}
			System.out.println("Enter the name.");
			cadastro.setNomeUsuario(teclado.next());
			
			System.out.println("Enter id..");
			
			cadastro.setCpfUsuario(teclado.next());
			
			List<CadastroPessoal> nome = new ArrayList<>();
			nome.add(cadastro);

			List<CadastroPessoal> numeroCpf = new ArrayList<>();
			numeroCpf.add(cadastro);

			System.out.println("User name " + cadastro.getNomeUsuario() + " successfully registered");
			System.out.println("User id number " + cadastro.getCpfUsuario() + " registered successfully ");
			System.out.println("Do you want register someone? Y/N");
			resposta = confirma.next().toUpperCase();

		}

		teclado.close();
		confirma.close();
	}
}
