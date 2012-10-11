package br.faccamp.domain;

public class RaizQuadrada extends Operacao {

	public RaizQuadrada(String operando) {
		super(operando);
	}

	
	public String Calcular(String ope) {
		return null;
	}

	public String Calcular() {		
		return String.valueOf( Math.sqrt(Float.parseFloat(operando)));
	}
	
	

}
