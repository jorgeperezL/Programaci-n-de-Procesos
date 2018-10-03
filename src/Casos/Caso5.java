package Casos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Caso5 {
	public static void main(String[] args) {
		/* Vamos a ejecutar un subproceso que precisa la entrada de datos dese el teclado
		 * y muestra imformmación por pantalla. Tenemos que capturar los streams o flujos 
		 * de datos que el subproceso envia a pantalla para mostaraarlos desde el proceso padre. 
		 * Desde el proceso padre le enviaremos el dato de la fecha capturando previamente el 
		 * stream de netrada del proceso hijo
		 */
		
		Runtime r = Runtime.getRuntime();
		Process p = null; 
		
		String comando = "cmd /c date";
		
		try {
			p = r.exec(comando);
			InputStream is = p.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			InputStream iser = p.getErrorStream();
			BufferedReader brer = new BufferedReader(new InputStreamReader(iser));
			
			OutputStream os = p.getOutputStream();
			
			os.write("22/09/2018".getBytes());
			os.flush();
			
			String linea;
			
			while((linea = brer.readLine())!=null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
