package br.faccamp.domain;

public class MaisMenos extends Operacao{


	public MaisMenos(String operando) {
		super(operando);
	}

	public String Calcular(){
		return String.valueOf(Float.parseFloat(operando) * (-1));
	}

	
	public String Calcular(String operando) {
		return null;
	}

}

	
