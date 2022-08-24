package com.project.java.exceptions.exemplos;

public class ExemploJogarExceptions {
	public static void main(String[] args) {
		try {
			System.out.println("Estou dentro do bloco try");
		}
		catch (Exception e) {
			System.out.println("Estou dentro do bloco catch");			
		}
		finally {
			System.out.println("Estou dentro do bloco finally!");
		}
	}

}