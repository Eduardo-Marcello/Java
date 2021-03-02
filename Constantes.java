package projeto.bloco.tp2;

public class Constantes {
	public static final int SOMA = 1;
	public static final int SUBTRACAO = 2;
	public static final int MULTIPLICACAO = 3;
	public static final int DIVISAO = 4;
	public static final int SAIR = 5;
	
	public static String nomeOperacao(int numero) {
		switch(numero) {
			case 1:
				return "Soma";
			case 2:
				return "Subtração";
			case 3:
				return "Multiplicação";
			case 4:
				return "Divisão";		
		}
		return null;
	}
	
	public static String sinalOperacao(int numero) {

		switch(numero) {
			case 1:
				return "+";
			case 2:
				return "-";
			case 3:
				return "*";
			case 4:
				return "/";		
		}
		return null;
	}
}
