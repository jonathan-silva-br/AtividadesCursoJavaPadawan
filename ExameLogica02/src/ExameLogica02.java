import java.util.Scanner;

public class ExameLogica02 {

	public static void main(String[] args) {
		String nomes[] = new String[10];
		float media[] = new float[10];
		Scanner teclado = new Scanner(System.in);
		System.out.println("1 - Cadastrar Aluno: ");
		System.out.println("2 - Maior Média: ");
		System.out.println("3 - Menor Média: ");
		System.out.println("4 - Listar Alunos/Media/Situacao: ");
		System.out.println("Informe um valor: ");
		int valor = teclado.nextInt();
		teclado.nextLine();
		while (valor >= 0) {
			switch (valor) {
				case 1:
					System.out.println("****Cadastrar Aluno***");
					for (int x = 0; x <= 9; x++) {
						System.out.println("Informe o nome do aluno " + x + ": ");
						nomes[x] = teclado.nextLine();
						media[x] = 0;
						for (int contNotas = 0; contNotas <= 3; contNotas ++) {
							float nota = 0;
							System.out.println("Informe a nota " + contNotas + ": ");
							nota = teclado.nextFloat();
							while ((nota < 0) || (nota > 10)) {
								System.out.println("Informe a nota " + contNotas + "(entre 0 e 10): ");
								nota = teclado.nextFloat();
							}
							media[x] += nota; 
						}
						media[x] = media[x] / 4;
					}
					break;
				case 2:
					System.out.println("****Maior Média***");
					int maior = 0;
					for (int x = 0; x <= 9; x++) {
						if (media[x] > media[maior]) {
							maior = x;
						}
					}
					System.out.println("O aluno " + nomes[maior] + " obteve média igual a " + media[maior]);
					break;
				case 3:
					System.out.println("****Menor Média***");
					int menor = 0;
					for (int x = 0; x <= 9; x++) {
						if (media[x] < media[menor]) {
							menor = x;
						}
					}
					System.out.println("O aluno " + nomes[menor] + " obteve média igual a " + media[menor]);
					break;
				case 4:
					System.out.println("****Listar Alunos/Media/Situacao***");
					for (int x = 0; x <= 9; x++) {
						String situacao = "";
						if (media[x] >= 7) {
							situacao = "APROVADO!";
						} else {
							if (media[x] >= 5) {
								situacao = "EM EXAME!";
							} else {
								situacao = "REPROVADO!";
							}
						}
						System.out.println("O aluno " + nomes[x] + " obteve média igual a " + media[x] + " e está " + situacao);
					}
					break;
				default:
					System.out.println("****Opção Inválida!***");
			}
			System.out.println("1 - Cadastrar Aluno: ");
			System.out.println("2 - Maior Média: ");
			System.out.println("3 - Menor Média: ");
			System.out.println("4 - Listar Alunos/Media/Situacao: ");
			System.out.println("Informe um valor:  (negativo para encerrar execução) ");
			valor = teclado.nextInt();
			teclado.nextLine();
		}
	} 

}
