package entityes;

import java.util.ArrayList;

public class Formula1 {

	private Integer cnpj;
	private String instagramOfficial;
	private ArrayList<Piloto> pilotos;

	public Formula1(Integer cnpj, String instagramOfficial) {
		this.cnpj = cnpj;
		this.instagramOfficial = instagramOfficial;
		this.pilotos = new ArrayList<Piloto>();

	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public String getInstagramOfficial() {
		return instagramOfficial;
	}

	public void setInstagramOfficial(String instagramOfficial) {
		this.instagramOfficial = instagramOfficial;
	}

	public void listarNomeIdadePilotos() {
		for (Piloto p : pilotos) {
			System.out.println(p.getNome());
			System.out.println(p.getIdade());

		}

	}

	public void adicionarPiloto(Piloto p) {
		pilotos.add(p);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("CNPJ DA EMPRESA E :" + cnpj + "\n");
		sb.append("INTAGRAM OFFICIAL DA EMPRESA E :" + cnpj + "\n");
		for (Piloto p : pilotos) {
			sb.append("Piloto :"+ pilotos.lastIndexOf(p)+"\n");
			sb.append("Nome :" + p.getNome()+"\n");
			sb.append("Idade :" + p.getIdade()+"\n");
			sb.append("Valor Contrato :" + p.gerarValorContrato()+"\n");
			sb.append("Classe: " + p.getClass()+"\n");
			

		}

		return sb.toString();

	}

}
