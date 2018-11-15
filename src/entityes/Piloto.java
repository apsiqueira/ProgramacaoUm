package entityes;

import java.util.Random;

public abstract class Piloto {

	private int idade;
	private String nome;
	private float valorContrato;

	public Piloto(int idade, String nome) {

		this.idade = idade;
		this.nome = nome;
		this.valorContrato = gerarValorContrato();
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract float gerarValorContrato();
	
	
	public void correr() {

		Random volta =new Random();
		for(int i=0;i<60;i++) {
		volta.doubles(360-210);
		
		}
		
	}
	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do piloto " + getNome() + "\n");
		sb.append("Idade do piloto " + getIdade() + "\n");

		return sb.toString();
	}
}
