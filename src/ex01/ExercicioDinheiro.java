package ex01;
import java.util.Scanner;

public class ExercicioDinheiro {
	public static void main(String[] args) {		

			Scanner sc = new Scanner(System.in);
	
			int cond = -1;
			float mouse = 109;
			float teclado = 300;
			float monitor = 1300;
			float processador = 899;
			float total_compras = 0;
	
			System.out.print("Adicione saldo na carteira: R$ ");
			float dinheiro_carteira = sc.nextFloat();
			System.out.println("----------------------------");
			System.out.println("Dinheiro na carteira: R$ " + dinheiro_carteira);
			System.out.println("----------------------------");
			System.out.println("Lista de produtos: ");
			System.out.println("----------------------------");
			System.out.println("[1] - Mouse - R$ 109,00");
			System.out.println("[2] - Teclado - R$ 300,00");
			System.out.println("[3] - Monitor R$ 1300,00");
			System.out.println("[4] - Processador R$ 899,00");
			System.out.println("[0] - Sair.");
			System.out.println("----------------------------");
			System.out.print("Adicione um produto no carrinho: ");
			
			do {
			
			int choice = sc.nextInt();
			cond = choice;
			
			switch (choice) {
			case 0:
				System.out.println("----------------------------");
				System.out.println("Finalizando a compra.");
				System.out.println("----------------------------");
				break;
			case 1:
				System.out.println("----------------------------");
				System.out.println("Mouse adicionado ao carrinho");
				System.out.println("----------------------------");
				total_compras = total_compras + mouse;
				break;
			case 2:
				System.out.println("----------------------------");
				System.out.println("Teclado adicionado ao carrinho");
				System.out.println("----------------------------");
				total_compras = total_compras + teclado;
				break;
			case 3:
				System.out.println("----------------------------");
				System.out.println("Monitor adicionado ao carrinho");
				System.out.println("----------------------------");
				total_compras = total_compras + monitor;
				break;
			case 4:
				System.out.println("----------------------------");
				System.out.println("Processador adicionado ao carrinho");
				System.out.println("----------------------------");
				total_compras = total_compras + processador;
				break;
			default:
				System.out.println("----------------------------");
				System.out.println("Opção inválida.");
				System.out.println("----------------------------");
				System.out.println("Lista de produtos: ");
				System.out.println("----------------------------");
				System.out.println("[1] - Mouse - R$ 109,00");
				System.out.println("[2] - Teclado - R$ 300,00");
				System.out.println("[3] - Monitor R$ 1300,00");
				System.out.println("[4] - Processador R$ 899,00");
				System.out.println("[0] - Sair.");
				System.out.println("----------------------------");
				}
			
			
			if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
				System.out.print("Deseja adicionar mais um produto no carrinho? [ 1 - Sim / 2 - Não ] "); 
				int continuar = sc.nextInt();
				switch (continuar) {
				case 1:
					System.out.println("----------------------------");
					System.out.println("Continuando.");
					System.out.println("----------------------------");
					System.out.println("Lista de produtos: ");
					System.out.println("----------------------------");
					System.out.println("[1] - Mouse - R$ 109,00");
					System.out.println("[2] - Teclado - R$ 300,00");
					System.out.println("[3] - Monitor R$ 1300,00");
					System.out.println("[4] - Processador R$ 899,00");
					System.out.println("[0] - Sair.");
					System.out.println("----------------------------");
					System.out.print("Adicione um produto no carrinho: ");
					break;
				case 2:
					cond = 0;
					break;
				default:
					System.out.println("Opção inválida.");
					}
				}	
			} while (cond != 0);
			

			
			dinheiro_carteira = dinheiro_carteira - total_compras;
			System.out.println("Finalizando compras...");
			if (dinheiro_carteira > 0) {
				System.out.println("Compras finalizadas com sucesso.");
				System.out.println("Valor total: R$ " + total_compras);
				System.out.println("Você ainda tem R$ " + dinheiro_carteira + " disponível na sua carteira. ");
			}
			else {
				System.out.println("Saldo insuficiente para finalizar a compra.");
			}
			sc.close();
	}
}
