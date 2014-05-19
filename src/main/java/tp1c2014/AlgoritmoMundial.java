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
		
		for (int i = 0; i < 50; i++) {
		
			Configuracion config = new ConfiguracionDefault();
			
			AlgoritmoGenetico maximoLocal = new AlgoritmoGenetico(config, Mundiales.class);
			
			Mundiales xyz = (Mundiales) maximoLocal.ejecutar();
			
			ganadores.add(xyz);
		}
		
		try {
	        BufferedWriter outG = new BufferedWriter(new FileWriter("Ganadores_Resultados.txt"));
	        BufferedWriter outFA = new BufferedWriter(new FileWriter("Ganadores_FuncionesDeAptitud.txt"));
	        outG.write("************ LOS GANADORES *******************");
	        outG.newLine();
	        outFA.write("*********** VALORES DE APTITUD DE GANADORES **************");
	        outFA.newLine();
	        
	        int index = 0;
	        for (Mundiales individuo : ganadores) {
	        	
	        	outFA.write( individuo.getNumeroAptitud().toString()  );
	        	outFA.newLine();
	        	
	        	outG.write( "Ganador"  + index + "----" );
	        	outG.write( "Aptitud:" + individuo.getNumeroAptitud() );
	        	outG.write( individuo.toString() );        	
	        	outG.write("----------------------------------------------------------");
	        }       

            outG.close();
            outFA.close();
            
        } catch (IOException e) {}
		
	}
	
}
