package tp1c2014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Mundial {

	private int anio;
	private String sede;
	private String campeon;
	private String subcampeon;
	private String goleador;
	private int goles;
	private int partidos;
	
	public Mundial(int anio) {
		this.anio = anio;
		this.sede = generar(ConstantesMundiales.SEDES, ConstantesMundiales.SEDES_USADOS);
		this.campeon = generar(ConstantesMundiales.CAMPEONES, ConstantesMundiales.CAMPEONES_USADOS);
		this.subcampeon = generar(ConstantesMundiales.SUBCAMPEONES, ConstantesMundiales.SUBCAMPEONES_USADOS);
		this.goleador = generar(ConstantesMundiales.GOLEADORES, ConstantesMundiales.GOLEADORES_USADOS);
		this.goles = generar(ConstantesMundiales.GOLES, ConstantesMundiales.GOLES_USADOS);
		this.partidos = generar(ConstantesMundiales.PARTIDOS, ConstantesMundiales.PARTIDOS_USADOS);
	}

	private <T> T generar(List<T> lista, List<T> usados) {
		List<T> list = new ArrayList<T>(lista);
		Collections.shuffle(list);
		
		if ( usados.size() == list.size() ){
			usados.clear();
		}
		
		boolean encontrado = false;
		while (!encontrado){
			T random = generarRandom(list);
			if ( !usados.contains(random) ){
				usados.add(random);
				return random;
			}
		}
		
        return null;
	}
	
	private <T> T generarRandom(List<T> lista) {
		Random randomGenerator = new Random();
		int index = randomGenerator.nextInt( lista.size() );
        T item = lista.get( index );
        return item;
	}
	
	@Override
	public String toString() {
		return "Año: " + anio + 
				" Sede: " + sede + 
				" Campeon: " + campeon + 
				" Subcampeon: " + subcampeon + 
				" Goleador: " + goleador + 
				" Goles: " + goles +
				" Partidos: " + partidos;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getCampeon() {
		return campeon;
	}

	public void setCampeon(String campeon) {
		this.campeon = campeon;
	}

	public String getSubcampeon() {
		return subcampeon;
	}

	public void setSubcampeon(String subcampeon) {
		this.subcampeon = subcampeon;
	}

	public String getGoleador() {
		return goleador;
	}

	public void setGoleador(String goleador) {
		this.goleador = goleador;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getPartidos() {
		return partidos;
	}

	public void setPartidos(int partidos) {
		this.partidos = partidos;
	}
	
}
