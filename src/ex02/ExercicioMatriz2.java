package ex02;
import java.util.Scanner;

public class ExercicioMatriz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double m [][]= new double[2][5];
		
		for (int x = 0; x < m.length; x++) {
			for (int i = 0; i < m[x].length; i++) {
				System.out.print("Digite um número para inserir na casa " + x + " e " + i + ": ");
				double num = sc.nextDouble();
				m[x][i] = num;
			}
		}
		System.out.println("Matriz: ");
		for (int c = 0; c < m.length; c++) {
			for (int c2 = 0; c2 < m[c].length; c2++) {
				System.out.print(m[c][c2] + " ");
			}
		System.out.println();
		}
		
		sc.close();
	
	}
}
