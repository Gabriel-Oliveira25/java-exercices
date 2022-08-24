
public class ExemploEstruturasRepeticoes {
	public static void main(String[] args) {
		int numero = 10;
		while (numero == 10) {
			System.out.println("Estou no while");
		}
		
		do {
			System.out.println("Também estou no while");
			
		} while (numero == 10);
		
		for (int i = 0; i <100; i++) {
			
			System.out.println("Estou no loop for: " + i);
		}
	}
}
