package com.dadosEmpresa;
// Clientes é uma classe filha da classe Pessoa
public class Clientes extends Pessoa {
	// Atributos / caracteristicas 
	String produtoComprado;
	String valorPagoProduto;
	// Metodos / Ações 
	void pedirProdutoComprado() {
		System.out.println("Digite o produto comprado: ");
		produtoComprado = teclado.nextLine();
	}
	
	void pedirValorProduto() {
		System.out.println("O valor do produto: ");
		valorPagoProduto = teclado.nextLine();
	}
}
