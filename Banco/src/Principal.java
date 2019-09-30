import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cliente cliente[] = new Cliente[3];
		cliente[0].setNome("Jonathan");
		cliente[1].setNome("Ana");
		cliente[2].setNome("Marcos");
		cliente[0].setCPF("089.547.029-29");
		cliente[1].setCPF("123.456.789-01");
		cliente[2].setCPF("987.654.321-01");
		cliente[0].setSenha(1234);
		cliente[1].setSenha(4321);
		cliente[2].setSenha(9876);
		cliente[0].setSaldo(200);
		cliente[1].setSaldo(350);
		cliente[2].setSaldo(500);
		System.out.println("BEM VINDO AO NUBANK");
		System.out.println("Informe o CPF: ");
		System.out.println("Informe a senha: ");

	}

}
