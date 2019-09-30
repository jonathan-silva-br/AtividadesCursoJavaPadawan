
public class Matricula {
	
	private float notas[] = new float[4];
	private float media;
	private String situacao;
	
	public void setNotas(float nota, int pos) {
		notas[pos] = nota;
	}
	
	public float getMedia() {
		media = 0;
		for (int x = 0; x <= 3; x++ ) {
			media += notas[x];
		}
		media = media/4;
		return media;
	}
	
	public String getSituacao() {
		getMedia();
		if (media >= 7) {
			situacao =  "Aprovado";
		}else {
			if (media >= 5) {
				situacao = "Em Exame";
			}else {
				situacao = "Reprovado";
			}
		}
		return situacao;
	}

}
