
public class Atlet extends Pessoa {
	
	public String getCategoria() {
		String c = "";
		if ((getPeso() <= 20) && (getIdade() >= 7 && getIdade() <= 10)) {
			c = "Pena 7 a 10";
		}else {
			if ((getPeso() <= 20) && (getIdade() >= 11 && getIdade() <= 13)) {
				c = "Super Pena 11 a 13";
			}else {
				if ((getPeso() >= 21) && (getPeso() <= 25) && (getIdade() >= 7 && getIdade() <= 10)) {
					c = "M�dio 7 a 10";
				}else {
					if ((getPeso() >= 21) && (getPeso() <= 25) && (getIdade() >= 11 && getIdade() <= 13)) {
						c = "Pena 11 a 13";
					}else {
						c = "Categoria n�o cadastrada";
					}
				}
			}
		}
		return c;
	}

}