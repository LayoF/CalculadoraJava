package br.faccamp.domain;

public class Logaritmo extends Operacao {

	public Logaritmo(String operando) {
		super(operando);
	}

	
	public String Calcular(String ope) {
		return null;
	}

	public String Calcular() {
		return String.valueOf( Math.log10(Float.parseFloat(operando)));
	}
	

}
