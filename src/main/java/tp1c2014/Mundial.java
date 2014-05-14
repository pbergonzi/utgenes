package tp1c2014;

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
		this.sede = generarRandom(ConstantesMundiales.SEDES);
		this.campeon = generarRandom(ConstantesMundiales.CAMPEONES);
		this.subcampeon = generarRandom(ConstantesMundiales.SUBCAMPEONES);
		this.goleador = generarRandom(ConstantesMundiales.GOLEADORES);
		this.goles = generarRandom(ConstantesMundiales.GOLES);
		this.partidos = generarRandom(ConstantesMundiales.PARTIDOS);
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
