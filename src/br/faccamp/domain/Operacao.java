package br.faccamp.domain;

public abstract class Operacao {
	
	protected String operando;
	
	
	public  Operacao(String operando){
		this.operando = operando;
	}
	
	public abstract String Calcular(String ope);
	
	public abstract String Calcular();

}
