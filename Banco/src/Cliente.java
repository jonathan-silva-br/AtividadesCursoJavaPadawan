
public class Cliente {
	private String nome;
	private String cpf;
	private int senha;
	
	
	public void setNome(String nome) {
		if (nome.length() >= 3) {
			this.nome = nome;
			System.out.println("Nome cadastrado com sucesso");
		}else {
			System.out.println("Nome inválido!");
		}
	}
	
	public void setCPF(String cpf) {
		if (cpf.length() == 14) {
			this.cpf = cpf;
			System.out.println("CPF cadastrado com sucesso");
		}else {
			System.out.println("CPF inválido!");
		}
	}
	
	
	public void setSenha(int senha) {
		this.senha = senha;
		System.out.println("Senha cadastrada com sucesso");
	}

}
