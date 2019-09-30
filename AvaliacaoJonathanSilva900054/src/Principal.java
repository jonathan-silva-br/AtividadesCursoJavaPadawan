import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
		public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		int peso = teclado.nextInt();
		int idade = teclado.nextInt();
		ArrayList pena1 = new ArrayList();
		ArrayList superPena = new ArrayList();
		ArrayList medio = new ArrayList();
		ArrayList pena2 = new ArrayList();
		
		System.out.println("Seja bem vindo!");
		System.out.println("1 - Cadastrar Atletas");
		System.out.println("2 - Listar Atletas por Categoria");
		System.out.println("Informe uma opção negativa para sair");
		
		while(opcao > 0) {
			switch(opcao) {
			case 1:
				System.out.println("1 - Cadastrar Atletas");
				System.out.print("Informe o peso do atleta: ");
				peso = teclado.nextInt();
				System.out.print("Informe a idade do atleta: ");
				idade = teclado.nextInt();;
				if ((peso <= 20) && (idade >=7) && (idade <= 10)) {
					pena1.add(peso + idade);
					System.out.print("Atleta cadastrado na categoria Pena");
				}else {
						if((peso <= 20) && (idade >=11) && (idade <= 13)) {
							superPena.add(peso + idade);
							System.out.print("Atleta cadastrado na categoria Super Pena");
						}else {
							if((peso >= 21) && (peso <= 25) && (idade >=7) && (idade <= 10)) {
								medio.add(peso + idade);
								System.out.print("Atleta cadastrado na categoria Médio");
							}else {
								if((peso >= 21) && (peso <= 25) && (idade >=11) && (idade <= 13)) {
									pena2.add(peso + idade);
									System.out.print("Atleta cadastrado na categoria pena");
								}else {
									System.out.println("Atleta não compatível com as categorias do campeonato");
								}
							}
						}
					}
				}
				break;
		}
		
	}

  }

