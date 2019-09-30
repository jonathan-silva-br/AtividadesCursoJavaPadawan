import java.util.Scanner;

public class JonathanSilva900054 {
// JonathanSilva900054
	
public static void main(String[] args) {
	System.out.println("1 - Cadastro de Aluno");
	System.out.println("2 - Aluno e média da maior média");
	System.out.println("3 - Aluno e média da menor média");
	System.out.println("4 - Listar alunos, média e situação");
	System.out.println("Escreva um número (menor que 0 para encerrar)");
	Scanner t = new Scanner(System.in);
	int numero = t.nextInt();
	String alunos[] = new String[10];
	float notas[] = new float[4];
	float media = 0;
	float medias[] = new float[10];

	while (numero >= 0) {
		switch (numero) {
		case 1:
			System.out.println("Opção 1 selecionada!");

			for (int x = 0; x <= 9; x++) {
				System.out.println("");
				System.out.println("Informe o nome do " + (x + 1) + "º aluno:");
				alunos[x] = t.next();
				media = 0;

				for (int y = 0; y <= 3; y++) {
					System.out.println("Informe a " + (y + 1) + "ª nota:");
					notas[y] = t.nextInt();
					if (notas[y] >= 10 && notas[y] <= 0) {
						media = media + notas[y];

					} else {
						while (notas[y] < 0 || notas[y] > 10) {
							System.out.println("Nota inválida");
							System.out.println("");
							System.out.println("Informe a " + (y + 1) + "ª nota:");
							notas[y] = t.nextInt();

						}
						media = media + notas[y];
					}

				}
				medias[x] = media / 4;
				System.out.println("Média:" + medias[x]);
			}
			break;
		case 2:
			System.out.println("Opção 2 selecionada!");
			int Maior = 0;
			for (int x = 0; x <= 9; x++) {
				if (medias[Maior] < medias[x]) {
					Maior = x;
				}
			}
			System.out.println("O aluno e média da maior é: " + alunos[Maior] + " com a média " + medias[Maior]);
			break;
		case 3:
			System.out.println("Opção 3 selecionada!");
			int Menor = 0;
			for (int x = 0; x <= 9; x++) {
				if (medias[Menor] > medias[x]) {
					Menor = x;
				}
			}
			System.out.println("O aluno e média da maior é: " + alunos[Menor] + " com a média " + medias[Menor]);
			break;
		case 4:
			System.out.println("Opção 4 selecionada");
			for (int x = 0; x <= 9; x++) {
				System.out.println(
						"O aluno " + alunos[x] + " obteve a média " + medias[x] + " e está " + situacao(medias[x]));

			}
			break;

		default:
			System.out.println("Opção inválida");

		}
		System.out.println("");
		System.out.println("1 - Cadastro de Aluno");
		System.out.println("2 - Aluno e média da maior média");
		System.out.println("3 - Aluno e média da menor média");
		System.out.println("4 - Listar alunos, média e situação");
		System.out.println("5 - Escreva um número (menor que 0 para encerrar)");
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
		