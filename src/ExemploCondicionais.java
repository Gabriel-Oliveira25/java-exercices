import java.util.Scanner;



public class ExemploCondicionais {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma resposta: ");
		int resposta = sc.nextInt(); 
		
		
		
		if (resposta == 50) {
			System.out.println("O valor do Scanner:"+resposta);
			System.out.println("Resposta é 50");
		}	
		else {
			System.out.println("O valor do Scanner:"+resposta);
			System.out.println("Resposta não é 50");
		}
		
		
		sc.close();
		
	}
}
