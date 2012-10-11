package br.faccamp.domain;

public class Fatorial extends Operacao {

	public Fatorial(String operando) {
		super(operando);
	}

	
	public String Calcular(String ope) {
		return null;
	}

	public String Calcular() {
		return String.valueOf( fatorial(Integer.parseInt(operando)));
	}
	
	private int fatorial(int num) {
		if (num <=1 )  return 1;  
		else  return num * fatorial(num - 1);
	}	

}
