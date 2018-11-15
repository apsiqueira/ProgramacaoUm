package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entityes.*;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int corredores = 0;
		try {
			System.out.println("###############Cadastro de Corrida F1##############");

			System.out.print("entre com cnpj da empresa F1 :");
			Integer cnpj = sc.nextInt();
			String cnpjS= Integer.valueOf(cnpj).toString();
			System.out.println(cnpjS);
			
			
			System.out.print("entre com o instagram  da empresa F1 :");
			String instagramOfficial = sc.next();
			Formula1 f1 = new Formula1(cnpj, instagramOfficial);

			while (corredores < 2) {
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
