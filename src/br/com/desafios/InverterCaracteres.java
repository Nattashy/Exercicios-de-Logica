package br.com.desafios;

import java.util.Scanner;

/**
 * Classe que inverte os caracteres de uma string.
 * 
 * @author Natashy
 *
 */
public class InverterCaracteres {

	/**
	 * Método main que excuta o código de inverter os caracteres de uma string.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String valorEntrada;
		String retorno = "";
		
		System.out.println("Digite uma palavra: ");
		valorEntrada = sc.next();
		sc.close();
		
		//For que inverte os caracteres.
		String[] listaEntrada = valorEntrada.split("");
		for (int i = listaEntrada.length - 1; i >= 0; i--) {
			retorno += valorEntrada.charAt(i);
		}

		System.out.println(retorno);
	}
}
