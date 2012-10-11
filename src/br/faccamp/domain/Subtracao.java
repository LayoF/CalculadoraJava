package br.faccamp.domain;

public class Subtracao extends Operacao{

	public Subtracao(String operando) {
		super(operando);		
	}

	public String Calcular(String ope) {
		return String.valueOf(Float.parseFloat(operando) - Float.parseFloat(ope));
	}

	
	public String Calcular() {
		return null;
	}	
}
