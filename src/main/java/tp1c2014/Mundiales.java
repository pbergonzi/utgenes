package tp1c2014;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.edu.utn.frba.ia.ag.Individuo;

public class Mundiales extends Individuo{

	private List<Mundial> mundiales = new ArrayList<Mundial>();
	private Integer numeroAptitud = null;
	
	@Override
	public Individuo generarRandom() {
		
		Mundiales combinaciones = new Mundiales();
		
		combinaciones.getMundiales().add( new Mundial( 1974 ) );
		combinaciones.getMundiales().add( new Mundial( 1978 ) );
		combinaciones.getMundiales().add( new Mundial( 1982 ) );
		combinaciones.getMundiales().add( new Mundial( 1986 ) );
		combinaciones.getMundiales().add( new Mundial( 1990 ) );
		combinaciones.getMundiales().add( new Mundial( 1994 ) );
		combinaciones.getMundiales().add( new Mundial( 1998 ) );
		combinaciones.getMundiales().add( new Mundial( 2002 ) );
		combinaciones.getMundiales().add( new Mundial( 2006 ) );
		combinaciones.getMundiales().add( new Mundial( 2010 ) );
		
		return combinaciones;
	}
	
	@Override
	public double aptitud() {
		Integer aptitud = 0;
		if ( this.numeroAptitud == null ){
			
			/*Condiciones*/
			ConstantesMundiales.total++;
			
			// 1- El mundial de 1974 fue en el que se anotaron menos goles
			if ( enElDe1974SeAnotaronMenosGoles() ){
				ConstantesMundiales.r2++;
				aptitud += 87;
			}
			// 2- Espana y Francia salieron campeones solo una vez, el resto dos veces
			if ( espanaYFranciaSalieronCampeonesUnaVezElRestoDos() ){
				ConstantesMundiales.r3++;
				aptitud += 95;
			}
			// 3- Tres veces salio campeon el mismo pais que era sede
			if ( tresVecesSalioCampeonElMismoPaisQueEraSede() ){
				ConstantesMundiales.r4++;
				aptitud += 95;
			}
			// 4- Holanda fue 3 veces subcampeon pero nunca campeon
			if ( holandaFue3VecesSubcampeonPeroNuncaCampeon() ){
				ConstantesMundiales.r5++;
				aptitud += 96;
			}
			// 5- Dos mundiales tuvieron 38 partidos, cuatro 52 y cuatro 64
			if ( dosMundialesTuvieron38PartidosCuatro52YCuatro64() ){
				ConstantesMundiales.r6++;
				aptitud += 100;
			} 
			// 6- Alemania fue dos veces sede
			if ( alemaniaFueDosVecesSede() ){
				ConstantesMundiales.r7++;
				aptitud += 77;
			}
			// 7- Brasil y Alemania fueron campeones luego de ser subcampeones
			if ( brasilYAlemaniaSalieronCampeonesDespuesDeSerSubcampeones() ){
				ConstantesMundiales.r9++;
				aptitud += 100;
			}
			// 8- En tres mundiales fue goleador el mismo pais campeon
			if ( enTresMundialesFueGoleadorElMismoPaisCampeon() ){
				ConstantesMundiales.r10++;
				aptitud += 97;
			}
			// 9- El mundial ganado por Francia fue el que tuvo mas cantidad de goles
			if ( elMundialGanadoPorFranciaFueElQueTuvoMasCantidadDeGoles() ){
				ConstantesMundiales.r11++;
				aptitud += 83;
			}
			// 10- El mundial con menos goles tuvo de goleador a Polonia
			if ( elMundialConMenosGolesTuvoDeGoleadorAPolonia() ){
				ConstantesMundiales.r12++;
				aptitud += 89;
			}
			
			// 11- Argentina y Brasil fueron subcampeones luego de ser campeones
			if ( argentinaYBrasilFueronSubcampeonesLuegoDeSerCampeones() ){
				ConstantesMundiales.r14++;
				aptitud += 100;
			}
			// 12- Solamente en el mundial de 1978, tanto la sede, como el campeon, como el goleador son el o del mismo pais.
			if ( soloEn1978LaSedeElGoleadorYElCampeonSonElMismoPais() ){
				ConstantesMundiales.r15++;
				aptitud += 99;
			}		
			// 13- Alemania jugo 5 finales
			if ( alemaniaJugo5Finales() ){
				ConstantesMundiales.r17++;
				aptitud += 98;
			}
			// 14- Holanda salio subcampeon dos veces seguidas.
			if ( holandaSalioSubcampeonDosVecesSeguidas() ){
				ConstantesMundiales.r18++;
				aptitud += 96;
			}
			// 15- Alemania y Argentina disputaron dos finales, alternando campeonato y subcampeonato. Dichas finales son las de 1986 y 1990.
			if ( alemaniaYArgentinaJugaronDosFinalesAlternandoCampeonatoYSubcampeonatoEn1986Y1990() ){
				ConstantesMundiales.r19++;
				aptitud += 100;
			}
			// 16 - Todo mundial tuvo igual o mas partidos que el anterior.
			if ( todoMundialTuvoIgualOMasPartidosQueElAnterior() ){
				ConstantesMundiales.r20++;
				aptitud += 1;
			}
			// 17 - En un mundial, campeon y subcampeon son paises diferentes.
			if ( unPaisNoEsCampeonYSubcampeonEnUnMundial() ){
				ConstantesMundiales.r21++;
				aptitud += 24;
			}
			// 18- En Mexico se convirtieron 132 goles en total
			if ( enMexicoSeConvirtieron132GolesEnTotal() ){
				ConstantesMundiales.r23++;
				aptitud += 7;
			}
			// 19- La sede de 1974 fue Alemania
			if ( alemaniaFueSedeEn1974() ){
				ConstantesMundiales.r25++;
				aptitud += 11;
			}
			// 20- El goleador del mundial, forma parte de un equipo distinto al subcampeon
			if ( unSubcampeonNuncaTuvoUnGoleadorEnElMismoMundial() ){
				ConstantesMundiales.r22++;
				aptitud += 46;
			}
			
			/*Restricciones*/
			// 21- Dos mundiales tuvieron la misma cantidad de goles totales.
			if ( !hayDosMundialesConLaMismaCantidadDeGoles() ){
				ConstantesMundiales.r1++;
				aptitud -= 99;
			}
			
			// 22- En Italia no fue campeon Argentina
			if ( !argentinaNoSalioCampeonEnItalia() ){
				ConstantesMundiales.r8++;
				aptitud -= 82;
			}
			// 23- Solo existe un goleador uruguayo.
			if ( !uruguayTuvoUnSoloGoleador() ){
				ConstantesMundiales.r16++;
				aptitud -= 66;
			}
			// 24- En Alemania nunca se jugaron 52 partidos
			if ( !enAlemaniaNuncaSeJugaron52Partidos() ){
				ConstantesMundiales.r24++;
				aptitud -= 34;
			}
			// 25- Argentina no salio campeon en los mundiales con 64 partidos
			if ( !argentinaNoSalioCampeonEnLosMundialesCon64Partidos() ){
				ConstantesMundiales.r13++;
				aptitud -= 52;
			}
			
			this.setNumeroAptitud( aptitud );
			
		}else{
			aptitud = this.numeroAptitud;
		}	
		
		return (double) aptitud;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Mundial mundial : getMundiales()) {
			sb.append("\n");
			sb.append( mundial.toString() );
			sb.append("\n");
		}
		return sb.toString();
	}
	
	private boolean alemaniaYArgentinaJugaronDosFinalesAlternandoCampeonatoYSubcampeonatoEn1986Y1990() {
		Mundial mundial86 = null;
		Mundial mundial90 = null;
		
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getAnio() == 1986 ) {
				mundial86 = mundial;
			}
			if ( mundial.getAnio() == 1990 ){
				mundial90 = mundial;
			}
		}
		
		return mundial86.getCampeon().equals( mundial90.getSubcampeon() )
				&& mundial86.getSubcampeon().equals( mundial90.getCampeon() )
				&& ( ( mundial86.getCampeon().equals( ConstantesMundiales.ARGENTINA ) && mundial86.getSubcampeon().equals( ConstantesMundiales.ALEMANIA ) )
						|| ( mundial86.getCampeon().equals( ConstantesMundiales.ALEMANIA ) && mundial86.getSubcampeon().equals( ConstantesMundiales.ARGENTINA ) ) );
	}

	private boolean holandaSalioSubcampeonDosVecesSeguidas() {
		List<Integer> subcampeonatos = new ArrayList<Integer>();
		
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getSubcampeon().equals( ConstantesMundiales.HOLANDA ) ){
				subcampeonatos.add( mundial.getAnio() );
			}
		}
		
		for (Integer anio : subcampeonatos) {
			if ( subcampeonatos.contains( anio + 4 ) ){
				return true;
			}
		}
		
		return false;
	}

	private boolean enMexicoSeConvirtieron132GolesEnTotal() {
		int goles = 0;
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getSede().equals( ConstantesMundiales.MEXICO )){
				goles += mundial.getGoles();
			}
		}
		return goles == 132;
	}

	private boolean alemaniaJugo5Finales() {
		int cumplen = 0;
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getCampeon().equals( ConstantesMundiales.ALEMANIA ) || mundial.getSubcampeon().equals( ConstantesMundiales.ALEMANIA ) ){
				cumplen++;
			}
		}
		return cumplen == 5;
	}

	private boolean uruguayTuvoUnSoloGoleador() {
		int cumplen = 0;
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getGoleador().equals( ConstantesMundiales.URUGUAY ) ){
				cumplen++;
			}
		}
		return cumplen == 1;
	}

	private boolean unSubcampeonNuncaTuvoUnGoleadorEnElMismoMundial() {
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getSubcampeon().equals( mundial.getGoleador() ) ){
				return false;
			}
		}
		return true;
	}

	private boolean todoMundialTuvoIgualOMasPartidosQueElAnterior() {
		for (Mundial mundial : getMundiales()) {
			for (Mundial mundial2 : getMundiales()) {
				if ( mundial.getPartidos() < mundial2.getPartidos() && mundial.getAnio() > mundial2.getAnio() ){
					return false;
				}
			}
		}
		return true;
	}
	

	private boolean unPaisNoEsCampeonYSubcampeonEnUnMundial() {
		
		for (Mundial mundial : getMundiales()) {
			if (mundial.getCampeon().equals( mundial.getSubcampeon() )){
				return false;
			}
		}
		return true;
	}

	private boolean soloEn1978LaSedeElGoleadorYElCampeonSonElMismoPais() {
		List<Mundial> cumplen = new ArrayList<Mundial>();
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getCampeon().equals( mundial.getGoleador() ) && mundial.getCampeon().equals( mundial.getSede() ) ){
				cumplen.add(mundial);
			}
		}
		
		return cumplen.size() == 1 && cumplen.get(0).getAnio() == 1978;
	}

	private boolean argentinaYBrasilFueronSubcampeonesLuegoDeSerCampeones() {
		List<Integer> argentinaCampeon = new ArrayList<Integer>();
		List<Integer> argentinaSubCampeon = new ArrayList<Integer>();
		List<Integer> brasilCampeon = new ArrayList<Integer>();
		List<Integer> brasilSubCampeon = new ArrayList<Integer>();
		
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getCampeon().equals(ConstantesMundiales.ARGENTINA) ){
				argentinaCampeon.add( mundial.getAnio() );
			}  
			else if ( mundial.getSubcampeon().equals(ConstantesMundiales.ARGENTINA) ){
				argentinaSubCampeon.add( mundial.getAnio() );
			}
			else if ( mundial.getCampeon().equals(ConstantesMundiales.BRASIL) ){
				brasilCampeon.add( mundial.getAnio() );
			}
			else if ( mundial.getCampeon().equals(ConstantesMundiales.BRASIL) ){
				brasilSubCampeon.add( mundial.getAnio() );
			}
			
		}
		
		boolean seCumpleParaArgentina = false;
		for (Integer anioCampeon : argentinaCampeon) {
			if ( argentinaSubCampeon.contains( anioCampeon + 4 ) ){
				seCumpleParaArgentina = true;
				break;
			}
		}
		
		boolean seCumpleParaBrasil = false;
		for (Integer anioCampeon : brasilCampeon) {
			if ( brasilSubCampeon.contains( anioCampeon + 4 ) ){
				seCumpleParaBrasil = true;
				break;
			}
		}
		
		return seCumpleParaArgentina && seCumpleParaBrasil;
	}

	private boolean argentinaNoSalioCampeonEnLosMundialesCon64Partidos() {
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getCampeon().equals( ConstantesMundiales.ARGENTINA ) && mundial.getPartidos() == 64 ){
				return false;
			}
		}
		return true;
	}

	private boolean elMundialConMenosGolesTuvoDeGoleadorAPolonia() {
		return getMundialConMenosGoles().getGoleador().equals(ConstantesMundiales.POLONIA);
	}

	private boolean elMundialGanadoPorFranciaFueElQueTuvoMasCantidadDeGoles() {
		return getMundialConMasGoles().getCampeon().equals(ConstantesMundiales.FRANCIA);
	}

	private boolean enTresMundialesFueGoleadorElMismoPaisCampeon() {
		int cumplen = 0;
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getCampeon().equals( mundial.getGoleador() ) ){
				cumplen++;
			}
		}
		
		return cumplen == 3;
	}

	private boolean brasilYAlemaniaSalieronCampeonesDespuesDeSerSubcampeones() {
		List<Integer> alemaniaCampeon = new ArrayList<Integer>();
		List<Integer> alemaniaSubCampeon = new ArrayList<Integer>();
		List<Integer> brasilCampeon = new ArrayList<Integer>();
		List<Integer> brasilSubCampeon = new ArrayList<Integer>();
		
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getCampeon().equals(ConstantesMundiales.ALEMANIA) ){
				alemaniaCampeon.add( mundial.getAnio() );
			}  
			else if ( mundial.getSubcampeon().equals(ConstantesMundiales.ALEMANIA) ){
				alemaniaSubCampeon.add( mundial.getAnio() );
			}
			else if ( mundial.getCampeon().equals(ConstantesMundiales.BRASIL) ){
				brasilCampeon.add( mundial.getAnio() );
			}
			else if ( mundial.getCampeon().equals(ConstantesMundiales.BRASIL) ){
				brasilSubCampeon.add( mundial.getAnio() );
			}
			
		}
		
		boolean seCumpleParaAlemania = false;
		for (Integer anioCampeon : alemaniaCampeon) {
			if ( alemaniaSubCampeon.contains( anioCampeon - 4 ) ){
				seCumpleParaAlemania = true;
				break;
			}
		}
		
		boolean seCumpleParaBrasil = false;
		for (Integer anioCampeon : brasilCampeon) {
			if ( brasilSubCampeon.contains( anioCampeon - 4 ) ){
				seCumpleParaBrasil = true;
				break;
			}
		}
		
		return seCumpleParaAlemania	&& seCumpleParaBrasil;
	}

	private boolean enAlemaniaNuncaSeJugaron52Partidos() {
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getSede().equals(ConstantesMundiales.ALEMANIA) && mundial.getPartidos() == 52 ){
				return false;
			}
		}
		return true;
	}

	private boolean argentinaNoSalioCampeonEnItalia() {
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getSede().equals(ConstantesMundiales.ITALIA) && mundial.getCampeon().equals(ConstantesMundiales.ARGENTINA) ){
				return false;
			}
		}
		return true;
	}

	private boolean alemaniaFueSedeEn1974() {
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getAnio() == 1974 ){
				return mundial.getSede().equals(ConstantesMundiales.ALEMANIA);
			}
		}
		return false;
	}

	private boolean alemaniaFueDosVecesSede() {
		Map<String, Integer> sedesPorPais = getSedesPorPais();
		
		return sedesPorPais.keySet().contains( ConstantesMundiales.ALEMANIA ) 
				&& sedesPorPais.get(ConstantesMundiales.ALEMANIA) == 2;
	}

	private boolean dosMundialesTuvieron38PartidosCuatro52YCuatro64() {
		Map<Integer, Integer> mundialesPorCantidadDePartidos = getMundialesPorCantidadDePartidos();
		
		return mundialesPorCantidadDePartidos.keySet().contains(32) 
				&& mundialesPorCantidadDePartidos.get(32) == 2 
				&& mundialesPorCantidadDePartidos.keySet().contains(52) 
				&& mundialesPorCantidadDePartidos.get(52) == 4 
				&& mundialesPorCantidadDePartidos.keySet().contains(64) 
				&& mundialesPorCantidadDePartidos.get(64) == 4;
	}

	private boolean holandaFue3VecesSubcampeonPeroNuncaCampeon() {
		Map<String, Integer> campeonatosPorPais = getCampeonatosPorPais();
		Map<String, Integer> subcampeonatosPorPais = getSubCampeonatosPorPais();
		
		return subcampeonatosPorPais.keySet().contains(ConstantesMundiales.HOLANDA) 
				&& subcampeonatosPorPais.get(ConstantesMundiales.HOLANDA) == 3 
				&& !campeonatosPorPais.keySet().contains(ConstantesMundiales.HOLANDA);
	}

	private boolean tresVecesSalioCampeonElMismoPaisQueEraSede() {
		int cumplen = 0;
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getCampeon().equals( mundial.getSede() ) ){
				cumplen++;
			}
		}
		
		return cumplen == 3;
	}

	private boolean espanaYFranciaSalieronCampeonesUnaVezElRestoDos() {
		Map<String, Integer> campeonatosPorPais = getCampeonatosPorPais();
		
		boolean seCumple = true;
		for (String pais : ConstantesMundiales.CAMPEONES) {
			if ( !campeonatosPorPais.keySet().contains(pais) ){
				return false;
			}
			
			if ( pais.equals(ConstantesMundiales.ESPANA) || pais.equals(ConstantesMundiales.FRANCIA) ){
				if ( campeonatosPorPais.get(pais) != 1 ){
					seCumple  = false;
					break;
				}
			} else {
				if ( campeonatosPorPais.get(pais) != 2 ){
					seCumple  = false;
					break;
				}
			}
		}
		
		return seCumple;
	}

	private boolean enElDe1974SeAnotaronMenosGoles() {
		return getMundialConMenosGoles().getAnio() == 1974;
	}

	private boolean hayDosMundialesConLaMismaCantidadDeGoles() {
		Map<Integer,Integer> mundialesPorCantidadDeGoles = getMundialesPorCantidadDeGoles();
		
		for (Integer mundialesConLaMismaCantidadDeGoles : mundialesPorCantidadDeGoles.values()) {
			if ( mundialesConLaMismaCantidadDeGoles == 2 ){
				return true;
			}
		}
		return false;
	}
	
	/*
	 * ---------------------------------------------------------------------------------------
	 * 		METODOS AUXILIARES
	 * ---------------------------------------------------------------------------------------
	 */
	private Map<String, Integer> getCampeonatosPorPais() {
		Map<String,Integer> campeonatosPorPais = new HashMap<String,Integer>();
		
		for (Mundial mundial : getMundiales()) {
			
			Integer campeonatos = campeonatosPorPais.get( mundial.getCampeon() );
			
			if ( campeonatos == null ){
				campeonatosPorPais.put( mundial.getCampeon(), 1 );
			} else {
				campeonatosPorPais.put( mundial.getCampeon(), campeonatos + 1 );
			}
		}
		return campeonatosPorPais;
	}
	
	private Map<String, Integer> getSubCampeonatosPorPais() {
		Map<String,Integer> subCampeonatosPorPais = new HashMap<String,Integer>();
		
		for (Mundial mundial : getMundiales()) {
			
			Integer subCampeonatos = subCampeonatosPorPais.get( mundial.getSubcampeon() );
			
			if ( subCampeonatos == null ){
				subCampeonatosPorPais.put( mundial.getSubcampeon(), 1 );
			} else {
				subCampeonatosPorPais.put( mundial.getSubcampeon(), subCampeonatos + 1 );
			}
		}
		return subCampeonatosPorPais;
	}

	private Map<Integer,Integer> getMundialesPorCantidadDePartidos() {
		Map<Integer,Integer> mundialesPorCantidadDePartidos = new HashMap<Integer,Integer>();
		
		for (Mundial mundial : getMundiales()) {
			
			Integer partidos = mundialesPorCantidadDePartidos.get( mundial.getPartidos() );
			
			if ( partidos == null ){
				mundialesPorCantidadDePartidos.put( mundial.getPartidos(), 1 );
			} else {
				mundialesPorCantidadDePartidos.put( mundial.getPartidos(), partidos + 1 );
			}
		}
		return mundialesPorCantidadDePartidos;
	}
	
	private Map<Integer,Integer> getMundialesPorCantidadDeGoles() {
		Map<Integer,Integer> mundialesPorCantidadDeGoles = new HashMap<Integer,Integer>();
		
		for (Mundial mundial : getMundiales()) {
			
			Integer goles = mundialesPorCantidadDeGoles.get( mundial.getGoles() );
			
			if ( goles == null ){
				mundialesPorCantidadDeGoles.put( mundial.getGoles(), 1 );
			} else {
				mundialesPorCantidadDeGoles.put( mundial.getGoles(), goles + 1 );
			}
		}
		return mundialesPorCantidadDeGoles;
	}
	
	private Map<String,Integer> getSedesPorPais() {
		Map<String,Integer> sedesPorPais = new HashMap<String,Integer>();
		
		for (Mundial mundial : getMundiales()) {
			
			Integer sedes = sedesPorPais.get( mundial.getSede() );
			
			if ( sedes == null ){
				sedesPorPais.put( mundial.getSede(), 1 );
			} else {
				sedesPorPais.put( mundial.getSede(), sedes + 1 );
			}
		}
		return sedesPorPais;
	}
	
	private Mundial getMundialConMenosGoles() {
		Mundial mundialConMenosGoles = null;
		int cantidadDeGoles = 99999;
		
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getGoles() < cantidadDeGoles ){
				cantidadDeGoles = mundial.getGoles();
				mundialConMenosGoles = mundial;
			}
		}
		return mundialConMenosGoles;
	}
	
	private Mundial getMundialConMasGoles() {
		Mundial mundialConMasGoles = null;
		int cantidadDeGoles = 0;
		
		for (Mundial mundial : getMundiales()) {
			if ( mundial.getGoles() > cantidadDeGoles ){
				cantidadDeGoles = mundial.getGoles();
				mundialConMasGoles = mundial;
			}
		}
		return mundialConMasGoles;
	}

	public List<Mundial> getMundiales() {
		return mundiales;
	}

	public void setMundiales(List<Mundial> mundiales) {
		this.mundiales = mundiales;
	}

	public Integer getNumeroAptitud() {
		return numeroAptitud;
	}

	public void setNumeroAptitud( Integer numeroAptitud) {
		this.numeroAptitud = (Integer) numeroAptitud;
	}	
	
}
