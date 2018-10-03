package Casos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Caso3 {

	public static void main(String[] args) {
		/*
		 * Ejecutaremos el comando dir, consiguiendo que los datos se muestren en pantalla
		 */
		
		Runtime r = Runtime.getRuntime();
		Process p1 = null;
		
		try {
			p1 = r.exec("cmd /c dir");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* Mediante el método getInputStream() de la clase Process estamos reconduciendo 
		 * el flujo de datos o stream del proceso hijo(lo que escribe en pantalla) hacia 
		 * el proceso padre
		 */
		
		InputStream is = p1.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		String linea;
		
		try {
			while ((linea = br.readLine())!=null) {
				
				System.out.println(linea);
				 
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
