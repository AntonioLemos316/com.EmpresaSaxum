package com.primeiraTela;

public class Senha_Login {
 // Equipe 02: SM Antônio Marques, Vinicius Costa, Davi Barbosa, Aurélio Akehnaton, Thiago Araújo, Maria Victória, Luis Eduardo, Valber Medeiros, Pedro Martins e Sven Gabriel.
	
	@SuppressWarnings({ "static-access" }) // relacionado ao metodo Sleep
	public static void main(String[] args) throws InterruptedException {
		
		Senha_LoginCadastro cadLogin = new Senha_LoginCadastro(); // Declaração da chamada cadLogin, para pedir a classe Senha_LoginCadastro(); os metodos da mesma
					
		cadLogin.exibirNomeCompleto(); 
		cadLogin.exibirCadastroLogin(); // Chamada do metodo exibirCadastroLogin pedindo para cadastrar um email / login
		cadLogin.exibirEmail();
		cadLogin.exibirCadastroSenha(); // Chamada do metodo exibirCadastroSenha pedindo para cadastrar uma senha
		new Thread().sleep(600); // Aqui uma função Sleep, para sentir como se tivesse processando e guardando os dados cadastrados.
		
		cadLogin.entrarLogin(); // Chamada do metodo entrarLogin pedindo o login que foi cadastrado
		cadLogin.entrarSenha();	// Chamada do metodo entrarSenha pedindo a senha que foi cadastrada
		new Thread().sleep(500); // Outra função Sleep, para sentir que ta carregando a confirmação dos dados cadastrados e de login.	
		
		cadLogin.comparacaoLoginSenha(); // Aqui toda a comparação dos dados informados nos metodos anteriores.	
	}
}