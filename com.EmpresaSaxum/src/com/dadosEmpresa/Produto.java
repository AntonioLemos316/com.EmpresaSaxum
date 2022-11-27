package com.dadosEmpresa;

import java.util.Scanner;

public class Produto {
	// Atributos / caracteristicas da classe Produto
	String tipoProduto;
	String validadeProduto;
	String produtoDisponivel = "está disponivel no estoque";
	
	Scanner teclado = new Scanner(System.in);
	// Metodos / Ações da classe Produto
	void pedirTipoProduto() {
		System.out.println("Digite o tipo do produto: ");
		tipoProduto = teclado.nextLine();
	}
		
	void pedirValidadeProduto() {
		System.out.println("Informe a quantidade de meses de validade do produto: ");
		validadeProduto = teclado.nextLine();
	}

	void exibirProdutoDisponivel() {
		System.out.println("O produto: " + produtoDisponivel);
	}
	
}
