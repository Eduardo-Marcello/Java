package projeto.bloco.tp2;

public class Calculadora {
	
	private double numero1, numero2;
	private int codigoOperacao;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoOperacao() {
		return codigoOperacao;
	}

	public void setCodigoOperacao(int codigoOperacao) {
		this.codigoOperacao = codigoOperacao;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public boolean validaSelecao() {
		switch(codigoOperacao) {
			case Constantes.SOMA:
			case Constantes.SUBTRACAO:
			case Constantes.MULTIPLICACAO:
			case Constantes.DIVISAO:
			case Constantes.SAIR:
				return true;
			default:
				return false;
		}
	}
	private double selecao(int numero) {
		switch(numero) {
			case Constantes.SOMA:
				return calcSoma();
			case Constantes.SUBTRACAO:
				return calcSubtracao();
			case Constantes.MULTIPLICACAO:
				return calcMultiplicacao();
			case Constantes.DIVISAO:
				return calcDivisao();
		}
		
		return 0;
	}
	
	private double calcSoma() {	
		return numero1 + numero2;
	}
	
	private double calcSubtracao() {
		return numero1 - numero2;
	}
	
	private double calcMultiplicacao() {
		return numero1 * numero2;
	}
	
	private double calcDivisao() {
		return numero1 / numero2;
	}
	
	public void resultado() {
		
		System.out.println("\n[" + nome + "] " + Constantes.nomeOperacao(codigoOperacao) + ": " + numero1 + " " + Constantes.sinalOperacao(codigoOperacao) + " "
		+ numero2 + " = " + selecao(codigoOperacao));
	}
}
