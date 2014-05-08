package ar.edu.utn.frba.ia.ag;

import ar.edu.utn.frba.ia.ag.cruzamiento.Simple;
import ar.edu.utn.frba.ia.ag.mutacion.MutacionSimple;
import ar.edu.utn.frba.ia.ag.paro.TiempoTranscurrido;
import ar.edu.utn.frba.ia.ag.seleccion.Torneo;

public class Configuracion5Min extends Configuracion {
	
	public Configuracion5Min() {
		
		super(new TiempoTranscurrido(0, 5, 0), // cada corrida completa dura 5 minutos
				999, // cantIndividuosIniciales
				new Torneo(), // seleccion
				new Simple(), // cruzamiento
				new MutacionSimple(0.2)); // mutacion
	}
	
}
