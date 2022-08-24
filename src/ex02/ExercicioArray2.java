package ex02;
import java.util.Random;


public class ExercicioArray2 {
	public static void main(String[] args) {
		Random num = new Random();
		int limite = 10;
		int numeros [] = new int [10];
		
		System.out.print("Números gerados: " );
		for (int x = 0; x < numeros.length; x++) {
			numeros[x] = num.nextInt(limite);
			
			System.out.print(+ numeros[x] + " ");
		}
		System.out.println();
		
		System.out.print("Números pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) { 
				System.out.print(numeros[i] + " "); 
			}
		}				
	}
}
 