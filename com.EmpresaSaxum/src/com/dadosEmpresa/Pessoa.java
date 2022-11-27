package com.dadosEmpresa;

import java.util.Scanner;
// Classe Pai de Funcionario / Clientes. E de acordo com as boa praticas um Cliente / Funcionario pode ser dito que (é uma ou é um) Pessoa.
public class Pessoa {
	// Atributos / caracteristicas 
	String nome;
	String email;
	String endereco;
	// Chamada do scanner para fazer a interação do teclado.	
	Scanner teclado = new Scanner(System.in);
	// Metodos / Ações 
	void pedirNome() {
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine();
	}	
	
	void pedirEmail() {
		System.out.println("Digite o seu e-mail: ");
		email = teclado.nextLine();
	}
	
	void pedirEndereco() {
		System.out.println("Digite o seu endereço: ");
		endereco = teclado.nextLine();
	}
}