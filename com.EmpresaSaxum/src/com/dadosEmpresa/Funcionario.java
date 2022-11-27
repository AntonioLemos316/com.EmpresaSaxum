package com.dadosEmpresa;
//Funcionario é uma classe filha de Pessoa
public class Funcionario extends Pessoa{
	// Atributos / Caracteristicas
	String cargo;
	String salario;
	String folga = "sem folga";
	// Metodos / Ações da classe Produto
	void pedirCargo() {
		System.out.println("Informe o seu Cargo: ");
		cargo = teclado.nextLine();
	}
	
	void pedirSalario() {
		System.out.println("Informe o seu Salario: ");
		salario = teclado.nextLine();
	}
	
	void pedirFolga() {
		System.out.println("Você está " + folga);
	}
}