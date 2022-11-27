package com.dadosEmpresa;

import java.util.Scanner;

public class SalarioFolga {
	// Atributos / Caracteristicas
	double salarioBase;
	int diasTrabalhados = 365;
	
	Scanner teclado = new Scanner(System.in);
	
	// Metodos / Ações 
	void informarSalarioBase() {
		System.out.println("Informe o seu salario base: ");
		salarioBase = teclado.nextDouble();
	}
	
	void informarDiasTrabalhados() {
		System.out.println("Você trabalhou durante " + diasTrabalhados + " dias");
	}
	
	void informarSalarioTotalSemDesconto() {
		System.out.println("O salario total sem desconto é: R$" + salarioBase * 12);
	}
	
	void informarDescontoNoSalario() {
		System.out.println("Você teve o desconto no salario de R$" + salarioBase);
	}
	
	void informarSalarioTotalComDesconto( ) {
		System.out.println("O salario que você vai receber com desconto é no total de: R$" + ((salarioBase * 12) - salarioBase));
	}
}