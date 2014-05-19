package ar.edu.utn.frba.ia.ag.ejemplos.monedas;

import java.util.logging.Logger;

import ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import ar.edu.utn.frba.ia.ag.Individuo;

public class EjemploMonedas {
	
	public static void main(String[] args) {
		
		AlgoritmoGenetico cambioMonedas = new AlgoritmoGenetico(new ConfiguracionDefault(), Monedero.class);
		
		Individuo monedas = cambioMonedas.ejecutar();
		
		Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe("Individuo final: " + monedas.toString());
		
	}
	
}
