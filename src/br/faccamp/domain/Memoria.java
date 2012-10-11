package br.faccamp.domain;

public class Memoria {
	
	private Float memoria;
	
	public Memoria(float memoria){
		this.memoria = memoria;
	}

	public Float getMemoria() {
		return memoria;
	}
	
	public Float mMais(float mais){
		return 	memoria = (mais + memoria );
		
	}
	public Float mMenos(float menos){
		return 	memoria = (menos - memoria );
		
	}
		
}
