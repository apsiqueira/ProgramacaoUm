package entityes;

public class PilotoTeste extends Piloto {
	private String Whatsapp;

	public PilotoTeste(int idade, String nome,String whatsaap) {
		super(idade, nome);
		this.Whatsapp=whatsaap;
		// TODO Auto-generated constructor stub
	}
	
	
	public String getWhatsapp() {
		return Whatsapp;
	}




	@Override
	public float gerarValorContrato() {
	
		return 0.5f;
	}
	@Override
	public String toString() {
		super.toString();
		StringBuilder sb=new StringBuilder();
		sb.append("Equipe do piloto "+ getWhatsapp()+"\n");
		return sb.toString();
		
	}

}
