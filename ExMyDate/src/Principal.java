
public class Principal {

	public static void main(String[] args) {
		MyDate x;
		x = new MyDate();
		funcao(x);
		System.out.println(x.getMes());

	}
	
	static void funcao(MyDate d) {
		d.setMes(10);
	}

}
