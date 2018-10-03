package Casos;
import java.io.IOException;

public class Caso2 {
	public static void main(String[] args) {
		/* Vamos a crear un subroceso para ejecutar un comando del sistema operativo: dir. Este
		 * comando no dispone de ejecutable los voy a lanzar utilizando el comando cmd: cmd/c dir 
		 */
		Runtime r = Runtime.getRuntime();
		Process p1 = null;
		
		try {
			p1 = r.exec("cmd /c dir");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 *  Voy a utlizar un método de la clase Process: waitFor()
		 *  este método devuelve un valor entero que indica si el 
		 *  subproceso se ejecutó correctamente: 0 si se ejecutó con
		 *  éxito y 1 si no se pudo ejecutar. Comprobamos que el comando 
		 *  no muestra en pantalla el resultado esperado. Esto es debido 
		 *  aq ue cuando un programa que muestra en pantall in
		 */
		
		int intVal = 0;
		
		try {
			intVal = p1.waitFor();
		} catch (InterruptedException e) {
			System.out.println("Valor de salida " + intVal);
			e.printStackTrace();
		}
	}
}
