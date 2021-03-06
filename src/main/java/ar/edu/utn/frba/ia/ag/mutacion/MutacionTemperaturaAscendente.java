package ar.edu.utn.frba.ia.ag.mutacion;

import java.util.List;

import ar.edu.utn.frba.ia.ag.Estado;
import ar.edu.utn.frba.ia.ag.Individuo;

public class MutacionTemperaturaAscendente extends Mutacion {
	
	private Mutacion mutacionAuxiliar = new MutacionTemperaturaDescendente();
	
	@Override
	protected double getProbabilidadDeMutacion(List<Individuo> individuos, Estado estado) {
		return 1 - mutacionAuxiliar.getProbabilidadDeMutacion(individuos, estado);
	}
	
}
