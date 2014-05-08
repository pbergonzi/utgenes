package ar.edu.utn.frba.ia.ag;

import junit.framework.TestCase;
import ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import ar.edu.utn.frba.ia.ag.Configuracion;
import ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import ar.edu.utn.frba.ia.ag.Individuo;
import ar.edu.utn.frba.ia.ag.paro.CantidadDeCiclos;
import ar.edu.utn.frba.ia.ag.paro.CriterioDeParo;

public class AlgoritmoGeneticoTest extends TestCase {
	
	public void testUnaVuelta() {
		
		CriterioDeParo paroInstantaneo = new CantidadDeCiclos(1L);
		Configuracion config = new ConfiguracionDefault();
		config.setCriterioDeParo(paroInstantaneo);
		
		AlgoritmoGenetico ag = new AlgoritmoGenetico(config, IndividuoDePrueba.class);
		Individuo resultado = ag.ejecutar();
		assertNotNull(resultado);
	}
	
	public void testCruzamiento() {
		
//		Cruzamiento.simple(individuos);
		
	}
	
	public void testLoggearEstado() {
	}
	
}
