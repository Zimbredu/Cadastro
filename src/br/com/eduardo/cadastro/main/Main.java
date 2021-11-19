package br.com.eduardo.cadastro.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.eduardo.cadastro.CadastroPessoal;


public class Main {

	public static void main(String[] args) {
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
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
			try {
			
			cadastro.setCpfUsuario(teclado.next());
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			List<CadastroPessoal> nome = new ArrayList<>();
			nome.add(cadastro);

			List<CadastroPessoal> numeroCpf = new ArrayList<>();
			numeroCpf.add(cadastro);

			System.out.println("User name " + cadastro.getNomeUsuario() + " successfully registered");
			System.out.println("User id number " + cadastro.getCpfUsuario() + " registered successfully ");
			System.out.println("Do you want register someone? Y/N");
			resposta = confirma.next().toUpperCase();
			
			

//			for (CadastroPessoal i : nome)
//				System.out.println(i);

		}

		teclado.close();
		confirma.close();
	}
}
