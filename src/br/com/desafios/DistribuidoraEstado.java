package br.com.desafios;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Classe que verifica o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
 * 
 * @author Natashy
 *
 */
public class DistribuidoraEstado {

	/**
	 * Método main que excuta o código de verificação do percentual que cada estado teve segundo o valor mensal total da distribuidora.
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, Double> valorEstado = new LinkedHashMap<String, Double>();
		
	    valorEstado.put("SP", 67836.43);
	    valorEstado.put("RJ", 36678.66);
	    valorEstado.put("MG", 29229.88);
	    valorEstado.put("ES", 27165.48);
	    valorEstado.put("Outros", 19849.53);
	    
	    double soma = 0;
	    
	    //For que calcula a soma dos valores de todos os estados.
	    for(String key : valorEstado.keySet()) {
	    	soma += valorEstado.get(key);
	    }
	    
	    double resultado = 0;
	    
	    //For que calcula o percentual de representação de cada estado.
	    for (String key : valorEstado.keySet()) {
	    	resultado = valorEstado.get(key) * 100 / soma;
	    	valorEstado.put(key, resultado);
	    }
   
	    //For que imprime a porcentagem de representação que cada estado teve dentro do valor total mensal da distribuidora.
	    for(String key : valorEstado.keySet()) {
	    	System.out.println(key + " " + valorEstado.get(key).intValue() + "%");
	    }
	}
}
