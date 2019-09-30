import java.util.Scanner;

public class PrincipalString {
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe a palavra: (Fim para encerrar)");
		String p = t.nextLine();
		while(! p.equalsIgnoreCase("fim")) 
			
			System.out.println(invertePalavra(p));
			System.out.println("");
			System.out.println("Informe a palavra: (Fim para encerrar)");
			p = t.nextLine();
		}
		
		public static String invertePalavra(String p) {
			String invertida = "";
			for (int x = p.length()-1; x >= 0; x--) {
				invertida += p.charAt(x);
			}
			return invertida;
		}
		public static boolean isPalindrome(String p) {
			if (p.equalsIgnoreCase(invertePalavra(p))) {
				return true;
			} else {
				return false;
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		/*
		String str = "Blumenau em cadernos!";
		
		System.out.println("posicao 1: " + str.charAt(0));
		System.out.println("posicao 1: " + str.charAt(1));
		System.out.println("Inicio 1 e Fim 5: " + str.substring(1, 5));
		System.out.println("Tamanho: " + str.length());
		
		
		System.out.println(str);
		for (int y = 1; y <= str.length()-1; y++) {
			for (int x = y; x <= str.length()-1; x++) {
				System.out.print(str.charAt(x));
			}
			System.out.println("");
		}
		for (int x = 1; x <= str.length()-1; x++) {
			System.out.print(str.substring(x));
			System.out.println("");
		}
		for (int x = 21; x < str.length()+1; x--) {
			System.out.print(str.substring(x));
			System.out.println("");
		}
		*/
	}

}
