import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("1 - Ler 10 valores do vetor ");
		System.out.println("2 - Imprimir 10 valores do vetor ");
		System.out.println("3 - Imprimir media dos valores do vetor ");
		System.out.println("4 - Imprimir maior e menor valor do vetor ");
		System.out.println("5 - Imprimir o vetor em ordem crescente ");
		System.out.println("Informe um valor: (< que 0 para encerrar) ");
		int opcao = t.nextInt();
		int valores[] = new int [10];
		while (opcao >= 0) {
			switch (opcao) {
			case 1:
				System.out.println("Opção 1 selecionada");
				for (int x = 0 ; x <= 9; x++) {
					System.out.println("Informe o valor " + x + " :");
					valores[x] = t.nextInt();
				}
				break;
			case 2:
				System.out.println("Opção 2 selecionada");
				for (int x = 0 ; x <= 9; x++) {
					System.out.println("Valor " + x + "=" + valores[x]);
				}
				break;
			case 3:
				System.out.println("Opção 3 selecionada");
				float media = 0;
				for (int x = 0 ; x <= 9; x++) {
					media += valores[x];
				}
				media = media / 10;
				System.out.println("A media dos valores do vetor é " + media);
				break;
			case 4:
				System.out.println("Opção 4 selecionada");
				int maior = 0;
				int menor = 999999;
				for (int x = 0 ; x <= 9; x++) {
				 if (maior < valores[x] ) {
					 maior = valores[x];					 
				 }
				 if (menor > valores[x]) {
					 menor = valores[x];
				 }
				}
				System.out.println("O maior valor do vetor é " + maior);
				System.out.println("O menor valor do vetor é " + menor);
				break;	
			case 5:
				System.out.println("Opção 5 selecionada");
				for (int y = 0 ; y <= 9-1; y++) {
					boolean isTroca = false;
					for (int x = 0 ; x <= 8; x++) {
					  	if (valores[x] > valores[x+1] ) {
					  		isTroca = true;
					  		int troca = valores[x];
					  		valores[x] = valores[x+1];
					  		valores[x+1] = troca;
					  	}
					 }
					
					if (isTroca == false) {
						break;
					}
				}
				for (int x = 0 ; x <= 9; x++) {
					System.out.println("Valor " + x + "=" + valores[x]);
				}
				break;
			default:
				System.out.println("Opção inválda");
			}
			
			System.out.println("1 - Ler 10 valores do vetor ");
			System.out.println("2 - Imprimir 10 valores do vetor ");
			System.out.println("3 - Imprimir media dos valores do vetor ");
			System.out.println("4 - Imprimir maior e menor valor do vetor ");
			System.out.println("5 - Imprimir o vetor em ordem crescente ");
			System.out.println("Informe um valor: (< que 0 para encerrar) ");
			opcao = t.nextInt();
		}
		
	}

}
