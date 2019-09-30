import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int Cpf[] = new int[3];
		Cpf[0] = 123456789;
		Cpf[1] = 987654321;
		Cpf[2] = 135798642;
		int Senha[] = new int[3];
		Senha[0] = 1234;
		Senha[1] = 4321;
		Senha[2] = 2468;
		float Saldo[] = new float[3];
		Saldo[0] = (float) 200.00;
		Saldo[1] = (float) 187.50;
		Saldo[2] = (float) 3.40;
		
		
		System.out.println("Bem vindo!");
		System.out.println("Informe o CPF: ");
		int cpf = 0;
		cpf = teclado.nextInt();
		System.out.println("Informe a SENHA: ");
		int senha = 0;
		senha = teclado.nextInt();
		if ((cpf == Cpf[0]) && (senha == Senha[0])) {
			System.out.println("Acesso autorizado");
			System.out.println("MENU DE OP��ES: ");
			System.out.println("2 - Dep�sito");
			System.out.println("3 - Saque");
			System.out.println("4 - Saldo");
			System.out.println("5 - Sair do Sistema");
			int opcao = 0;
			opcao = teclado.nextInt();
			while ((opcao > 0) || (opcao < 5)) {
				switch(opcao) {
					case 2:
						System.out.println("2 - Dep�sito");
						float deposito = (float) 0;
						System.out.println("Informe o valor desejado para o dep�sito: ");
						deposito = teclado.nextFloat();
						Saldo[0] += deposito;
						System.out.println("Dep�sito realizado com sucesso");
						break;
					case 3:
						System.out.println("3 - Saque");
						System.out.println("Informe o valor desejado para saque: ");
						float saque = (float) 0;
						saque = teclado.nextFloat();
						if (Saldo[0] > saque) {
							Saldo[0] -= saque;
						}else {
							System.out.println("Saldo Insuficiente");
						}
						break;
					case 4:
						System.out.println("4 - Saldo");
						System.out.println("Seu saldo dispon�vel � de " + Saldo[0]);
						break;
					default:
				}
				System.out.println("MENU DE OP��ES: ");
				System.out.println("2 - Dep�sito");
				System.out.println("3 - Saque");
				System.out.println("4 - Saldo");
				System.out.println("5 - Sair do Sistema");
				opcao = teclado.nextInt();
			}
		}else {
			if ((cpf == Cpf[1]) && (senha == Senha[1])) {
				System.out.println("Acesso autorizado");
				System.out.println("MENU DE OP��ES: ");
				System.out.println("2 - Dep�sito");
				System.out.println("3 - Saque");
				System.out.println("4 - Saldo");
				System.out.println("5 - Sair do Sistema");
				int opcao = 0;
				opcao = teclado.nextInt();
				while ((opcao > 0) || (opcao < 4)) {
					switch(opcao) {
						case 2:
							System.out.println("2 - Dep�sito");
							float deposito = (float) 0;
							System.out.println("Informe o valor desejado para o dep�sito: ");
							deposito = teclado.nextFloat();
							Saldo[1] += deposito;
							System.out.println("Dep�sito realizado com sucesso");
							break;
						case 3:
							System.out.println("3 - Saque");
							System.out.println("Informe o valor desejado para saque: ");
							float saque = (float) 0;
							saque = teclado.nextFloat();
							if (Saldo[1] > saque) {
								Saldo[1] -= saque;
							}else {
								System.out.println("Saldo Insuficiente");
							}
							break;
						case 4:
							System.out.println("4 - Saldo");
							System.out.println("Seu saldo dispon�vel � de " + Saldo[1]);
							break;
						default:
				}
			} else {
				if ((cpf == Cpf[2]) && (senha == Senha[2])) {
					System.out.println("Acesso autorizado");
					System.out.println("MENU DE OP��ES: ");
					System.out.println("2 - Dep�sito");
					System.out.println("3 - Saque");
					System.out.println("4 - Saldo");
					System.out.println("5 - Sair do Sistema");
					int opcao = 0;
					opcao = teclado.nextInt();
					while ((opcao > 0) || (opcao < 4)) {
						switch(opcao) {
							case 2:
								System.out.println("2 - Dep�sito");
								float deposito = (float) 0;
								System.out.println("Informe o valor desejado para o dep�sito: ");
								deposito = teclado.nextFloat();
								Saldo[2] += deposito;
								System.out.println("Dep�sito realizado com sucesso");
								break;
							case 3:
								System.out.println("3 - Saque");
								System.out.println("Informe o valor desejado para saque: ");
								float saque = (float) 0;
								saque = teclado.nextFloat();
								if (Saldo[2] > saque) {
									Saldo[2] -= saque;
								}else {
									System.out.println("Saldo Insuficiente");
								}
								break;
							case 4:
								System.out.println("4 - Saldo");
								System.out.println("Seu saldo dispon�vel � de " + Saldo[2]);
								break;
							default:
						}
					}
			}
		}
		System.out.println("Usu�rio/senha incorretos");
		System.out.println("Acesso negado");
		System.out.println("Execute novamente");
		
	}
  }
}
