import java.util.Scanner;

public class AloMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Qual é o seu nome? ");
		String nome = entrada.nextLine();
		
		System.out.print("Quantos anos você tem? ");
		int idade = entrada.nextInt();
		
		System.out.println("Olá, " + nome + " . Sua idade é: " + idade);
	}

}
