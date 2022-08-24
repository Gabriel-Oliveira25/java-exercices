package ex01;
import java.util.Scanner;


public class ExercicioTempConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Conversor de temperatura.");
		int proceed = -1;
		do {
			System.out.print("Informe sua temperatura em Grau Celcius (°C): ");
			float temp = sc.nextFloat();
					
			System.out.println("-------------------------");
			System.out.println("[ 1 ] Kelvin (K)");
			System.out.println("[ 2 ] Réaumur (Re)");
			System.out.println("[ 3 ] Rankine (Ra)");
			System.out.println("[ 4 ] Fahrenheit (F)");
			System.out.println("[ 0 ] Finalizar");
			System.out.println("-------------------------");
			System.out.print("Converter para: ");
			int choice = sc.nextInt();
			proceed = choice;
			
			switch (choice) {
			case 0:
				System.out.println("Finalizando o programa...");
				break;
			case 1:
				System.out.println("Conversão para Kelvin.");
				float k = temp + 273.15f;
				System.out.println(temp + " °C converte para "+ k + " K");
				break;
			case 2:
				System.out.println("Conversão para Réaumur.");
				float re = temp * 0.8f;
				System.out.println(temp + " °C converte para " + re + " Re");
				break;
			case 3:
				System.out.println("Conversão para Rankine");
				float ra = (temp * 1.8f) + 32 + 459.67f;
				System.out.println(temp + " °C converte para " + ra + " Ra");
				break;
			case 4:
				System.out.println("Conversão para Fahrenheit");
				float f = (temp * 1.8f) + 32;
				System.out.println(temp + " °C converte para " + f + " F");
				break;
				
			default:
				System.out.println("Escolha inválida, tente novamente.");
				break;
			}
			if (choice != 0) {
				System.out.print("Deseja continuar? [ 0 ] Não  /  [ 1 ] Sim ");
				int second_choice = sc.nextInt();
				proceed = second_choice;
				switch (second_choice) {
				case 0:
					System.out.println("Finalizando programa...");
					break;
				case 1:
					System.out.println("Continuando...");
					break;
				default:
					System.out.println("Escolha inválida, tente novamente. ");
				}
			}
			
		} while (proceed != 0);
		sc.close();
	}
}
