import java.util.Scanner;


public class ExercicioSwitchCase {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe em qual mês do ano nos estamos: ");
		int mes = sc.nextInt();
		switch (mes) {
		case 1:
			System.out.println("Estamos no mês de Janeiro");
			break;
		case 2:
			System.out.println("Estamos no mês de Fevereiro");
			break;
		case 3:
			System.out.println("Estamos no mês de Março");
			break;
		case 4:
			System.out.println("Estamos no mês de Abril");
			break;
		case 5:
			System.out.println("Estamos no mês de Maio");
			break;
		case 6:
			System.out.println("Estamos no mês de Junho");
			break;
		case 7:
			System.out.println("Estamos no mês de Julho");
			break;
		case 8:
			System.out.println("Estamos no mês de Agosto");
			break;
		case 9:
			System.out.println("Estamos no mês de Setembro");
			break;
		case 10:
			System.out.println("Estamos no mês de Outubro");
			break;
		case 11:
			System.out.println("Estamos no mês de Novembro");
			break;
		case 12:
			System.out.println("Estamos no mês de Dezembro");
			break;
		default:
			System.out.println("Por favor, informe um número válido.");
		}
		sc.close();
	}		
}
