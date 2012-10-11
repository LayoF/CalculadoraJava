package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;
import java.util.ArrayList;

public class Calculadora  {
	
	private CalculadoraGUI gui;
	private Display display;
	private Operacao ope;
	private Memoria memo;
	private ArrayList historico;

	public Calculadora() {
		gui = new CalculadoraGUI(this);
		display = new Display(gui);
		historico = new ArrayList(); 
	}

	public void processaMC() {
		memo = null;
		display.limpaDisplay();
	}

	public void processaMR() {
		if (memo != null) {
			display.limpaDisplay();
			display.atualiza(String.valueOf(memo.getMemoria()));
		}		
	}

	public void processaMS() {
		memo = new Memoria(Float.parseFloat(display.getConteudo()));
		display.limpaDisplay();		
	}

	public void processaMMais() {
		float mais = memo.mMais(Float.parseFloat(display.getConteudo()));
		display.limpaDisplay();
	}

	public void processaMMenos() {
		float menos = memo.mMenos(Float.parseFloat(display.getConteudo()));
		display.limpaDisplay();
		
	}

	public void processaCE() {
		display.limpaDisplay();	
		
	}

	public void processaC() {
		display.limpaDisplay();	
		ope = null;
	}

	public void processaRaiz() {
		ope = new RaizQuadrada(display.getConteudo());
		historico.add(display.getConteudo());
		display.limpaDisplay();
		display.atualiza(ope.Calcular());
		historico.add("Raiz");
		historico.add(display.getConteudo());
	}

	public void processaMaisOuMenos() {
		ope = new MaisMenos(display.getConteudo());
		historico.add(display.getConteudo());
		display.limpaDisplay();
		display.atualiza(ope.Calcular());
		historico.add("+-");
		historico.add(display.getConteudo());		
	}

	public void processaFatorial() {
		ope = new Fatorial(display.getConteudo());
		historico.add(display.getConteudo());
		display.limpaDisplay();
		display.atualiza(ope.Calcular());
		historico.add("!F");
		historico.add(display.getConteudo());
	}

	public void processaSete() {
		display.atualiza("7");
	}

	public void processaOito() {
		display.atualiza("8");
	}

	public void processaNove() {
		display.atualiza("9");
	}

	public void processaDivisao() {
		ope = new Divisao(display.getConteudo());	
		historico.add(display.getConteudo());
		display.limpaDisplay();
		historico.add("/");
	}

	public void processaPorcentual() {
		ope = new UmSobreX(display.getConteudo());	
		historico.add(display.getConteudo());
		display.limpaDisplay();
		display.atualiza(ope.Calcular());	
		historico.add("%");
		historico.add(display.getConteudo());
	}

	public void processaQuatro() {
		display.atualiza("4");		
	}

	public void processaCinco() {
		display.atualiza("5");
	}

	public void processaSeis() {
		display.atualiza("6");
	}

	public void processaVezes() {
		ope = new Multiplicacao(display.getConteudo());	
		historico.add(display.getConteudo());
		display.limpaDisplay();
		historico.add("*");		
	}

	public void processaUmSobreX() {
		ope = new UmSobreX(display.getConteudo());
		historico.add(display.getConteudo());
		display.limpaDisplay();
		display.atualiza(ope.Calcular());		
		historico.add("1x");
		historico.add(display.getConteudo());
	}

	public void processaUm() {
		display.atualiza("1");
	}

	public void processaDois() {
		display.atualiza("2");
	}

	public void processaTres() {
		display.atualiza("3");
	}

	public void processaMenos() {
		ope = new Subtracao(display.getConteudo());	
		historico.add(display.getConteudo());
		display.limpaDisplay();	
		historico.add("-");
	}

	public void processaXElevadoY() {
		ope = new Elevacao(display.getConteudo());	
		historico.add(display.getConteudo());
		display.limpaDisplay();	
		historico.add("^");
	}

	public void processaZero() {
		display.atualiza("0");
	}

	public void processaVirgula() {
		display.atualiza(",");
	}

	public void processaIgual() {
		if (ope != null) {
			String operando = display.getConteudo();
			display.limpaDisplay();
			display.atualiza(ope.Calcular(operando));
		}
	}

	public void processaLog() {
		ope = new Logaritmo(display.getConteudo());
		historico.add(display.getConteudo());
		display.limpaDisplay();
		display.atualiza(ope.Calcular());	
		historico.add("Log");
		historico.add(display.getConteudo());
	}

	public void processaMais() {
		ope = new Soma(display.getConteudo());	
		historico.add(display.getConteudo());
		display.limpaDisplay();	
		historico.add("+");
	}
	
	public void processaRedo(){
		
	}
	
	public void processaEndo(){

	}
}