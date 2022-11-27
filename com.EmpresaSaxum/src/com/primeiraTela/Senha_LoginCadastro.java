package com.primeiraTela;

import java.util.Scanner;

public class Senha_LoginCadastro {	
	// Declaração dos atributos / caracteristicas do objeto
	String nomeCompleto;
	String email;
	String emailValido;
	String login;
	String loginValido;
	String senha;
	String senhaValida;
	boolean comparacaoLoginSenha; // Aqui iremos comparar se é (false ou true) o login/loginValido e senha/senhaValida
	
	Scanner teclado = new Scanner(System.in); // Chamada de intereção do teclado com o Scanner
	
	void exibirNomeCompleto() {
		System.out.println("============================= SEJA BEM VINDO A SAXUM ==========================");
		System.out.println("Cadastre o seu nome completo: ");
		nomeCompleto = teclado.nextLine();
	}
	
	void exibirCadastroLogin() { // Primeiro metodo / ação, exibindo uma mensagem e pedindo uma interação do teclado para cadastrar o login
		System.out.println("Cadastre o nome do seu usuário: ");
		login = teclado.next();
	}
	
	void exibirEmail() {
		System.out.println("Cadastre o seu e-mail: ");
		email = teclado.next();
	}
	
	void exibirCadastroSenha() { // Segundo metodo / ação, exibindo uma mensagem e pedindo uma interação para o cadastro da senha.
		System.out.println("Cadastre a sua senha: ");
		senha = teclado.next();
	}
	
	void entrarLogin() { // Terceiro metodo / ação, pedindo o login cadastrado.
		System.out.println("============================= INFORME O SEU LOGIN =============================");
		System.out.println("Digite o nome do seu usuário: ");
		loginValido = teclado.next();
	}
	
	void entrarSenha() { // Quarto metodo / ação, pedindo a senha cadastrada.
		System.out.println("Digite a sua senha: ");
		senhaValida = teclado.next();
	}
	
	void comparacaoLoginSenha() { // Quinto metodo / ação, usaremos a comparação true e false para comparar, login/loginValido e senha/senhaValida
		if(login.equals(loginValido) && senha.equals(senhaValida)) { // Com o primeiro if verificamos se é false ou true. Se true mostraremos bem vindo ao usuario.
			System.out.println("===============================================================================");
			System.out.println("		Seja bem vindo, usuário: " + login);
		} else { // Se false iremos entrar com um for para entrar em um pequeno loop. 
			for(int tentativas = 1; tentativas <= 3; tentativas++) { // Aqui pediremos 3 vezes uma nova tentativa de entrar com a senha e login corretos
			System.out.println("     		Erro tente novamente! " + tentativas + " tentativas.");
			entrarLogin(); // Aqui usamos o metodo entrarLogin para complementar o for pedindo o login cadastrado novamente.
			entrarSenha(); // Aqui o metodo entrarSenha complementar o for pedindo a senha cadastrada novamente.
			
			if (login.equals(loginValido) && senha.equals(senhaValida)) { // Nesse if caso o usuario acertar o login e a senha após um erro usaremos o break
				System.out.println("===============================================================================");
				System.out.println("		Seja bem vindo, usuário: " + login);
				break; // O break foi usado para encerrar o for e avisar que o login foi bem sucedido e tambem foi usado primeiro que o if abaixo para ja encerrar o processo case acerte o login e senha.
			   }
			
			if (tentativas == 3) { // Um if sera usado para mostrar que a conta foi bloqueada, apos o usuario errar 3 vezes 
				System.out.println("===============================================================================");
				System.out.println("Erro conta bloqueada temporariamente!");
				System.out.println("Se esqueceu a sua senha, informe o seu e-mail: ");
				System.out.println("Digite o seu e-mail: ");
				emailValido = teclado.next(); // Pedindo o e-mail para confirmar se é o certo
				if (emailValido.equals(email)) { // Teste logico confirmando se é ou não o e-mail informado no login
					System.out.println("Enviaremos um link para a troca de senha no seu e-mail \nem até 24h, com atenção SAXUM!");
				} else { // Caso não seja bloqueamos a conta temporariamente
					System.out.println("Conta bloqueada, tente novamente mais tarde!");
					}
				}				
			}
		}
	}
}