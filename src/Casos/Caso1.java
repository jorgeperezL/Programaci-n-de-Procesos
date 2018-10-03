package Casos;
import java.io.IOException;

//Ejecuta el bloc de notas
public class Caso1 {

	public static void main(String[] args) {
		/*Vamos a usar la clase runTime para crear subprocesos
		 * Creamos un objeto de estas clase, que va a representar la
		 * aplicación en curso. Con el método exec() de esta clase se 
		 * podran crear subprocesos (podran ser generados a partis de 
		 * un ejecutable creado con cualquier enguaje de programación, 
		 * otra aplicación Java o un comando del sistema operativo
		 */
		
		Runtime r = Runtime.getRuntime();
		
		try {
			Process p = r.exec("notepad");
		} catch (IOException e) {
			System.out.println("No se ha podido crear el subproceso" 
					+ " para ejecutar la aplicación bloc de notas");
			e.printStackTrace();
		}
		//Tambien podemos utilizar la clase procesBuilder para crear subporcesos 
		ProcessBuilder ps = new ProcessBuilder("notepad");
		
		try {
			Process p2 = ps.start();
		} catch (IOException e) {
			System.out.println("No se ha podido crear el subproceso" 
					+ "para ejecutar la aplicación bloc de notas");
			e.printStackTrace();
		}
	}

}
