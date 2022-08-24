package ex02;

public class ExercicioArray4 {
	public static void main(String[] args) {
		int a [] = {12, 4, 43, 23, 5};
		int b [] = {9, 4, 34, 21, 3};
		int c [] = new int [5];
		System.out.print("C = ");
		for (int x = 0; x < a.length; x++) {
			c[x] = a[x] + b[x];
			System.out.print(c[x] + " ");
		}
		
	}
}
