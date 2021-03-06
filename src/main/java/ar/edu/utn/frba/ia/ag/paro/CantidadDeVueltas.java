package ar.edu.utn.frba.ia.ag.paro;

import java.util.List;

import ar.edu.utn.frba.ia.ag.Individuo;

public class CantidadDeVueltas extends CriterioDeParo {
	
	private Long ciclosTranscurridos;
	private Long totalCiclos;
	
	public CantidadDeVueltas(Long totalCiclos) {
		this.totalCiclos = totalCiclos;
		this.ciclosTranscurridos = new Long(0);
	}
	
	@Override
	public Boolean parar(List<Individuo> individuos) {
		
		if (totalCiclos.equals(ciclosTranscurridos)) {
			return Boolean.TRUE;
		}
		
		ciclosTranscurridos++;
		
		return Boolean.FALSE;
	}
}
