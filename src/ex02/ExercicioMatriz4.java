package ex02;

public class ExercicioMatriz4 {
	public static void main(String[] args) {
		int m [][]= {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		int contador = 0;
		
		for (int x = 0; x < m.length; x++) {
			for (int x2 = 0; x2 < m[x].length; x2++) {
				contador = m[x][x2] + contador;
				System.out.print(m[x][x2] + " ");
			}
			System.out.println();
		}
		
		System.out.print("A soma de todos os elementos da matriz é de " + contador);
	}
}
