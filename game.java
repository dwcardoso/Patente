package game;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//como colocar uma scann, permitindo passar só após responder corretamente?
		
//		System.out.println("INICIAR SISTEMA DE PATENTE SIM OU NÃO");
//		String escolha = scan.nextLine();
//		
//		if (escolha.equals ("SIM")) {
//			System.out.println("VAMOS COMEÇAR");
//		}else if(escolha.equals("NÃO")) {
//			System.out.println("VOLTE QUANDO ESTIVER PRONTO");
//		}else{
//			System.out.println("ACHO QUE VOCÊ NÃO ENTENDEU! RESPONDA SIM OU NÃO");
//		}
		
		int pontuação = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Resultado da partida " + i + " (V=Vitória, E=Empate, D=Derrota)");
			String resultado = scan.nextLine().toUpperCase();

			if (resultado.equals ("V")) {
				pontuação +=10;
			}else if (resultado.equals ("E")) {
				pontuação +=5;
			}else if (resultado.equals ("D")) {
				pontuação -=2;
			}else {
				System.out.println("ENTRADA INVALIDA: PRESTE MAIS ATENÇÃO");
				i--;
			}}

		if(pontuação >= 60) {
			System.out.print("Patente UP 🪖");
			System.out.print(" Sua pontuação foi de " + pontuação);
		}else if(pontuação >= 21) {
			System.out.print("Sem alteração na Patente 🪖");
			System.out.print("S ua pontuação foi de " + pontuação);

		}else{
			System.out.print("Você foi rebaixado, tente mais, seja melhor 💀");
			System.out.print(" Sua pontuação foi de " + pontuação);


		}

	}


}
