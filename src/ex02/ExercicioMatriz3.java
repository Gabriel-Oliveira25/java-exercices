package ex02;

public class ExercicioMatriz3 {
	public static void main(String[] args) {
		int m [][] = {{2, 7, 9}, {5, 1, 0}, {9, 14, 6}}; 
		int m2 [][] = new int [3][3];
		
		for (int x = 0; x < m.length; x++) {
			for (int x2 = 0; x2 < m[x].length; x2++) {
				if (m[x][x2] % 2 == 0) {
					m2[x][x2] = m[x][x2] + 1;
				}
				else {
					m2[x][x2] = m[x][x2] - 1;
				}
			}
		}
		
		
		for (int x = 0; x < m.length; x++) {
			for (int x2 = 0; x2 < m[x].length; x2++) {
				System.out.print(m2[x][x2] + " ");
			}
			System.out.println();
		}
		
	}
}
