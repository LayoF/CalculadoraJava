package br.faccamp.domain;

public class UmSobreX extends Operacao{

	public UmSobreX(String operando) {
		super(operando);
	}

	public String Calcular(String ope) {
		return null;
	}

	public String Calcular() {
		return String.valueOf( 1 / Float.parseFloat(operando));
	}
	

}
