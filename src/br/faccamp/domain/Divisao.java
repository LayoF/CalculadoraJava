package br.faccamp.domain;

public class Divisao extends Operacao{

	public Divisao(String operando) {
		super(operando);
	}

	public String Calcular(String ope) {
		if (Float.parseFloat(ope) != 0){
			return String.valueOf(Float.parseFloat(operando) / Float.parseFloat(ope));
		}
		else {
			return ("Não Divisivel por 0");
		}
	}


	public String Calcular() {
		return null;
	}	
	
}
