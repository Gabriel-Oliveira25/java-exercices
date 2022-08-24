package com.project.java.metodos.exemplos;

public class ExemplosMetodos {
	
	public static void meuMetodo() {
		System.out.println("Estou no meu metodo sem retorno, sem parametros, sem static e sem public");
	}
	
	private void meuMetodoDois() {
		System.out.println("Estou no meu metodo sem retorno, sem parametros e private");
	}
	
	public void meuMetodoComParametros(int x, int a, int b) {
		System.out.println("Estou no meu metodo sem retorno, com parametros e public");
	}
	
	protected String metodoComRetorno() {
		return "Este é o meu metodo com retorno tipo string";
	}
	
	protected String metodoComRetornoParametros(String a, int b, float c) {
		return "Este é o meu metodo com retorno tipo string";
	}
	
	void metodoDefaultSemModificadorDeAcesso() {
		System.out.println("Estou no meu metodo sem retorno e default");
	}
}

