import java.util.Scanner;



public class MediaAluno {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a primeira nota: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Informe a terceira nota: ");
		float nota3 = sc.nextFloat();
		
		float mediaAluno= (nota1 + nota2 + nota3) / 3;
		
		if (mediaAluno >= 7) {
			System.out.println("O aluno passou com uma média de:"+mediaAluno);
		}
		if (mediaAluno < 7) {
			System.out.println("O aluno foi reprovado com uma média de: "+mediaAluno);
		}
		else {
			System.out.println("Média inválida, tente novamente. ");
		}
		
		sc.close();
	

	}	
}
