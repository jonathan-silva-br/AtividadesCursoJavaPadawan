import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pesoI = 0;
		int idadeI = 0;
		ArrayList pena1 = new ArrayList();
		ArrayList superPena = new ArrayList();
		ArrayList medio = new ArrayList();
		ArrayList pena2 = new ArrayList();
		System.out.println("Seja bem vindo!");
		System.out.println("1 - Cadastrar Atletas");
		System.out.println("2 - Listar Atletas por Categoria");
		System.out.println("Informe uma op��o negativa para sair");
		int opcao = teclado.nextInt();
		teclado.nextLine();
		
				
		while (opcao > 0) {
			switch(opcao){
				case 1: 
					System.out.println("1 - Cadastrar Atletas");
					System.out.print("Informe o peso do atleta: ");
					pesoI = teclado.nextInt();
					System.out.print("Informe a idade do atleta: ");
					idadeI = teclado.nextInt();
					if ((pesoI <= 20) && (idadeI >=7) && (idadeI <= 10)) {
						pena1.add(pesoI + idadeI);
						System.out.println("Atleta cadastrado na categoria Pena");
					}else {
							if((pesoI <= 20) && (idadeI >=11) && (idadeI <= 13)) {
								superPena.add(pesoI + idadeI);
								System.out.println("Atleta cadastrado na categoria Super Pena");
							}else {
								if((pesoI >= 21) && (pesoI <= 25) && (idadeI >=7) && (idadeI <= 10)) {
									medio.add(pesoI + idadeI);
									System.out.println("Atleta cadastrado na categoria M�dio");
								}else {
									if((pesoI >= 21) && (pesoI <= 25) && (idadeI >=11) && (idadeI <= 13)) {
										pena2.add(pesoI + idadeI);
										System.out.println("Atleta cadastrado na categoria pena");
									}else {
										System.out.println("Atleta n�o compat�vel com as categorias do campeonato");
									}
								}
							}
						}
					break;
				case 2:
					System.out.println("2 - Listar Atletas por Categoria");
					for(int x = 0; x <= pena1.size()-1; x++) {
						System.out.println("Categoria Pena 1: ");
						System.out.println("Atleta " + x );
					}
					for(int x = 0; x <= superPena.size()-1; x++) {
						System.out.println("Categoria Super Pena: ");
						System.out.println("Atleta " + x );
					}
					for(int x = 0; x <= medio.size()-1; x++) {
						System.out.println("Categoria M�dio: ");
						System.out.println("Atleta " + x );
					}
					for(int x = 0; x <= pena2.size()-1; x++) {
						System.out.println("Categoria Pena 2: ");
						System.out.println("Atleta " + x );
					}
					
				break;
			}
			System.out.println("1 - Cadastrar Atletas");
			System.out.println("2 - Listar Atletas por Categoria");
			System.out.println("Informe uma op��o negativa para sair");
			opcao = teclado.nextInt();
			teclado.nextLine();
	  }
	}

}


