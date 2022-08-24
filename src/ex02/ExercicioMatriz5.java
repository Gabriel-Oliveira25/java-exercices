package ex02;
import java.util.Scanner;


//JOGADOR 1 = 1
//JOGADOR 2 = -1

public class ExercicioMatriz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jogo [][] = new int [3][3];
		int numJogadas = 0;
		int jogador = 1;

		System.out.println("         JOGO DA VELHA");
		System.out.println("-------------------------------");
		System.out.println("              COLUNA");
		System.out.println();
		System.out.println("                0      1      2 ");
		System.out.println("              0      |     |     ");
		System.out.println("                _____|_____|_____");
		System.out.println("   LINHA      1      |     |     ");
		System.out.println("                _____|_____|_____");
		System.out.println("              2      |     |     ");
		System.out.println("                     |     |     ");
		System.out.println();
		
		
		while (numJogadas != 9) {
			int jogada1 = 0;
			int jogada2 = 0;
			int verify = 0;
			
			while (verify != 1) {
				int control = 1;
				while (control != 0) {
					if (jogador == 1) {
						System.out.println();
						System.out.println("Jogador " + jogador + " = X ");
						System.out.println();
					}
					else {
						System.out.println();
						System.out.println("Jogador " + jogador + " = O ");
						System.out.println();
					}
					
					System.out.println();
					System.out.print("Escolha a coluna ");

					int c1 = sc.nextInt();
					switch (c1) {
					case 0:
						jogada1 = c1;
						control = 0;
						break;
					case 1:
						jogada1 = c1;
						control = 0;
						break;
					case 2:
						jogada1 = c1;
						control = 0;
						break;
					default:
						System.out.println();
						System.out.println("Opção inválida, tente novamente. ");
						System.out.println();
					}
				}
				
						
				int control2 = 1;
				
				while (control2 != 0) {	
					System.out.println();
					System.out.print("Escolha a linha ");
					int c2 = sc.nextInt();
					switch (c2) {
					case 0:
						jogada2 = c2;
						control2 = 0;
						break;
					case 1:
						jogada2 = c2;
						control2 = 0;
						break;
					case 2:
						jogada2 = c2;
						control2 = 0;
						break;
					default:
						System.out.println();
						System.out.println("Opção inválida, tente novamente. ");
						System.out.println();
					}
				}
				
				if (jogo[jogada1][jogada2] != 0) {
					System.out.println();
					System.out.println("Slot não disponível, tente outra jogada. ");
					System.out.println();
					for (int x = 0; x < jogo.length; x++) {
						for (int x1 = 0; x1 < jogo[x].length; x1++) {
							if (jogo[x][x1] == 1) {
								System.out.print("   X   ");
							}
							else if (jogo[x][x1] == -1) {

								System.out.print("   O   ");
							}
							else {
								System.out.print("   -   ");
							}
							
							
						}
						System.out.println();
						System.out.println();
					}
				}
				else {
					verify = 1;
				}
							
			} 
					
			if (jogador == 1) {
				jogo[jogada1][jogada2] = 1;
				jogador = 2;
			}
			
			else{	
				jogo[jogada1][jogada2] = -1;
				jogador = 1;
			}
			
			System.out.println();
			for (int x = 0; x < jogo.length; x++) {
				for (int x1 = 0; x1 < jogo[x].length; x1++) {
					if (jogo[x][x1] == 1) {
						System.out.print("   X   ");
					}
					else if (jogo[x][x1] == -1) {

						System.out.print("   O   ");
					}
					else {
						System.out.print("   -   ");
					}
					
					
				}
				System.out.println();
				System.out.println();
			}
			
					
			if (jogo[0][0] + jogo[0][1] + jogo[0][2] == 3 ||
				jogo[1][0] + jogo[1][1] + jogo[1][2] == 3 || 
				jogo[2][0] + jogo[2][1] + jogo[2][2] == 3 || 
				jogo[0][0] + jogo[1][0] + jogo[2][0] == 3 || 
				jogo[0][1] + jogo[1][1] + jogo[2][1] == 3 || 
				jogo[0][2] + jogo[1][2] + jogo[2][2] == 3 || 
				jogo[0][0] + jogo[1][1] + jogo[2][2] == 3 || 
				jogo[0][2] + jogo[1][1] + jogo[2][0] == 3 ) {
					System.out.println();
					System.out.println("Jogador 1 venceu.");
					System.out.println();
					numJogadas = 8;

			}
			
			if (jogo[0][0] + jogo[0][1] + jogo[0][2] == -3 ||
				jogo[1][0] + jogo[1][1] + jogo[1][2] == -3 || 
				jogo[2][0] + jogo[2][1] + jogo[2][2] == -3 || 
				jogo[0][0] + jogo[1][0] + jogo[2][0] == -3 || 
				jogo[0][1] + jogo[1][1] + jogo[2][1] == -3 || 
				jogo[0][2] + jogo[1][2] + jogo[2][2] == -3 || 
				jogo[0][0] + jogo[1][1] + jogo[2][2] == -3 || 
				jogo[0][2] + jogo[1][1] + jogo[2][0] == -3 ) {
					System.out.println();
					System.out.println("Jogador 2 venceu.");
					System.out.println();
					numJogadas = 8;
			}
			
			if (numJogadas == 9) {
				System.out.println();
				System.out.println("O jogo foi um empate!");
				System.out.println();
			}
		
			numJogadas = numJogadas + 1;
			

		}
		sc.close();
	}			
}			

