import java.util.Scanner;

public class MediaAlu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		String nome = teclado.nextLine();		
		while ( ! nome.equalsIgnoreCase("fim")) {
			float media = 0;
			for(int x = 1 ; x <= 4 ; x++ ) {
				System.out.println("Informe a nota " + x + ": ");
				media += teclado.nextFloat();
			}
			media = media / 4;
			System.out.println(nome + " - media " + media + " - " + situacaoAluno(media));			
			System.out.println("Informe o nome do aluno: (Fim para encerrar a execução)");
			teclado.nextLine();
			nome = teclado.nextLine();
		}
		
	}

	public static String situacaoAluno(float media) {
		String situacao = "";
		if (media >= 7) {
			situacao = "APROVADO";
		}else {
			if (media >= 5) {
				situacao = "EXAME";
			}else {
				situacao = "REPROVADO";
			}
		}
		return situacao;
	}
}
