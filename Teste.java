package projeto.bloco.tp2;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		boolean f=true;
		Calculadora calculadora = new Calculadora();
		Scanner entrada = new Scanner(System.in);
		
		calculadora.setNome(leNome());
		do {
			calculadora.setCodigoOperacao(selecionarOperacao());
			if(calculadora.validaSelecao()) {
				if(calculadora.getCodigoOperacao()==5) {
					f=false;
				} else {
					calculadora.setNumero1(leNumero1());
					calculadora.setNumero2(leNumero2());
					calculadora.resultado();
				}
			}
			else {
				System.out.println(calculadora.getNome() + ", sua seleção está inválida: " + calculadora.getCodigoOperacao() + "!");
			}
		}while(f==true);
		System.out.println("\nEncerrando o programa.");
		entrada.close();
	}
	
	private static double leNumero1() {
		Scanner numero1 = new Scanner(System.in);
		System.out.print("\nDigite o primeiro numero numero: ");
		return numero1.nextDouble();
	}
	
	private static double leNumero2() {
		Scanner numero2 = new Scanner(System.in);
		System.out.print("Digite o segundo numero numero: ");
		return numero2.nextDouble();
	}
	
	private static String leNome() {
		Scanner nome = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		return nome.nextLine();
	}
	
	private static int selecionarOperacao() {
		Scanner operacao = new Scanner(System.in);
		
		System.out.println("\nMenu de Operações disponíveis:");
		System.out.println("[1] - Soma");
		System.out.println("[2] - Subtração");
		System.out.println("[3] - Multiplicação");
		System.out.println("[4] - Divisão");
		System.out.println("[5] - Sair");
		System.out.print("Digite a opção desejada: ");
		return operacao.nextInt();
	}
	
}
