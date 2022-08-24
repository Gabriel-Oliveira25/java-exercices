package ex02;

import java.util.Random;


public class ExercicioArray1 {
	public static void main(String[] args) {
		Random num = new Random();
		int upperbound = 10;
		String[] alunos = {"Aluno1", "Aluno2", "Aluno3", "Aluno4", "Aluno5"};
		float notas1[] = {num.nextInt(upperbound), num.nextInt(upperbound), num.nextInt(upperbound), num.nextInt(upperbound), num.nextInt(upperbound)};
		float notas2[] = {num.nextInt(upperbound), num.nextInt(upperbound), num.nextInt(upperbound), num.nextInt(upperbound), num.nextInt(upperbound)};
		float media;
		float mediasAlunos[] = new float[5];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.print(alunos[i] + " ");
			media = notas1[i] + notas2[i] / 2;
			mediasAlunos[i] = media;
			if (media< 7) {
				
				System.out.println("(Reprovado)......... Média: " + mediasAlunos[i]);
			}
			else {

				System.out.println("(Aprovado)...........Média: " + mediasAlunos[i]);
			}
			
		}		
	}
}
