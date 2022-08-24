import java.util.Scanner;


public class ExercicioDoWhileMenu {
	public static void main(String[] args) {
		System.out.println("Lista de produtos: ");
		System.out.println("[1] - Mouse - R$ 109,00");
		System.out.println("[2] - Teclado - R$ 300,00");
		System.out.println("[3] - Monitor R$ 1300,00");
		System.out.println("[4] - Processador R$ 899,00");
		System.out.println("[0] - Finalizar compra.");
		Scanner sc = new Scanner(System.in);
		int cond = -1;
		float mouse = 109;
		float teclado = 300;
		float monitor = 1300;
		float processador = 899;
		float total = 0;
		
		do {
			System.out.print("Selecione um produto ou finalize a compra [0]: ");
			int escolha = sc.nextInt();
			cond = escolha;
			switch(escolha) {
			case 0:
				System.out.println("Finalizando...");
				break;
			case 1:
				System.out.println("Mouse adicionado ao carrinho");
				total = mouse + total;
				break;
			case 2:
				System.out.println("Teclado adicionado ao carrinho");
				total = total + teclado;
				break;
			case 3:
				System.out.println("Monitor adicionado ao carrinho");
				total = total + monitor;
				break;
			case 4:
				System.out.println("Processador adicionado ao carrinho");
				total = total + processador;
				break;
			default:
				System.out.println("Opção inválida, tenta novamente.");
			}
			
		}	while (cond != 0);
		
		System.out.println("Total da compra: R$ "+total);
		sc.close();
							
	}		
}

