package br.com.desafios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe que verifica se o número que o usário digitou pertence ou não à sequencia de Fibonacci.
 * 
 * @author Natashy
 *
 */
public class Fibonacci {

	/**
	 * Método main que excuta o código de verificação de um número na sequencia de Fibonacci.
	 * @param args
	 */
	public static void main(String[] args) {

		int numFibonacci1 = 0;
		int numFibonacci2 = 1;
		int numFibonacci;
		int valorEntrada;
		boolean isFibonacci = false;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite um numero para conferir se ele pertence a sequencia de Fibonacci: ");
			valorEntrada = sc.nextInt();
			sc.close();
			
			//For para calcular e verificar se o número digitado pertence ou não à sequência de Fibonacci.
			for (int cont = 0; cont <= valorEntrada; cont++) {
				
				if (numFibonacci1 == valorEntrada) {
					isFibonacci = true;
				}
				
				numFibonacci = numFibonacci1 + numFibonacci2;
				numFibonacci1 = numFibonacci2;
				numFibonacci2 = numFibonacci;
			}

			if(isFibonacci) {
				System.out.println("O numero " + valorEntrada + " pertence a sequencia de Fibonacci.");
			} else {
				System.out.println("O numero " + valorEntrada + " NAO pertence a sequencia de Fibonacci.");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Digite um numero inteiro.");
		}
	}

}
