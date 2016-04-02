package br.fatec.servico;

public class Calculadora {
	/*
	public int soma(String x, String y) {		
		return Integer.parseInt(x) + Integer.parseInt(y);
	}
	
	*/
	
	
	public int soma(String valor) {		
		String x[] = valor.split(",");
		int total = 0;
				
		for (String i : x) {
			total += Integer.parseInt(i);
		}
		
		return total;		
	}
	
	
}
