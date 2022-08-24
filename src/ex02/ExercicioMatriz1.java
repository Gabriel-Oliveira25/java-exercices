package ex02;
import java.util.Random;

public class ExercicioMatriz1 {
	public static void main(String[] args) {
		Random ran = new Random();
		int limite = 100;
		int m [][] = new int[2][3];
		
		for (int x = 0; x < m.length; x++) {
			for (int i = 0; i < m[x].length; i++) {
				m[x][i] = ran.nextInt(limite);
			}
		}
		
		for (int x = 0; x < m.length; x++) {
			System.out.println("Linha " + (x + 1));
			for (int i = 0; i < m[x].length; i++) {
				System.out.print(m[x][i] + " ");
			}
			System.out.println("");
		}
	}
}
