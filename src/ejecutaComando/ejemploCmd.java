package ejecutaComando;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejemploCmd {

	public static void main(String[] args) {
		/*Va a recibir un argumento desde la linea de comandos
		 * cuando se ejecute desde la consola, y será el subproceso
		 * que tiene que crear
		 */
		if(args.length == 0 ) {
			System.out.println("No se ha indicado el comando a ejecutar");
			System.exit(-1);
		} 
		Process p = null;
		int intVal = 0;
		try {
			 p = Runtime.getRuntime().exec(args);
			 String linea; 
			 BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			 while ((linea = br.readLine())!= null) {
				 System.out.println(linea);
			 }
			 intVal = p.waitFor();
				
			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido ejecuar. Código devuetlo: " + intVal);
		}
			
	}

}
