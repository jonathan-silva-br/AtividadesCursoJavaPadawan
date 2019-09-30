import java.util.ArrayList;

public class Conta {
	private double saldo;
	private ArrayList extrato = new ArrayList(); 
	
	public double getSaldo() {
		return saldo;
	}

	
	public void deposito(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			setExtrato("Depósito", valor);

		}
	}
	
	public double saque(double valor) {
		if (getSaldo() >= valor) {
			this.saldo -= valor;
			setExtrato("Saque", valor);

			return valor;
		}else {
			return -1; //-1 saldo insuficiente;
		}
	}
	
	public void setExtrato(String operacao, double valor) {
		extrato.add(operacao + " de R$" + valor);
	}
	
	public String getExtrato() {
		String h = "";
		 for (int x = 0; x <= extrato.size()-1; x++) {
			 h += extrato.get(x);
		 }
		return h;
	}
}
