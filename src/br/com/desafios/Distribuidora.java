package br.com.desafios;

import java.util.ArrayList;

/**
 * Classe que verifica os faturamentos diários de uma distribuidora.
 * 
 * @author Natashy
 *
 */
public class Distribuidora {

	public static void main(String[] args) {
		
		ArrayList<Double> valores = new ArrayList<Double>();
		
		valores.add(22174.1664);
		valores.add(24537.6698);
		valores.add(26139.6134);
		valores.add(0.0); 
		valores.add(0.0);
		valores.add(26742.6612);
		valores.add(0.0);
		valores.add(42889.2258);
		valores.add(46251.174);
		valores.add(11191.4722);
		valores.add(0.0);
		valores.add(0.0);
		valores.add(3847.4823);
		valores.add(373.7838);
		valores.add(2659.7563);
		valores.add(48924.2448);
		valores.add(18419.2614);
		valores.add(0.0);
		valores.add(0.0);
		valores.add(35240.1826);
		valores.add(43829.1667);
		valores.add(18235.6852);
		valores.add(4355.0662);
		valores.add(13327.1025);
		valores.add(0.0);
		valores.add(0.0);
		valores.add(25681.8318);
		valores.add(1718.1221);
		valores.add(13220.495);
		valores.add(8414.61);
		
		double maior = 0;
		
		//For que calcula o maior valor de faturamento ocorrido em um dia do mês.
		for (int i = 0; i < valores.size(); i++) {
			if (maior < valores.get(i)) {
				maior = valores.get(i);
			}
		}
		
		System.out.println("O maior valor de faturamento ocorrido em um dia do mes foi de: " + maior);
	
		double menor = valores.get(1);
		
		//For que calcula o menor valor de faturamento ocorrido em um dia do mês.
		for (int i = 0; i < valores.size(); i++) {
			if (menor > valores.get(i)) {
				menor = valores.get(i);
			}
		}
		
		System.out.println("O menor valor de faturamento ocorrido em um dia do mes foi de: " + menor);
		Double media = valores.stream().filter(v -> v > 0).mapToDouble(a -> a).average().getAsDouble();
		ArrayList<Double> dias = new ArrayList<Double>();
		
		//For que calcula quantos dias do mês em que o valor de faturamento diário foi superior à média mensal.
		for (int i = 0; i < valores.size(); i++) {
			if (media < valores.get(i)) {
				dias.add(valores.get(i));
			}
		}
		
		System.out.println("O numero de dias no mes em que o valor de faturamento diario foi superior a media mensal foi de: " + dias.size()
		+ " dias.");
	}
}
