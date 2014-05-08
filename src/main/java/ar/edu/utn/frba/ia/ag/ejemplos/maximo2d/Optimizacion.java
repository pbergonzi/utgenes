package ar.edu.utn.frba.ia.ag.ejemplos.maximo2d;

import java.util.logging.Logger;

import ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import ar.edu.utn.frba.ia.ag.Configuracion;
import ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import ar.edu.utn.frba.ia.ag.Individuo;
import ar.edu.utn.frba.ia.ag.mutacion.MutacionAdaptativaPorConvergencia;

public class Optimizacion {
	
	public static void main(String[] args) {
		
		Configuracion config = new ConfiguracionDefault();
		
		config.setMutacion(new MutacionAdaptativaPorConvergencia());
		
		AlgoritmoGenetico maximoLocal = new AlgoritmoGenetico(config, Combinaciones.class);
		
		Individuo xyz = maximoLocal.ejecutar();
		
		System.out.println("----------------------------------------------------------");
		System.out.println("***** LOS GANADORES *****");
		Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe("Individuo final: " + xyz.toString());
		
		// Resultado Esperado https://docs.google.com/drawings/d/1i5sv1zcMGIulYWkuLcAv6UQV5haLKlKHm_FgiDWXdG0
		
	}
}
