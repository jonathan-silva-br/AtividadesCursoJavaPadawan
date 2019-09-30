import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		Pedido pedido = new Pedido();
		Item i = new Item();
		i.setProd(produtos.get(1));
		i.setQuantidade(3);
		pedido.adicionarItem(i);
		
		System.out.println(pedido.getValorTotal());
		
		System.out.println("Bem Vindo!");
		System.out.println("1 - Cadastrar novo pedido");
		System.out.println("2 - Extrato do pedido");
		System.out.println("3 - Extrato de vendas");
		System.out.println("4 - Sair do sistema");
		int op = t.nextInt();
		t.nextLine();
		while (op != 4) {
			switch(op) {
			case 1:
				System.out.println("Cadastro de novo pedido");
				System.out.println("Produtos: ");
				for (int x = 0; x <= produtos.size()-1; x++) {
					System.out.println("Produto " + x + produtos.getNome());
				}
				
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("Opção inválida");
			}
			System.out.println("1 - Cadastrar novo pedido");
			System.out.println("2 - Extrato do pedido");
			System.out.println("3 - Extrato de vendas");
			System.out.println("4 - Sair do sistema");
			op = t.nextInt();
			t.nextLine();
		}
	
	
	}
	
	public static void iniciaProdutos(ArrayList<Produto> produtos){
		Produto p = new Produto();
		p.setNome("Pepsi Twist");
		p.setValor(5.00);
		produtos.add(p);
		p = new Produto();
		p.setNome("Sanduiche Natural");
		p.setValor(3.50);
		produtos.add(p);
		p = new Produto();
		p.setNome("Trident Menta");
		p.setValor(2.50);
		produtos.add(p);
		p = new Produto();
		p.setNome("Torta de Limão");
		p.setValor(8.50);
		produtos.add(p);
		p = new Produto();
		p.setNome("Cuca de Banana com Farofa");
		p.setValor(12.50);
			
	}

}
