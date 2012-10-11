package br.faccamp.domain;

public class Multiplicacao extends Operacao {

	public Multiplicacao(String operando) {
		super(operando);
	}

	public String Calcular(String ope) {
		return String.valueOf(Float.parseFloat(operando) * Float.parseFloat(ope));
	}
	

	public String Calcular() {
		return null;
	}	
}
