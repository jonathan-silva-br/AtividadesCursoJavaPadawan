import java.util.Scanner;

public class AloMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Qual � o seu nome? ");
		String nome = entrada.nextLine();
		
		System.out.print("Quantos anos voc� tem? ");
		int idade = entrada.nextInt();
		
		System.out.println("Ol�, " + nome + " . Sua idade �: " + idade);
	}

}
