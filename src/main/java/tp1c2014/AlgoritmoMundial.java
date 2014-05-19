package tp1c2014;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import ar.edu.utn.frba.ia.ag.Configuracion;
import ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import ar.edu.utn.frba.ia.ag.Individuo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AlgoritmoMundial {

	public static void main(String[] args) {
		
		List<Mundiales> ganadores = new ArrayList<Mundiales>();
		double mejorAptitud = -1000;
		Individuo mejor = null;
		
		for (int i = 0; i < 50; i++) {
		
			Configuracion config = new ConfiguracionDefault();
			
			AlgoritmoGenetico maximoLocal = new AlgoritmoGenetico(config, Mundiales.class);
			
			Mundiales xyz = (Mundiales) maximoLocal.ejecutar();
			
			
			if ( mejorAptitud < xyz.aptitud() ){
				mejorAptitud = xyz.aptitud();
				mejor = xyz;
			}
			
			ganadores.add(xyz);
		}
		
		try {
			logRestricciones();
	        BufferedWriter outG = new BufferedWriter(new FileWriter("Ganadores_Resultados.txt"));
	        BufferedWriter outFA = new BufferedWriter(new FileWriter("Ganadores_FuncionesDeAptitud.txt"));
	        outG.write("************ LOS GANADORES *******************");
	        outG.newLine();
	        outG.write( "Ganador de los ganadores");
        	outG.write( "Aptitud:" + ((Mundiales) mejor).getNumeroAptitud() );
        	outG.write( mejor.toString() );
        	outG.write("----------------------------------------------------------");
	        outFA.write("*********** VALORES DE APTITUD DE GANADORES **************");
	        outFA.newLine();
	        
	        int index = 1;
	        for (Mundiales individuo : ganadores) {
	        	
	        	outFA.write( individuo.getNumeroAptitud().toString()  );
	        	outFA.newLine();
	        	
	        	outG.write( "Ganador"  + index + "----" );
	        	outG.write( "Aptitud:" + individuo.getNumeroAptitud() );
	        	outG.write( individuo.toString() );        	
	        	outG.write("----------------------------------------------------------");
	        	outG.newLine();
	        	index++;
	        }       

            outG.close();
            outFA.close();
            
        } catch (IOException e) {}
		
	}

	private static void logRestricciones() throws IOException {
		BufferedWriter outG = new BufferedWriter(new FileWriter("Restricciones.txt"));
		outG.write("************ RESTRICCIONES *******************");
        outG.newLine();
        outG.write( "Total: " + ConstantesMundiales.total );
        outG.newLine();
        outG.write( "R1: " + ConstantesMundiales.r1 );
        outG.newLine();
        outG.write( "R2: " + ConstantesMundiales.r2 );
        outG.newLine();
        outG.write( "R3: " + ConstantesMundiales.r3 );
        outG.newLine();
        outG.write( "R4: " + ConstantesMundiales.r4 );
        outG.newLine();
        outG.write( "R5: " + ConstantesMundiales.r5 );
        outG.newLine();
        outG.write( "R6: " + ConstantesMundiales.r6 );
        outG.newLine();
        outG.write( "R7: " + ConstantesMundiales.r7 );
        outG.newLine();
        outG.write( "R8: " + ConstantesMundiales.r8 );
        outG.newLine();
        outG.write( "R9: " + ConstantesMundiales.r9 );
        outG.newLine();
        outG.write( "R10: " + ConstantesMundiales.r10 );
        outG.newLine();
        outG.write( "R11: " + ConstantesMundiales.r11 );
        outG.newLine();
        outG.write( "R12: " + ConstantesMundiales.r12 );
        outG.newLine();
        outG.write( "R13: " + ConstantesMundiales.r13 );
        outG.newLine();
        outG.write( "R14: " + ConstantesMundiales.r14 );
        outG.newLine();
        outG.write( "R15: " + ConstantesMundiales.r15 );
        outG.newLine();
        outG.write( "R16: " + ConstantesMundiales.r16 );
        outG.newLine();
        outG.write( "R17: " + ConstantesMundiales.r17 );
        outG.newLine();
        outG.write( "R18: " + ConstantesMundiales.r18 );
        outG.newLine();
        outG.write( "R19: " + ConstantesMundiales.r19 );
        outG.newLine();
        outG.write( "R20: " + ConstantesMundiales.r20 );
        outG.newLine();
        outG.write( "R21: " + ConstantesMundiales.r21 );
        outG.newLine();
        outG.write( "R22: " + ConstantesMundiales.r22 );
        outG.newLine();
        outG.write( "R23: " + ConstantesMundiales.r23 );
        outG.newLine();
        outG.write( "R24: " + ConstantesMundiales.r24 );
        outG.newLine();
        outG.write( "R25: " + ConstantesMundiales.r25 );
        outG.newLine();
        outG.close();
	}
	
}
