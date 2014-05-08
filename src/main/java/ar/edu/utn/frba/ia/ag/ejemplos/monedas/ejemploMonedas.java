package ar.edu.utn.frba.ia.ag.ejemplos.monedas;

import ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import ar.edu.utn.frba.ia.ag.Individuo;

public class ejemploMonedas {
	
	public static void main(String[] args) {
		
		AlgoritmoGenetico cambioMonedas = new AlgoritmoGenetico(new ConfiguracionDefault(), Monedero.class);
		
		Individuo monedas = cambioMonedas.ejecutar();
		
		System.err.println("Individuo resultado final: " + monedas.aptitud());
		
	}
	
}
