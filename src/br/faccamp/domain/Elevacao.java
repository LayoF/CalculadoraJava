package br.faccamp.domain;

public class Elevacao extends Operacao {

	public Elevacao(String operando) {
		super(operando);
	}

	public String Calcular(String ope) {
		return String.valueOf(Math.pow(Float.parseFloat(operando), Float.parseFloat(ope)));
	}

	public String Calcular() {
		return null;
	}

}
