package ar.edu.utn.frba.ia.ag;

import junit.framework.TestCase;
import ar.edu.utn.frba.ia.ag.Configuracion;
import ar.edu.utn.frba.ia.ag.Configuracion5Min;
import ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import ar.edu.utn.frba.ia.ag.cruzamiento.Simple;
import ar.edu.utn.frba.ia.ag.mutacion.MutacionSimple;
import ar.edu.utn.frba.ia.ag.paro.CantidadDeCiclos;
import ar.edu.utn.frba.ia.ag.paro.TiempoTranscurrido;
import ar.edu.utn.frba.ia.ag.seleccion.Torneo;

import org.junit.Test;

public class ConfiguracionTest extends TestCase {
	
	@Test
	public void testConfiguracion5Min() {
		
		Configuracion config = new Configuracion5Min();
		
		assertFalse(config.getCriterioDeParo().parar(null));
		assertEquals(TiempoTranscurrido.class.getName(), config.getCriterioDeParo().getClass().getName());
		
		assertEquals(MutacionSimple.class.getName(), config.getMutacion().getClass().getName());
		assertEquals(Simple.class.getName(), config.getCruzamiento().getClass().getName());
		assertEquals(Torneo.class.getName(), config.getMetodoDeSeleccion().getClass().getName());
		assertEquals(999, config.getPoblacionInicial());
		
	}
	
	@Test
	public void testConfiguracionDefault() {
		
		Configuracion config = new ConfiguracionDefault();
		
		assertFalse(config.getCriterioDeParo().parar(null));
		assertEquals(CantidadDeCiclos.class.getName(), config.getCriterioDeParo().getClass().getName());
		
		assertEquals(MutacionSimple.class.getName(), config.getMutacion().getClass().getName());
		assertEquals(Simple.class.getName(), config.getCruzamiento().getClass().getName());
		assertEquals(Torneo.class.getName(), config.getMetodoDeSeleccion().getClass().getName());
		assertEquals(999, config.getPoblacionInicial());
		
	}
	
}
