
public class ContaPoupanca extends Conta {
	private float taxaJuros = 0.01f;
	
	public float getTaxaJuros() {
		return taxaJuros;
	}
	
	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void renderJuros() {
		deposito(getSaldo() + (getSaldo() * getTaxaJuros()));
	}

}
