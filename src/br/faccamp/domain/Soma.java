package br.faccamp.domain;

public class Soma extends Operacao {

	public Soma(String operando){
		super(operando);
	}

	
	public String Calcular(String ope) {
		return String.valueOf(Float.parseFloat(operando) + Float.parseFloat(ope));
		
	}


	public String Calcular() {
		return null;
	}
	
}
