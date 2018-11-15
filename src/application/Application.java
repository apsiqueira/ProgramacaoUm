package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;



import entityes.Formula1;
import entityes.PilotoPrincipal;
import entityes.PilotoTeste;

public class Application {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int corredores = 0;
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date data;
		
		try {
			Date now=new Date();
			System.out.println(now);
			System.out.println("###############Cadastro de Corrida F1##############");

			System.out.print("entre com cnpj da empresa F1 :");
			Integer cnpj = sc.nextInt();
			String cnpjS= Integer.valueOf(cnpj).toString();
			System.out.println(cnpjS);
			
			
			System.out.print("entre com o instagram  da empresa F1 :");
			String instagramOfficial = sc.next();
			
			System.out.print("entre com a data :");
			String dataCorrida = sc.next();
			data= sdf.parse(dataCorrida);
			System.out.println(data);
			
			
			
			Formula1 f1 = new Formula1(cnpj, instagramOfficial,data);
			
			
			
			  
			
			

			while (corredores < 1) {
				System.out.println("###############Cadastro de Piloto##############");
				System.out.println("entre com a sua equipe :");
				String equipe = sc.next();
				System.out.println("entre com o seu nome piloto :");
				String nome = sc.next();
				System.out.println("entre com a sua idade piloto :");
				Integer idade = sc.nextInt();

				PilotoPrincipal p = new PilotoPrincipal(idade, nome, equipe);
				f1.adicionarPiloto(p);
				corredores++;
				
				System.out.println("entre com o seu nome piloto de teste da equipe :");
				String nomeTeste= sc.next();
				System.out.println("entre com a sua idade piloto de teste da equipe :");
				Integer idadeTeste = sc.nextInt();
				System.out.println("entre com a seu Whatsaap piloto de teste da equipe :");
				String whatsaap = sc.next();

				PilotoTeste pt = new PilotoTeste(idadeTeste, nomeTeste, whatsaap);
				f1.adicionarPiloto(pt);

				
				
			}

			
			f1.listarNomeIdadePilotos();

			System.out.println(f1.toString());

		} catch (InputMismatchException e) {
			System.out.println("Não e permitido a entrada de Letras no lugar de numeros");

		}

		catch (Exception e) {
			e.printStackTrace();

			
		}

	}

}
