import java.util.Scanner;

public class JonathanSilva900054 {
// JonathanSilva900054
	
public static void main(String[] args) {
	System.out.println("1 - Cadastro de Aluno");
	System.out.println("2 - Aluno e m�dia da maior m�dia");
	System.out.println("3 - Aluno e m�dia da menor m�dia");
	System.out.println("4 - Listar alunos, m�dia e situa��o");
	System.out.println("Escreva um n�mero (menor que 0 para encerrar)");
	Scanner t = new Scanner(System.in);
	int numero = t.nextInt();
	String alunos[] = new String[10];
	float notas[] = new float[4];
	float media = 0;
	float medias[] = new float[10];

	while (numero >= 0) {
		switch (numero) {
		case 1:
			System.out.println("Op��o 1 selecionada!");

			for (int x = 0; x <= 9; x++) {
				System.out.println("");
				System.out.println("Informe o nome do " + (x + 1) + "� aluno:");
				alunos[x] = t.next();
				media = 0;

				for (int y = 0; y <= 3; y++) {
					System.out.println("Informe a " + (y + 1) + "� nota:");
					notas[y] = t.nextInt();
					if (notas[y] >= 10 && notas[y] <= 0) {
						media = media + notas[y];

					} else {
						while (notas[y] < 0 || notas[y] > 10) {
							System.out.println("Nota inv�lida");
							System.out.println("");
							System.out.println("Informe a " + (y + 1) + "� nota:");
							notas[y] = t.nextInt();

						}
						media = media + notas[y];
					}

				}
				medias[x] = media / 4;
				System.out.println("M�dia:" + medias[x]);
			}
			break;
		case 2:
			System.out.println("Op��o 2 selecionada!");
			int Maior = 0;
			for (int x = 0; x <= 9; x++) {
				if (medias[Maior] < medias[x]) {
					Maior = x;
				}
			}
			System.out.println("O aluno e m�dia da maior �: " + alunos[Maior] + " com a m�dia " + medias[Maior]);
			break;
		case 3:
			System.out.println("Op��o 3 selecionada!");
			int Menor = 0;
			for (int x = 0; x <= 9; x++) {
				if (medias[Menor] > medias[x]) {
					Menor = x;
				}
			}
			System.out.println("O aluno e m�dia da maior �: " + alunos[Menor] + " com a m�dia " + medias[Menor]);
			break;
		case 4:
			System.out.println("Op��o 4 selecionada");
			for (int x = 0; x <= 9; x++) {
				System.out.println(
						"O aluno " + alunos[x] + " obteve a m�dia " + medias[x] + " e est� " + situacao(medias[x]));

			}
			break;

		default:
			System.out.println("Op��o inv�lida");

		}
		System.out.println("");
		System.out.println("1 - Cadastro de Aluno");
		System.out.println("2 - Aluno e m�dia da maior m�dia");
		System.out.println("3 - Aluno e m�dia da menor m�dia");
		System.out.println("4 - Listar alunos, m�dia e situa��o");
		System.out.println("5 - Escreva um n�mero (menor que 0 para encerrar)");
		numero = t.nextInt();
	}

}

public static String situacao(float media) {
	String situacao;

	if (media >= 7) {
		situacao = "Aprovado";
	} else if (media >= 5) {
		situacao = "EXAME";
	} else {
		situacao = "Reprovado";
	}

	return situacao;

}
}
		