
public class Item {
	
	private Produto prod;
	private int quantidade;
	private Double valorTotalItem;
	
	public Produto getProd() {
		return prod;
	}
	public void setProd(Produto prod) {
		this.prod = prod;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	private Double calculaValorItem() {
		return getQuantidade()* prod.getValorUnitario();
	}
	
	public Double getValorTotalItem() {
		this.valorTotalItem = calculaValorItem();
		return this.valorTotalItem;
	}


}
