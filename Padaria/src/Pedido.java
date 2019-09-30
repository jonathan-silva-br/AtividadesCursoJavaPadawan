import java.sql.Date;
import java.util.ArrayList;

public class Pedido {
	private Date data;
	private double valorTotal;
	private ArrayList<Item> itens = new ArrayList<Item>();
	
	public void adicionarItem(Item item) {
		this.itens.add(item);
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getValorTotal() {
		calculaValorTotal();
		return valorTotal;
	}
	
	private void calculaValorTotal() {
		if (! this.itens.isEmpty()) {
			this.valorTotal = 0;
			for(int x=0; x <= this.itens.size()-1; x++) {
				valorTotal += this.itens.get(x).getValorTotalItem();
			}
			
		}
	}

}
