package ex02;

public class ExercicioArray3 {
	public static void main(String[] args) {
		int a [] = {3, 5, 2, 7, 2};
		int b [] = a;
		
		for (int x = 0; x < a.length; x++) {
			System.out.print(a[x]);
		}
		System.out.println();
		for (int c = 0; c < b.length;c++) {
			System.out.print(b[c]);
		}
	}
}
