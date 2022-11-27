package com.dadosEmpresa;
// Equipe 02: SM Antônio Marques, Vinicius Costa, Davi Barbosa, Aurélio Akehnaton, Thiago Araújo, Maria Victória, Luis Eduardo, Valber Medeiros, Pedro Martins e Sven Gabriel.
public class EntradaDadosEmpresa {

	public static void main(String[] args) {
		// Declaração da chamada das classes, clientes, funcionario, cadastroProduto e cadastroSalarioFolga		
		Clientes clientes = new Clientes();
		Funcionario funcionario = new Funcionario();
		Produto produto = new Produto();
		SalarioFolga salarioFolga = new SalarioFolga();
		// Abaixo as chamadas dos metodos de cada cadastro, cliente, produto, funcionario e salario / folga.
		System.out.println("============ Cadastro do Cliente ============");
		clientes.pedirNome(); 
		clientes.pedirEmail();
		clientes.pedirEndereco(); 
		clientes.pedirProdutoComprado();
		clientes.pedirValorProduto();
		
		System.out.println("=========== Cadastro de Produto ===========");
		clientes.pedirProdutoComprado(); 
		produto.pedirTipoProduto();
		produto.pedirValidadeProduto();
		clientes.pedirValorProduto(); 
		produto.exibirProdutoDisponivel();
		
		System.out.println("========== Cadastro do Funcionario ==========");
		clientes.pedirNome(); 
		clientes.pedirEmail(); 
		clientes.pedirEndereco(); 
		funcionario.pedirCargo();
		funcionario.pedirSalario();
		funcionario.pedirFolga();
		
		System.out.println("=========== Salario e Folga ===============");
		salarioFolga.informarSalarioBase();
		salarioFolga.informarDiasTrabalhados();
		salarioFolga.informarSalarioTotalSemDesconto();
		salarioFolga.informarDescontoNoSalario();
		salarioFolga.informarSalarioTotalComDesconto();
		funcionario.pedirFolga(); 		
	}
}