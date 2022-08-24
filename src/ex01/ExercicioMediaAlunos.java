package ex01;

import java.util.Random;


public class ExercicioMediaAlunos {
	public static void main(String[] args) {
		
		String[] alunos = new String [15];
		int notas1 [] = new int[15];
		int notas2 [] = new int[15];
		int nota_final [] = new int [15];
		
		Random r = new Random();
		int limite = 10;
		
		
		for (int x = 0; x < 15; x++) {
			alunos [x] = "aluno" + x;
		}
		

		
		for (int i = 0; i < 15; i++) {
			int nota_random = r.nextInt(limite);
			notas1[i] = nota_random;
		}



		for (int i = 0; i < 15; i++) {
			int nota_random2 = r.nextInt(limite);
			notas2[i] = nota_random2;

		}
		

		for (int x = 0; x < 15; x++) {
			nota_final [x] = (notas1[x] + notas2[x]) / 2;
		}
		
		
		for (int total = 0; total < 15; total++) {
			if (nota_final[total] >= 7) {
				System.out.println("Nota na primeira prova: " + notas1 [total]);
				System.out.println("Nota na segunda prova: " + notas2 [total]);
				System.out.println("O aluno " + alunos[total] + " foi aprovado com média " + nota_final[total]);
				System.out.println("----------------------------------------------");
			}
			else {
				System.out.println("Nota na primeira prova: " + notas1 [total]);
				System.out.println("Nota na segunda prova: " + notas2 [total]);
				System.out.println("O aluno " + alunos[total] + " foi reprovado com média " + nota_final[total]);
				System.out.println("----------------------------------------------");
			}
			
		}
		
		
		
	}
}
