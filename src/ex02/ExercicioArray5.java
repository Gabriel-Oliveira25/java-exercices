package ex02;

public class ExercicioArray5 {
	public static void main(String[] args) {
		int a [] = {3, 5, 2, 3, 9, 4, 5, 2, 3, 5};
		int b [] = new int [10];
		
		for (int x = 0; x < a.length; x++) {
			b[x] = a[x] * x;
			System.out.print(b[x] + " "); 
		}
		                    
	}
}
