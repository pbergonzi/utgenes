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
		
		for (int i = 0; i < 100; i++) {
		
			Configuracion config = new ConfiguracionDefault();
			
			AlgoritmoGenetico maximoLocal = new AlgoritmoGenetico(config, Mundiales.class);
			
			Mundiales xyz = (Mundiales) maximoLocal.ejecutar();
			
			//Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe("Individuo final poblacion " + i+1 + ", Aptitud " + xyz.aptitud() + ": " + xyz.toString());
			/*
			try {
		        BufferedWriter outLogger = new BufferedWriter(new FileWriter("logger.txt"));
		        outLogger.write("----------------------------------------------------------");
		        outLogger.newLine();
		        outLogger.write("Individuo final poblacion " + i+1 + ", Aptitud " + xyz.aptitud() + ": " + xyz.toString());
		        outLogger.newLine();		        
		        outLogger.write("----------------------------------------------------------");

		        outLogger.close();
	        } catch (IOException e) {}
			*/
			ganadores.add(xyz);
		}
		
		try {
	        BufferedWriter out = new BufferedWriter(new FileWriter("ganadores.txt"));
	        out.write("----------------------------------------------------------");
	        out.newLine();
	        out.write("***** LOS GANADORES *****");
	        out.newLine();
	        
	        for (Mundiales individuo : ganadores) {
	        	out.write( "Aptitud:" + individuo.getNumeroAptitud() );
	        	out.write( individuo.toString() );        	
	        	out.write("----------------------------------------------------------");
	        }
	        out.write("----------------------------------------------------------");

            out.close();
        } catch (IOException e) {}
		
	}
	
}
