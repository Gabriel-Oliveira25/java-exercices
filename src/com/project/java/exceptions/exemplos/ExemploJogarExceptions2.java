package com.project.java.exceptions.exemplos;
import java.util.InputMismatchException;

public class ExemploJogarExceptions2 {
	public static void main(String[] args) {
		try {
			System.out.println("Estou dentro do bloco try");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Estou no tratamento da exception ArrayIndexOutOfBoundsException");
		}
		
		catch (NullPointerException e) {
			System.out.println("Estou no tratamento da exception NullPointerException");
		}
		
		catch (InputMismatchException e) {
			System.out.println("Estou no tratamento da exception InputMismatchException");
		}
 		
	}
}
