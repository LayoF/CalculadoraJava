package br.faccamp.domain;


import br.faccamp.view.CalculadoraGUI;

public class Display {
	

	private CalculadoraGUI gui;
	

	public Display(CalculadoraGUI gui) {
		this.gui = gui;
	}
	
	public void limpaDisplay(){
		gui.atualizaDisplay("");	
	}

	public void atualiza(String texto) {
		if (verificaCaracterEspecial(texto)){
			if (caracterNaoInformado(texto)){
				atualizaDisplay(texto);
			}
		} 
		else {
			atualizaDisplay(texto);
		}			
	}
	
	
	private void atualizaDisplay(String texto) {
		if (verificaDisplayVazio()) {
			gui.atualizaDisplay(texto);	
		}
		else {
			gui.atualizaDisplay((getConteudo()+texto));	
		}
	}

	private boolean verificaDisplayVazio() {
		return getConteudo().equalsIgnoreCase("");
	}
	
	private boolean caracterNaoInformado(String texto){
		if (getConteudo().indexOf(texto) == -1){
			return true;
		}
		else {
			return false;
		}
	
	}
	
	private boolean verificaCaracterEspecial(String texto){						
		if (texto == ",") {
			return true;
		}
		else {
			return false;
		}	
	}

	public String getConteudo() {
		return gui.getDisplay();
	}

}
