package entityes;

import java.util.Random;

public class PilotoPrincipal extends Piloto {

	private String equipe;

	public PilotoPrincipal(int idade, String nome, String equipe) {
		super(idade, nome);
		this.equipe = equipe;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public void imprimirDadosPilotoPrincipal(PilotoPrincipal p) {
		System.out.print(p.getNome());
		System.out.println();
		System.out.print(p.getIdade());
		System.out.println();
		System.out.print(p.getEquipe());
		System.out.println();

	}

	@Override
	public float gerarValorContrato() {
	
		return 22.5f;
	}
	
	@Override
	public String toString() {
		super.toString();
		StringBuilder sb=new StringBuilder();
		sb.append("Equipe do piloto "+ getEquipe()+"\n");
		return sb.toString();
		
	}


	
	
}
