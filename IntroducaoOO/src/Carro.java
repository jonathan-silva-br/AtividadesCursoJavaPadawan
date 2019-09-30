
public class Carro {
	public static int autoInc = 0;
	
	public int numero;
	private String cor;
	private String modelo;
	
	public static void metodoStatico() {
		System.out.print("Acessando metodo estatico. Numero " + autoInc);
	}
	
	public Carro(String modelo, String cor) {
		autoInc ++;
		numero = autoInc;
		this.setCor(cor);
		this.setModelo(modelo);
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	
	@Override
	public String toString() {
		return "Numero: " + numero + " Carro [cor=" + cor + ", modelo=" + modelo + "]";
	}
}

	
