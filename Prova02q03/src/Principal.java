import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		ArrayList lista = new ArrayList();
		
		System.out.println("2 - Listar Atleta");
		System.out.println("Opção");
		int op = t.nextInt();
		while (op >= 0) {
			switch (op) {
			case 1:
				Atlet a = new Atlet();
				System.out.println("Nome: ");
				a.setNome(t.nextLine());
				System.out.println("Idade: ");
				a.setIdade(t.nextLine());
				System.out.println("Peso: ");
				a.setPeso(t.nextLine());
				
			}
		}

	}

}
